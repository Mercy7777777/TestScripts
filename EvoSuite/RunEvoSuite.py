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

projects = ["https://github.com/byhieg/JavaTutorial"]
    # "https://github.com/devopshydclub/vprofile-project",
#"https://github.com/ronmamo/reflections", 
#"https://github.com/VerbalExpressions/JavaVerbalExpressions",
#"https://github.com/spdx/tools"]

for project in projects:
    os.system("git clone " + project + ".git")
    dir = project.split('/')[-1]
    os.chdir(dir)

    doc = ET.parse("pom.xml")
    root = doc.getroot()

    os.system('echo "******adding dependencies to pom.xml******"')

    # add <dependency> on org.evosuite and junit
    dependencies = root.find(namespace + "dependencies")
    if dependencies == None:
        dependencies = ET.SubElement(root, namespace + "dependencies")

    flag = False
    for dependency in root.findall("dependency"):
        if dependency.find('groupId').text == 'junit':
            rank = float(dependency.find('version').text)
            if rank < 4.12:
                dependency.set('version', '4.12')
            flag = True
    if flag == False:
        newEle = ET.fromstring(
            "<dependency>\n\
                    <groupId>junit</groupId>\n\
                    <artifactId>junit</artifactId>\n\
                    <version>4.12</version>\n\
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
    jacocoPlugin = ET.fromstring(
      "<plugin>\
        <groupId>org.jacoco</groupId>\
        <artifactId>jacoco-maven-plugin</artifactId>\
        <version>0.8.0</version>\
        <executions>\
          <execution>\
            <id>pre-unit-test</id>\
            <goals>\
              <goal>prepare-agent</goal>\
            </goals>\
            <configuration>\
              <destFile>${project.build.directory}/coverage-reports/jacoco-ut.exec</destFile>\
              <propertyName>surefireArgLine</propertyName>\
            </configuration>\
          </execution>\
          <execution>\
            <id>post-unit-test</id>\
            <phase>test</phase>\
            <goals>\
              <goal>report</goal>\
            </goals>\
            <configuration>\
              <dataFile>${project.build.directory}/coverage-reports/jacoco-ut.exec</dataFile>\
              <outputDirectory>${project.reporting.outputDirectory}/jacoco-ut</outputDirectory>\
            </configuration>\
          </execution>\
        </executions>\
      </plugin>"
    )
    plugins.append(jacocoPlugin)

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
"""
    os.system('echo "******begin downloading dependencies******"')
    os.system("mvn evosuite:help")

    os.system('echo "******begin evosuite generating******"')
    os.system("mvn evosuite:generate")
"""
#    os.system('echo "******information of generated tests by EvoSuite******"')
#    os.system("mvn evosuite:info")

#    os.system('echo "******exporting all tests to src/test/java******"')
#    os.system("mvn evosuite:export")

#    os.system('echo "******run mvn tests******"')
#    os.system("mvn test")

#     os.chdir("..")
