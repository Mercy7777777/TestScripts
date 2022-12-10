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

# add <build> dependency on EvoSuite
build = root.find(namespace + "build")
if build == None:
    build = ET.SubElement(root, namespace + "build")
plugins = build.find(namespace + "plugins")
if plugins == None:
    plugins = ET.SubElement(build, namespace + "plugins")

jacocoPlugin = ET.fromstring(
  "            <plugin>\
            <groupId>org.jacoco</groupId>\
            <artifactId>jacoco-maven-plugin</artifactId>\
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
                        <formats>CSV</formats>\
                        <outputDirectory>${project.build.directory}/jacoco-ut</outputDirectory>\
                    </configuration>\
                </execution>\
            </executions>\
            </plugin>"
  
)
plugins.append(jacocoPlugin)


doc.write("pom.xml", encoding="UTF-8", xml_declaration=True)
