# Simple School microservices
Simple Java Microservices using Spring Boot and Spring Cloud.

### Description
The School Microservice Ecosystem has the following components:
* Eureka Server - the Service Discovery Registry 
  where the Microservices needs to register
* Student Microservice - the first Microservice for our School Application.
* Teacher Microservice - the second Microservice for our School Application.
* School Gateway - This use Netflix Zuul 
  to enable Routing Logic for the School Application.
  This is the entry point to Microservice ecosystem 
  and it route the request to the relevant Microservice 
  based on the configured routing paths.


### Tools and Technologies Used
* Java 11
* Maven
* Spring Boot web
* Spring Cloud Netflix Eureka Server
* Spring Cloud Netflix Eureka Client
* Spring Cloud Gateway
* Spring Cloud OpenFeign
* Spring Data JPA
* H2 Embedded Database
* Lombok

### Running application
Start:
1. eureka
2. schoolgateway
3. student
4. teacher

Urls:
* [the page of eureka server: http://localhost:8761/](http://localhost:8761/)
* [direct access to the teacher service - get all teachers: http://localhost:8801/](http://localhost:8801/)
* [accessing the teacher service through the gateway: http://localhost:8080/teachers](http://localhost:8080/teachers)
* [get the teacher with id 3: http://localhost:8080/teachers/3](http://localhost:8080/teachers/3)
* [get students for the teacher with id 3: http://localhost:8080/teachers/3/students](http://localhost:8080/teachers/3/students)
* [direct access to the stdent service - get all students: http://localhost:8802/](http://localhost:8802/)
* [accessing the student service through the gateway: http://localhost:8080/students](http://localhost:8080/students)
* [just ping the student service: http://localhost:8080/students/info](http://localhost:8080/students/info)
* [get the student with id 3: http://localhost:8080/students/3](http://localhost:8080/students/3)
* [get students for the teacher with id 3: http://localhost:8080/students/teachers/3](http://localhost:8080/students/teachers/3)

### Useful links
* [SYSOUT tutorial: Spring Cloud API Gateway](https://sysout.ru/spring-cloud-api-gateway/)
* [Spring Docs: Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/)
* [Best Practices for Building Rest Microservices with Spring Boot](https://codeburst.io/spring-boot-rest-microservices-best-practices-2a6e50797115)