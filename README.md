# jacoco

Spring boot project with a very basic utility file containing a method to add 2 numbers

The goal with this project is to explain how Unit tests can be written using testing
framework and how Jacoco plugin can be used to generate reports from these unit tests

- Java version 1.8 ( Yeah because I am still living in the 90's)
- Spring boot 2.5.3 (Yeah got the latest one there)
- jacoco-maven-plugin 0.8.7 (Who cares) 
- spring-boot-starter-test for writing Unit tests. Gives you Junit Jupiter , Mockito 

And thats it. Your Spring boot project with nice unit test reports will be up in seconds ! 

- $ git clone https://github.com/sachinkumar579/jacoco.git
- $ cd jacoco
- $ mvnw clean test
- view report at ‘target/site/jacoco/index.html’

Go open that html file in a browser and voila you have the unit test report. Is that 100% ? 
