# 🎓 University Course Management REST API

[![Language: Java 17](https://img.shields.io/badge/Language-Java_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Framework: Spring Boot 3](https://img.shields.io/badge/Framework-Spring_Boot_3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![Database: H2](https://img.shields.io/badge/Database-H2_In--Memory-4479A1?style=for-the-badge&logo=database)](https://h2database.com/)

### 📖 Project Overview
This project is a fully functional, full-stack Spring Boot REST API developed for our **CSC313: Object-Oriented Programming (Assignment 1)** module. It serves as a backend system for managing university modules, built with industry-standard architecture, strict data validation, and a dynamic frontend interface.

---

### ✨ Key Features Built
* **Full CRUD Operations:** Complete RESTful endpoints to Create, Read, Update, and Delete university courses.
* **Smart Frontend UI:** A clean, responsive HTML/JS web interface that prevents user errors via dynamic dropdowns and smart auto-filling categories.
* **Strict Data Validation:** Implementation of Jakarta Bean Validation (`@NotBlank`, `@Size`, `@Min`) to ensure complete database integrity before persistence.
* **Global Exception Handling:** Custom `@RestControllerAdvice` to cleanly format validation errors and prevent ugly server stack traces.
* **Automated Database Seeding:** A custom `CommandLineRunner` script that pre-loads standard university courses upon server startup for seamless testing.
* **Swagger UI Integration:** Auto-generated, interactive API documentation utilizing OpenAPI.

---

### 🤝 The Development Team
This system was engineered collaboratively using a Git feature-branch workflow.
* **Mpilwenhle Jubane** - Project initialization, application architecture, and static endpoint routing.
* **Abahle Mati** - Entity modeling (`Course.java`) and H2 Database configuration.
* **Lugayeni Anele** - Service layer implementation and business logic separation.
* **Kamva Fetumani** - REST Controller (`POST` and `GET` mappings).
* **Sisanda Gcuma** - REST Controller (`PUT` and `DELETE` mappings).
* **Ovayo Kani** - JSR-380 Data Validation and exception handling integration.

---

### 🚀 Quick Start Guide
Because this project utilizes an in-memory H2 database, no external database installation is required. It works completely out of the box.

**1. Clone the repository:**
```bash
git clone https://github.com/Mjubane5/SpringAssignment1.git
cd SpringAssignment1
```

**2. Build and run the project:**
```bash
mvn clean install
mvn spring-boot:run
```

**3. Access the Application:**
Once the server states `Tomcat started on port 8080`, you can access the following environments in your browser:
* **The Web Interface:** `http://localhost:8080`
* **Interactive API Docs (Swagger):** `http://localhost:8080/swagger-ui.html`
* **H2 Database Console:** `http://localhost:8080/h2-console`

---

### 📡 API Endpoint Reference

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/courses/info` | Retrieves a static, hardcoded map of categorized department courses. |
| `GET` | `/api/courses` | Retrieves a dynamic list of all courses currently saved in the database. |
| `POST` | `/api/courses` | Creates and saves a new course (subject to `@Valid` constraints). |
| `PUT` | `/api/courses/{id}` | Updates an existing course by its database ID. |
| `DELETE` | `/api/courses/{id}` | Removes a course from the database by its ID. |