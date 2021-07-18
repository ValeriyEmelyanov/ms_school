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
* Spring Cloud Netflix Zuul
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
* [direct access to the teacher service - get all teachers: http://localhost:8801/all](http://localhost:8801/all)
* [get the teacher with id 3: http://localhost:8080/teacher/3](http://localhost:8080/teacher/3)
* [accessing the teacher service through the gateway: http://localhost:8080/teacher/all](http://localhost:8080/teacher/all)
* [get students for the teacher with id 3: http://localhost:8080/teacher/3/students](http://localhost:8080/teacher/3/students)
* [direct access to the stdent service - get all students: http://localhost:8802/all](http://localhost:8802/all)
* [accessing the student service through the gateway: http://localhost:8080/student/all](http://localhost:8080/student/all)
* [just ping the student service: http://localhost:8080/student](http://localhost:8080/student)
* [get the student with id 3: http://localhost:8080/student/3](http://localhost:8080/student/3)
* [get students for the teacher with id 3: http://localhost:8080/student/all/teacher/3](http://localhost:8080/student/all/teacher/3)
