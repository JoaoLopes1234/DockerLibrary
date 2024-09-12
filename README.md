Library Web App
Introduction 

The Library Web App is a simple Spring Boot application for managing books. This application demonstrates the use of Spring Boot with Thymeleaf templates to create a web interface for basic CRUD operations on a list of books. The application is configured to run without a database and uses an in-memory list to store book data.

Features:
- View a list of books
- Add a new book
- Edit an existing book
- Delete a book

How to run:
 - Java 8+
 - Maven
 - Docker (optional for running in a container)

1º - git clone https://github.com/JoaoLopes1234/DockerLibrary.git

2º - cd DockerLibrary.git

3º - mvn clean package

4º - java -jar target/Library-0.0.1.jar

Using Docker:
5º - docker build -t library-app .
6º - docker run -p 8081:8081 library-app

Ckeck it: http://localhost:8081/books
