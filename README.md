# The source code of this project is upgraded to spring boot 3.2.1 and jwt 0.12.3
You can find the changes in the latest commit:
https://github.com/RameshMF/springboot-blog-rest-api/commit/10b214fd898ea8e4270a178e59eca86dddedaa5b

## Change in the SpringSecurity config class
Removed deprecated csrf() method:
```
http.csrf(csrf -> csrf.disable())
```
## Changed spring Boot version:
From:
```
		<version>3.0.0</version>
```
To:
```
		<version>3.2.1</version>
```
## Changed MySQL driver name:
```
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
```
## Changed JWT dependencies version:
From:
```
			<version>0.11.5</version>
```
To:
```
			<version>0.12.3</version>
```
# Changed the method from parserBuilder() to parser() in JwtTokenProvider
From:
```
Jwts.parserBuilder()
```
To:
```
Jwts.parser()
```

# Source code of Bestseller Udemy Course - Building Real-Time REST APIs with Spring Boot
Learn how to build real-time REST APIs with Spring Boot by building a complete Blog App.

This course supports Spring Boot 3+, Spring Security 6+

Reach out to me for a discount coupon at javaguides.net@gmail.com

Udemy Course Link - [Building Real-Time REST APIs with Spring Boot - Blog App](https://www.udemy.com/course/building-real-time-rest-apis-with-spring-boot/?referralCode=6312172DF8B8C2C11F5E)

# What you'll learn in this course?
- Learn how to build great REST APIs for Blog App using Spring Boot, Spring Security, JWT, Spring Data JPA (Hibernate), MySQL database
- Learn REST basics - Resource, Sub-resource, URI, HTTP methods, HTTP status codes
- Learn how to build CRUD REST APIs
- Learn how to build REST APIs for Pagination and Sorting
- Learn how to build REST APIs for Login/Signin and Signup
- Learn how to use Lombok
- Learn how to use DTOs
- Learn Spring boot REST API exception handling 
- Learn Spring boot REST API validation
- Learn how to use Spring security in the Spring boot project
- Learn Spring Security In-memory and DB authentication and authorization
- Learn how to secure REST APIs (role-based security)
- Learn how to write query methods using Spring Data JPA
- Learn one-to-many and many-to-many JPA mappings 
- Learn how to test REST APIs using Postman REST Client
- Learn What is JWT and How it Works
- Learn How to configure JWT ( JSON Web Token) in Spring Security
- Learn how to secure REST APIs using JWT
- Learn how to use JWT with Login API
- Learn versioning REST APIs
- Learn Important 4 versioning REST API strategies
- Deploy Spring Boot Blog App on AWS Cloud
- Learn Docker
- Learn Spring and Spring Boot Annotations
- Interview QA
