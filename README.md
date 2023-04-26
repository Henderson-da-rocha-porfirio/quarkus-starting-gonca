# rest-book

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

# Starting with Quarkus

## Book App

![VideoScreenshot--StartingwithQuarkusUdemy-0’17”](https://user-images.githubusercontent.com/46926951/233161733-b62bad3b-f515-42bb-a62a-501421b6c880.jpg)

---

## Quarkus DOCs:
- 1 - [ Site ](https://quarkus.io/)
- 2 - [ GitHub ](https://github.com/quarkusio/quarkus)
- 3 - [ Generate application ](https://code.quarkus.io/)

The different steps:

* Understand `Quarkus`,
* Check your development environment,
* Get your hands on Quarkus,
* Expose a `REST` endpoint using `JAX-RS`,
* Inject `beans` with `CDI`(CDI Java: É a Injeção de Dependência e Contextos (CDI), especificada por JSR-299, é parte integrante do Java EE 6 e fornece uma arquitetura que permite aos componentes do Java EE, como os servlets, enterprise beans e JavaBeans, existirem dentro do ciclo de vida de uma aplicação com escopos bem definidos.),
* Test the REST endpoint with `JUnit` and `RESTAssured`,
* Configure the application with MicroProfile Configuration
* Configure Quarkus,
* Add profiles to the configuration,
* Build executable `JARs`
* Build a native executable and a `Linux` executable with `GraalVM`,
* Check the performances of a Quarkus application,
* Containerize the application with Docker and execute it.

- Able to bootstrap, develop, package and execute a REST application, but most important, take Quarkus to your next project. 

---

## Content

* 1. [ Book App ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#book-app)
* 2. [ Docs ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#quarkus-docs)

* 1 - [ Quarkus ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#quarkus)
 
* 2 - [ Java Virtual Machine](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#virtual-machines)

* 3 - [ Quarkus Extensions](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#extensions)

* 4 - [ Quarkus Purpose ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#purpose)

* 5 - [ Install Tools ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#install-tools)

* 6 - [ Checking Up Enviroment Variables ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#enviroment-variables)

* 7 - [ Installing Visual Studio(build-tools-for-visual-studio-2019) ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#installing-build-tools-for-visual-studio-2019-install-before-graalvm)

* 8 - [ Installing GraalVM and Native-Image on Windows ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#installing-graalvm-install-after-build-tools-for-visual-studio-2019)

* 9 - [ Testing Installation - GraalVm and Native-Image ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#to-test-the-installation)

* 10 - [ Bootstraping The Application ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#bootstraping-the-application)

* 11 - [ Developer Joy -  easy to develop principle ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#developer-joy)

* 12 - [ Running the application ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#running-the-application) 

## Quarkus

![VideoScreenshot--StartingwithQuarkusUdemy-5’48”](https://user-images.githubusercontent.com/46926951/231878514-a8bb866f-4346-4a3c-a7bc-b00629292376.jpg)

---

### 1 - `Quarkus` is said to be: `SUPERSONIC SUBATOMIC JAVA`.

### `SUPERSONIC` - gives the idea of `speed`: 
- fast to `work` with so as a developer.
- Fast to `change` and `compiles` some code automatically. 
- Fast to `test` code immediately.
- Fast to `iterate`[¹](https://github.com/Henderson-da-rocha-porfirio/design-patterns-observer#-iterar) through coding and testing.
- Fast to build an executable jar ou binary with `graalVM`.
- Faster than other `Java Frameworks`.

### `SUBATOMIC` - gives the idea of `size`: 
- Everything is small.
- The size of the binary is way smaller, shorter than other `Java toolkits` when to build an executable `jar`. 
- It consume less memory.
- Optimized in terms of resource consumption.



---

### A. Rest: SuperSonic and SubAtomic - Time to 1º response

- [Doc](https://quarkus.io/guides/performance-measure)

![VideoScreenshot--StartingwithQuarkusUdemy-0’59”](https://user-images.githubusercontent.com/46926951/231885368-7820daa8-ac91-47ed-93bd-1ffcec8c5f23.jpg)

---


### B. Rest + CRUD: SuperSonic and SubAtomic - Time to 1º response

![VideoScreenshot--StartingwithQuarkusUdemy-1’09”](https://user-images.githubusercontent.com/46926951/231886234-7c23940a-400d-4fdb-8cfd-e3d0f630d98f.jpg)


---

### C. Rest: Memory Footprint

![VideoScreenshot--StartingwithQuarkusUdemy-2’07”](https://user-images.githubusercontent.com/46926951/231886949-4faddd9a-c38d-4bbf-8ca7-9ebe91cb2904.jpg)

---

### D. Rest + CRUD: Memory Footprint

![VideoScreenshot--StartingwithQuarkusUdemy-2’20”](https://user-images.githubusercontent.com/46926951/231887172-91116d09-b2b3-4ec6-9ca4-a978d86f3039.jpg)

---

### 2 - Quarkus is said to be too: A `Kubernetes Native Java stack` tailored for `OpenJDK HotSpot` and `GraalVM`, crafted from the best of breed Java libraries and standards.

- But can't need use `Kubernetes` with `quarkus`. However it comes with Kubernetes in mind.
- When it `Generate a project`, it comes with `Docker` files.
- `Docker images` and `Kubernetes` is easy to `create` , to `build` and to `run` with Quarkus.

## Virtual Machines

### 1. HotSpot

- `HotSpot` is a Java virtual machine for desktops and servers, maintained and distributed by Oracle Corporation. It introduces techniques such as just-in-time compilation and adaptive optimization designed to improve performance.

### 2. GraalVM

- `GraalVM` is a Java VM and JDK based on HotSpot/OpenJDK, implemented in Java. It supports additional programming languages ​​and execution modes such as early compilation of Java applications for fast startup and low memory consumption.

## Extensions

- Mechanism: [Building My First Extension](https://quarkus.io/guides/building-my-first-extension)

![VideoScreenshot--StartingwithQuarkusUdemy-6’34”](https://user-images.githubusercontent.com/46926951/231879088-cc05b8c5-7b01-4307-bed0-73945fb9b5b9.jpg)

---

- GitHub: [Extensions](https://github.com/quarkusio/quarkus/tree/main/extensions)

![VideoScreenshot--StartingwithQuarkusUdemy-7’15”](https://user-images.githubusercontent.com/46926951/231881826-8a54206d-3571-4678-97b5-b8fe2e2722ce.jpg)

---


## Purpose

- Pushes `Java` to the `Cloud`.

### Density of Java Applications

- JVM is heavy in terms of deep space, resources and memory if it compare to other platforms like NodeJS or Go:

![VideoScreenshot--StartingwithQuarkusUdemy-2’56”](https://user-images.githubusercontent.com/46926951/231888655-62c8bc2b-1dc8-4036-a32f-d117113304ec.jpg)


---

- The purpose of `Quarkus` is to bring back the same `density` in the `java space`:

![VideoScreenshot--StartingwithQuarkusUdemy-3’23”](https://user-images.githubusercontent.com/46926951/231888984-571dc25d-f095-470e-8b54-c922e326e524.jpg)

---


## Install Tools

- 1 - [ Java ](https://www.oracle.com/java/technologies/downloads/)
- 2 - [ GraalVM ](https://www.graalvm.org/)
- 3 - [ Intellij ](https://www.jetbrains.com/idea/download/#section=windows)
- 4 - [ Maven ](https://maven.apache.org/download.cgi)
- 5 - [ Docker ](https://www.docker.com/)
- 6 - [ Visual Studio(build tools) ](https://github.com/Henderson-da-rocha-porfirio/quarkus-starting-gonca#installing-build-tools-for-visual-studio-2019-install-before-graalvm)

## Enviroment Variables

- 1 -  Java: - `echo %JAVA_HOME%`
- 2 - GraalVM - `echo %GRAALVM_HOME%`
- 3 -  Intellij 
- 4 -  Maven - `mvn -v`
- 5 -  Docker - `docker -v`

## Installing Build Tools for Visual Studio 2019 (Install before GraalVm)

- a. create variable:
````
Variable Name: MSVC_VARS
Variable Value: C:\Program Files (x86)\Microsoft Visual Studio\2019\BuildTools\VC\Auxiliary\Build\vcvars64.bat
````
---

- b. Installing Microsoft Build Tools for Visual Studio 2019

- 1. In a web browser window, go to [ Download Oldest versions ](https://visualstudio.microsoft.com/pt-br/vs/older-downloads/) 

![image](https://user-images.githubusercontent.com/46926951/232642438-a306a55e-26ba-4142-b5a1-e2e82d922041.png)

---

- 2. or or for the new one [aqui](https://visualstudio.microsoft.com/pt-br/downloads/)

- 3. Scroll down and open the `Tools for Visual Studio 2019` section:

![image](https://user-images.githubusercontent.com/46926951/232643376-445cc354-75dc-4c33-90d5-04c0dccdcd7d.png)

---

- 4. Find Build Tools for Visual Studio 2019 and click Download.

![image](https://user-images.githubusercontent.com/46926951/232643459-b8e86740-d726-4d4e-ace5-1ddcd9012867.png)

---

- 5. Locate the installer file, likely in your `Downloads`.
- 6. `Right-click` on the file and `Run as Administrator`.
- 7. The `Visual Studio Installer` will launch and open:

![image](https://user-images.githubusercontent.com/46926951/232643533-54f565fc-a69f-409e-8895-2b71db921356.png)

---

![image](https://user-images.githubusercontent.com/46926951/232644011-c14ce57c-a098-404e-aaf0-210941aed9b9.png)

---

- 7. Click `Continue`.
- 8. Does not require the `full installation` of Visual Studio Build Tools. The only `Workload`
that you need to select is C++ build tools:

![image](https://user-images.githubusercontent.com/46926951/232644155-944f146f-cada-44ce-86e8-16d4c98f6905.png)

---

- 9. We also do not need all of the `Optional components`. Under Installation Details, we can remove
Optional components so that we are left only installing the following (sdk 10 or sdk 11):

![image](https://user-images.githubusercontent.com/46926951/232644367-3e54026d-f19a-4ce5-8026-7cfe9b65c427.png)

---

- 10. Click Install.
- 11. Once the installation is complete, you will need to `restart your system` to finish the setup.

- 12. Open Developer Command Prompt on Windows

![image](https://user-images.githubusercontent.com/46926951/232646635-da762d95-baa3-498b-b131-d366df84d59c.png)

---

![image](https://user-images.githubusercontent.com/46926951/232646463-bccafe61-e0ba-4f48-a31d-ccb2caa3fc72.png)

---

## Installing GraalVM (Install after Build Tools for Visual Studio 2019)

- a. [ Installing in Windows ](https://www.graalvm.org/latest/docs/getting-started/windows/)
- b. [ Donwload Versions ](https://github.com/graalvm/graalvm-ce-builds/releases)
- c. Download the selected version and unzip it in the Java folder that should be in Program Files. Ex: `C:\Program Files\Java`.

![image](https://user-images.githubusercontent.com/46926951/232639326-26e8ffd5-b83b-4d0e-9946-468570960c45.png)

---

- d. create two variables:
````
Variable Name: GRAALVM_BIN
Variable Value: C:\Program Files\Java\graalvm-ce-java17-22.3.1\bin
````
---
````
Variable Name: GRAALVM_HOME
Variable Value: C:\Program Files\Java\graalvm-ce-java17-22.3.1
````
---

- e. Path: `%GRAALVM_HOME%\bin`. And put the grall and java homes at the top after `%SystemRoot%`:

![image](https://user-images.githubusercontent.com/46926951/232640054-5eb175cd-33a3-4d98-907e-4378047d7f38.png)

---

- checando através do comando para ver a versão Java:

* `java -version`

![image](https://user-images.githubusercontent.com/46926951/233153961-abfd76d6-1042-4bcd-91de-8108e13e8649.png)



- f. Check if `gu.cmd` or `gu` is within: `C:\Program Files\Java\graalvm-ce-java17-22.3.1\bin`:

![image](https://user-images.githubusercontent.com/46926951/232645273-613b41c0-7126-4f58-a815-09f3e675b841.png)

---

- g. Check the version of the `gu`:

````
Command: gu.cmd --version

Response: GraalVM Updater 22.3.1
````

or

````
Command: .\gu.cmd --version

Response: `GraalVM Updater 22.3.1`
````
--- 

- h. Check if native-image is installed:

````
Command native-image --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````

or

````
native-image.cmd --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````
--- 

- i. Otherwise, install native-image in the `C:\Program Files\Java\graalvm-ce-java17-22.3.1\bin` folder
````
gu.cmd install native-image
````
- j. Again Check the version of the `gu`:
````
Command native-image --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````

or

````
native-image.cmd --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````
--- 

- k. Check `GRAALVM_HOME` in the system:
````
Command: "%GRAALVM_HOME%"\bin\native-image.cmd --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````

- l. Check `GRAALVM_BIN` in the system:
````
Command: "%GRAALVM_BIN%"\native-image.cmd --version

Response: GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
````

## To test the installation

* 1 - `Compile`(cp == compile) the file that is in the testing-graalvm folder called: `HelloWorld.java`:
````
"%GRAALVM_BIN%"\javac -cp . HelloWorld.java
````
- Answer: create `HelloWorld.class` inside the same directory.

* 2 - `Compiling` HelloWorld with native-image:
````
"%GRAALVM_BIN%"\native-image.cmd -cp . HelloWorld ./my_java_app
````

* 3 - Run the app: `my_java_app.exe` or `.\my_java_app`

* 4 - IF YOU GET AN ERROR: check if you have already created the variable: `MSVC_VARS` with `C:\Program Files (x86)\Microsoft Visual Studio\2019\BuildTools\VC\Auxiliary\Build\vcvars64.bat`
and check at the prompt: `"%MSVC_VARS%"`

* 5 - Check the `Path` on Windows if desired: echo `%PATH%

* 6 - If the installation is `successful`, something like this will appear:

![image](https://user-images.githubusercontent.com/46926951/232650083-af167cc7-0658-44c8-a5b6-308d51160f0e.png)

--- 

![image](https://user-images.githubusercontent.com/46926951/232650376-7856dc10-f8f7-47ee-9dfa-11c9490de24f.png)

---

## Bootstraping The Application

- `Bootstrapping` is the action of starting something on your own. When something starts and prepares the environment for what matters to run, it's a boot process.

- Options:

* [ Quarkus Tools Plugin to Intellij ](https://plugins.jetbrains.com/plugin/13234-quarkus-tools)

![image](https://user-images.githubusercontent.com/46926951/233172725-cbf0f204-cd29-47ef-a797-e269a721a778.png)

---

* [ Quarkus Maven Plugin ](https://quarkus.io/guides/quarkus-maven-plugin)

````
Commandd: mvn -U io.quarkus:quarkus-maven-plugin:create
````
or
````
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.6.Final:create \
    -DprojectGroupId=my-groupId \
    -DprojectArtifactId=my-artifactId
    
````
or `CLI`:
````
quarkus create app my-groupId:my-artifactId
````
or example of the `Book App`: 
````
mvn io.quarkus.platform:quarkus-maven-plugin:create \
    -DprojectGroupId=org.agoncal.quarkus.starting \
    -DprojectArtifactId=rest-book
    -DclassName="org.agoncal.quarkus.starting.BookResource" \
    -Dpath="/api/books" \
    -Dextensions="restease-jsonb"
    
````
---

* [ Quarkus - Generate Application Online ](https://code.quarkus.io/)

Choose one of the two to work with Endpoints:

![image](https://user-images.githubusercontent.com/46926951/233168419-e6a47db5-bc20-4c9b-983d-994e09d784fb.png)

---

* [ Jhipster - Generate more complex applications ](https://www.jhipster.tech/)

---

### Quarkus Maven Directory Structure once bootstrapped:

![image](https://user-images.githubusercontent.com/46926951/233173637-15289c71-e5b5-4352-99b8-8c78e3ffa131.png)

---

### Quarkus Bom
- `quarkus-universe-bom`: is a type of pom. This is in pom.xml
- Have all versions of all the extensions supported by Quarkus. And don't have to define the versioning again.

## Developer Joy

![VideoScreenshot--StartingwithQuarkusUdemy-1’27”](https://user-images.githubusercontent.com/46926951/234432594-1477352b-2c79-41bd-b284-ae746b8794b7.jpg)


## Running the application

### Running the application in dev mode

You can run your application in dev mode that enables live coding using:

### Executing in Development Mode:
````
mvn quarkus:dev
````

or wrapper:

````shell script
./mvnw compile quarkus:dev
````

- Application Running on port `8080`


### Maven Test
````shell script
./mvnw test
````

- Test Running on port `8081`

### Invoking REST Endpoint with cURL or Browser:
````
curl http://localhost:8080/api/books
````


> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.


### Running for README.md in Intellij:

* 1 - Selecionar o ícone:

![image](https://user-images.githubusercontent.com/46926951/234694644-7e6f1557-a487-4a9e-9a03-2e6bc79360e2.png)

* 2 - To Click

- 1. in Maven:

![image](https://user-images.githubusercontent.com/46926951/234695071-ec6ef82c-17c1-4496-8a2c-a143525d750a.png)

or

- 2. in Maven Wrapper:

![image](https://user-images.githubusercontent.com/46926951/234695244-7474ce3d-7361-4b3a-be93-0642ff470a3c.png)


### Packaging and running the application

- The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

- The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

### Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

```shell script
./mvnw verify -Pnative
```

Or, if you don't have `GraalVM` installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

- You can then execute your native executable with: `./target/rest-book-1.0.0-SNAPSHOT-runner`

- If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

### Running Success:

![image](https://user-images.githubusercontent.com/46926951/234695593-3d36de3a-be4d-471d-b5b9-3694e57b8696.png)


### Related Guides

- Provided Code

- RESTEasy Reactive

- Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
