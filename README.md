# Employee Management API
A RESTful Employee Management API built with Java and Spring Boot.
This project demonstrates a layered backend architecture using Spring Web,
Spring Data JPA, PostgreSQL, DTOs, service abstractions, and repository
patterns.
> This is a learning project built to strengthen my experience with strongly
> typed backend development, Spring Boot, REST API design, and relational
> database integration.
---
## Features
- Create an employee
- Retrieve an employee by ID
- Retrieve all employees
- Update an employee
- Delete an employee
- PostgreSQL persistence
- JPA/Hibernate ORM
- DTO-based API responses
- Entity/DTO mapping
- Resource-not-found handling
- Docker Compose PostgreSQL setup
---
## Tech Stack
- **Java 24**
- **Spring Boot 3.5.3**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Maven**
- **Lombok**
- **Docker Compose**
- **JUnit 5 / Spring Boot Test**
---
## Architecture
The application follows a layered backend architecture:
```text
HTTP Request
     │
     ▼
Controller
     │
     ▼
Service
     │
     ▼
Repository
     │
     ▼
PostgreSQL

## DTOs are used at the API boundary and mapped to and from JPA entities:

EmployeeDto
     ↕
EmployeeMapper
     ↕
Employee

## Project Structure

src/main/java/com/codewithtegzy/store/
├── controller/
│   └── EmployeeController.java
├── dto/
│   └── EmployeeDto.java
├── entity/
│   └── Employee.java
├── exception/
│   └── ResourceNotFoundException.java
├── mapper/
│   └── EmployeeMapper.java
├── repository/
│   └── EmployeeRepository.java
├── service/
│   ├── EmployeeService.java
│   └── impl/
│       └── EmployeeServiceImpl.java
└── EmployeeCrudApp.java

⸻

## API Endpoints

Base URL:

/api/employee

Method	Endpoint	Description
POST	/api/employee	Create an employee
GET	/api/employee/{id}	Get an employee by ID
GET	/api/employee	Get all employees
PUT	/api/employee/{id}	Update an employee
DELETE	/api/employee/{id}	Delete an employee

Create Employee

POST /api/employee
Content-Type: application/json
{
  "firstName": "Benjamin",
  "lastName": "Omoraka",
  "email": "benjamin@example.com"
}

⸻

## Data Model

The application uses an Employee entity mapped to the
employees PostgreSQL table.

Employee
├── id
├── firstName
├── lastName
└── email

The email field is configured as:

* Non-null
* Unique

⸻

## Error Handling

The application defines a custom:

ResourceNotFoundException

When an employee cannot be found, the application returns an HTTP
404 Not Found response.

⸻

## Running the Project

Prerequisites

* Java 24
* Docker
* Docker Compose

1. Clone the repository

git clone https://github.com/Tegzy-cmd/CRUD-app-with-spring-boot.git
cd CRUD-app-with-spring-boot

2. Start PostgreSQL

docker compose up -d

3. Configure the database

Configure the required database connection through your local environment.

Do not commit database passwords, API keys, or other secrets to the
repository.

4. Run the application

Using the Maven wrapper:

./mvnw spring-boot:run

On Windows:

mvnw.cmd spring-boot:run

⸻

## Testing

The project includes Spring Boot test configuration and a context-loading
test to verify that the application context starts successfully.

Run:

./mvnw test

⸻

## Engineering Concepts Demonstrated

This project was built to strengthen practical experience with:

* Object-oriented programming
* Layered backend architecture
* REST API design
* Dependency injection
* DTOs and entity mapping
* Repository abstractions
* JPA/Hibernate
* Relational database persistence
* Exception handling
* Strongly typed backend development

⸻

## Status

Learning project — built as part of my continued development with
Java and Spring Boot.
