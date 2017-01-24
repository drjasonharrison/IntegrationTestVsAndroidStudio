# IntegrationTestVsAndroidStudio
Sample project to demonstration issue with Integration Tests and Android Studio

# Requires: 
- Gradle build tool: https://gradle.org/
```
------------------------------------------------------------
Gradle 3.3
------------------------------------------------------------

Build time:   2017-01-03 15:31:04 UTC
Revision:     075893a3d0798c0c1f322899b41ceca82e4e134b

Groovy:       2.4.7
Ant:          Apache Ant(TM) version 1.9.6 compiled on June 29 2015
JVM:          1.8.0_111 (Oracle Corporation 25.111-b14)
OS:           Mac OS X 10.11.6 x86_64
```
- Gradle Java plugin https://docs.gradle.org/current/userguide/java_plugin.html
- Gradle TestSets plugin: https://github.com/unbroken-dome/gradle-testsets-plugin
- Spring Framework: https://projects.spring.io/spring-framework/
- Java 1.7
- Android Studio 2.2.3

# Issue description:
When the integration tests are moved from under the unit test folder to the IntegrationTest folder 
they no longer build or run through Android Studio.

# Steps to reproduce:
## Command line:
1. Clone or download the repository
2. Use the command line to build and run the tests: gradle clean build
3. Note that all of the tests built and ran.

## Android Studio
1. Launch Android Studio and select File>New>Import Project
2. Navigate to the build.gradle file
3. If the Gradle Sync popup appears, press the Cancel button to manually set the path of a local Gradle distribution

## Demonstration of working gradle task from within Android Studio
1. Open the "Gradle projects tool": View>Tool Windows>Gradle
3. Press the "Execute Gradle Task" button (Gradle projects tool window, green dot surrounded by green circle)
4. In the "Run Gradle Task" dialog enter in the "Command line" field '''clean build'''
4. Press the OK button
5. Note that the project builds the project and runs all of the tests

## Demonstration of broken Android Studio task:
1. In Android Studio, navigate to the file src/integrationTest/java/hello/HelloWorldIntegrationTests.java
2. Note that the imports are not found, and the Spring Framework annotations are also not defined (displayed in red)
3. Drag the HelloWorldIntegrationTests.java and HelloWorldIntegrationTests-context.xml file to src/test/java/hello
4. Note that the imports are found, and the Spring Gramework annotations are defined

## Possible explanations:
- incompatibility between Gradle 2.14 (Android Studio gradle plugin) and Gradle 3.3
- classpath not being set correctly for integration tests
- some other issue.
