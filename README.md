# API Documentation using Swagger 3 with Spring Boot 3 + Spring Security

Want to document your APIs for the spring boot 3 application? Well, it’s pretty simple using Open API specification.

# What is Open API Specification?
Open API Specification is a standard API description format for Rest APIs.

# What is Swagger?
Swagger is an open-source tool provided by SmartBear to implement this specification. It can help you to design, build, document, and consume your Rest APIs.

# springdoc-openapi
Springdoc-openapi is a library that integrates with the Spring Boot framework to automatically generate OpenAPI documentation for REST APIs. It allows developers to describe their API endpoints and models using annotations and generates an OpenAPI specification in either JSON or YAML format.

# Spring Boot Swagger 3 Maven dependency
# – For Spring Boot 3:
To use Swagger 3 in your Maven project, you need to add the springdoc-openapi-starter-webmvc-ui dependency to your project’s pom.xml file:

<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.0.3</version>
</dependency>

# Run and Check
Run Spring Boot project. Open browser with url:
http://localhost:9006/swagger-ui/index.html

# You can see:


<img width="834" alt="Spring boot" src="https://user-images.githubusercontent.com/23189762/235297024-17ca7f4d-e68f-4212-91ea-a84001d4626b.PNG">


# In Postman




<img width="637" alt="Postman  Man" src="https://user-images.githubusercontent.com/23189762/235297156-5f25e2f0-2bdc-4748-aeef-23e63cb7cb02.PNG">

