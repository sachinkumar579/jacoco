# jacoco

Spring boot project with a very basic utility file containing a method to add 2 numbers

The goal with this project is to explain how Unit tests can be written using testing
framework and how Jacoco plugin can be used to generate reports from these unit tests

- Java version 1.8 ( Yeah because I am still living in the 90's)
- Spring boot 2.5.3 (Yeah got the latest one there)
- jacoco-maven-plugin 0.8.7 (Who cares) 
- spring-boot-starter-test for writing Unit tests. Gives you Junit Jupiter , Mockito 

And thats it. Your Spring boot project with nice unit test reports will be up in seconds ! 

Go into jacoco directory and run mvnw package in the command prompt

It will create the executable jar file in target directory . Go into target directory and run java -jar jacoco-0.0.1-SNAPSHOT.jar 

You just ran a spring boot app that did absolutely nothing !

Now go back to jacoco directory and run command mvnw clean test . This will run all tests added under src/test/java and create the report in target/site/jacoco/index.html

Go open that html file in a browser and voila you have the unit test report. Is that 100% ? 
