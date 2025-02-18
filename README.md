## Spring api CRUD.


<div align="justify"> This is a study API, designed to provide a foundation for learning and experimenting. It is still under development and therefore may contain bugs or incomplete functionality. Please use it with caution and feel free to make suggestions or report problems.</div>



### Technologies.
---
JAVA
> <div align="justify">Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle) in the early 1990s. It is a platform-independent language that allows the creation of cross-platform applications that can run on various operating systems, including Windows, MacOS, and Linux. </div>

MAVEN
> <div align="justify">Maven is a build automation tool primarily used in Java projects. It is similar to the Ant tool, but it is based on different concepts and works in a different way. It is also used to build and manage projects written in C#, Ruby, Scala and other languages. The Maven project is hosted by the Apache Software Foundation, which was part of the former Jakarta Project. </div>

GIT
> <div align="justify">Git is one of the most widely used version control systems in the software development world. It is an open source project developed in 2005 by Linus Torvalds, the creator of the Linux kernel.</div>

MYSQL
> <div align="justify"> MySQL is a database management system, which uses the SQL language as an interface. It is currently one of the most popular database management systems from Oracle Corporation</div>

DOCKER
> <div align="justify"> Docker is an open source platform that facilitates the creation and administration of isolated environments. It makes it possible to package an application or environment within a container, making it portable to any other host that has Docker installed. So you can build, deploy, copy and migrate from one environment to another with greater flexibility. The idea of Docker is to upload only one machine, instead of several. And, on that single machine, you can run multiple applications without any conflicts between them.</div>

POSTMAN
> <div align="justify"> Postman is a tool that supports the documentation of requests made by the API. It has an environment for documentation, execution of API tests and requests in general.By using it, you will be able to work with APIs more efficiently, building requests quickly, and you will also be able to save them for later use, in addition to being able to analyze the responses sent by the API.</div>

> <div align="justify"> </div>

### Safety
---
JWT
> <div align="justify"> JSON Web Token (JWT) is an open standard (RFC 7519) for transmitting security information, such as authentication and authorization, through a encoded string. These information can be verified and trusted because they are digitally signed. JWT consists of three parts: header, payload, and signature. The header contains information about the encoding and signature of the JWT, the payload contains security information, such as the user and permissions, and the signature is used to ensure the integrity of the information. JWT is widely used in web and mobile applications for user authentication and authorization. </div>

Spring Security
> <div align="justify"> Framework that provides authentication and authorization for Java-based applications. It is built on top of the Spring Framework and integrates with it seamlessly. Spring Security provides a wide range of features, including authentication and authorization, access control, password encoders, and security-related HTTP headers. It also supports various authentication methods such as basic authentication, form-based authentication, and token-based authentication. Additionally, Spring Security also supports integration with external authentication providers such as LDAP and OAuth. It is highly configurable and customizable, and can be easily integrated with other Spring modules such as Spring MVC and Spring Data.</div>

### Patterns and architectures.
---
REST
> <div align="justify">(Representational State Transfer) is an architectural style for building web services. It is based on a client-server model, where the client makes requests to the server, which then responds with the requested information. RESTful web services are built using the principles of REST, and use HTTP methods like GET, POST, PUT, and DELETE to retrieve or manipulate data. RESTful web services are lightweight, easy to implement, and can be easily consumed by a wide range of clients, including web browsers, mobile apps, and other servers.</div>

RESTfull
> <div align="justify">(Refers to a web service that adheres to the principles of REST (Representational State Transfer). A RESTful web service is designed to be lightweight, easy to implement, and easy to consume. It uses standard HTTP methods (such as GET, POST, PUT, and DELETE) to retrieve or manipulate data, and uses a simple, standard format (such as JSON or XML) to represent the data. RESTful web services are often preferred over other types of web services because they are easy to understand and use, and are supported by a wide range of clients and servers.</div>

VO design pattern
> <div align="justify">(The Value Object (VO) design pattern is a type of software design pattern that is used to represent a value object. A value object is an object that represents an entity with immutable data, such as a date or a currency. These objects are used to represent application data and are typically passed as parameters between layers or between objects. In general, value objects do not have behavior, they are just data containers. They are comparable to each other and comparable to other value objects based on their value.</div>

JSON
> <div align="justify">JSON is the acronym for Javascript Object Notation — or Object Notation in Javascript, in free translation. It's a file format, basically. Systems in the most varied languages use these files for manipulation and transfer of almost all types of data. Most of them are currently capable of converting data contained in JSON to structured objects in the language itself.In general, the codes of a JSON file are intended for better readability by people when storing, programming the transfer and modification of objects — and other sets of data. </div>

### Avoiding Bugs

---
CORS 
> <div align="justify">Cross-Origin Resource Sharing is a W3C specification that defines how browsers should handle requests for resources from different origins. It allows a server to configure which resources can be accessed by a different origin site, and how those resources can be accessed. This is important for security, as it prevents malicious websites from accessing sensitive data from other websites without permission.</div>

Browsers make use of the same origin policy, a resource from a site can only be used by another if they are in the same domain; same protocol, same port and same address.

Here cors has been configured in two ways globally and per controler. In the controller it can be marked as @CrossOrigin or activated by verb ; just mark each operation with @CrossOrigin(origins = "http:localhost:8080") this method was used in Person's controller.

Globally, the cors tag is created in application.yml. In webconfig, the variable and the corsmap are defined.

### Best practices
---

| Practice | Summary | example |
|--- |--- |--- |
| Pagination | column 2 | column 3 |
| Filters | row 2 column 2 | row 2 column 3 |
| Keep information cash | row 2 column 2 | row 2 column 3 |
| Fault tolerance | row 2 column 2 | row 2 column 3 |
| Connectivity | row 2 column 2 | row 2 column 3 |
| Timeouts and notifications | row 2 column 2 | row 2 column 3 |
| Documentation | row 2 column 2 | row 2 column 3 |
| Security | row 2 column 2 | row 2 column 3 |
| Self service | row 2 column 2 | row 2 column 3 |
| Tests | row 2 column 2 | row 2 column 3 |
| Allow exports in the most used formats | row 2 column 2 | row 2 column 3 |
| Notifications | row 2 column 2 | row 2 column 3 |
| I18N | row 2 column 2 | row 2 column 3 |
| Limit fields | row 2 column 2 | row 2 column 3 |
