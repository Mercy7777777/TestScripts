from pprint import pprint
import xml.etree.ElementTree as ET
import os

ET.register_namespace("", "http://maven.apache.org/POM/4.0.0")
ET.register_namespace("xsi", "http://www.w3.org/2001/XMLSchema-instance")
ET.register_namespace(
    "schemaLocation",
    "http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd",
)
namespace = "{http://maven.apache.org/POM/4.0.0}"
doc = ET.parse("pom.xml")
root = doc.getroot()

os.system('echo "******adding dependencies to pom.xml******"')

# add <dependency> on org.evosuite and junit
dependencies = root.find(namespace + "dependencies")
if dependencies == None:
    dependencies = ET.SubElement(root, namespace + "dependencies")
newEle = ET.fromstring(
    "<dependency>\n\
            <groupId>junit</groupId>\n\
            <artifactId>junit</artifactId>\n\
            <version>4.9</version>\n\
            <scope>test</scope>\n\
        </dependency>"
)
dependencies.append(newEle)


# add <build> dependency on EvoSuite
build = root.find(namespace + "build")
if build == None:
    build = ET.SubElement(root, namespace + "build")
plugins = build.find(namespace + "plugins")
if plugins == None:
    plugins = ET.SubElement(build, namespace + "plugins")
newPlugin = ET.fromstring(
    "<plugin>\n\
                <groupId>org.evosuite.plugins</groupId>\n\
                <artifactId>evosuite-maven-plugin</artifactId>\n\
                <version>1.0.6</version>\n\
            </plugin>"
)
plugins.append(newPlugin)

# add <pluginRepositories>
pluginRepositories = root.find(namespace + "pluginRepositories")
if pluginRepositories == None:
    pluginRepositories = ET.SubElement(root, namespace + "pluginRepositories")
pluginRepository = ET.fromstring(
    "<pluginRepository>\n\
            <id>EvoSuite</id>\n\
            <name>EvoSuite Repository</name>\n\
            <url>http://www.evosuite.org/m2</url>\n\
        </pluginRepository>"
)
pluginRepositories.append(pluginRepository)

doc.write("pom.xml", encoding="UTF-8", xml_declaration=True)

os.system('echo "******begin downloading dependencies******"')
os.system("mvn evosuite:help")

os.system('echo "******begin evosuite generating******"')
os.system("mvn evosuite:generate")

os.system('echo "******information of generated tests by EvoSuite******"')
os.system("mvn evosuite:info")

os.system('echo "******exporting all tests to src/test/java******"')
os.system("mvn evosuite:export")

os.system('echo "******run mvn tests******"')
os.system("mvn test")
