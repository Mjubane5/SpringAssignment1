# 🎓 Course Management REST API

## 📌 Project Overview
This project is a Spring Boot REST API developed for our Object-Oriented Programming module (Assignment 1). The application serves as a backend system for managing university courses, demonstrating core concepts of enterprise Java development, including MVC architecture, database integration, and strict input validation.

The project is divided into two main components:
* **Part A:** A static endpoint returning predefined course categorizations (Foundation, Undergraduate, Honours).
* **Part B:** A fully functional CRUD (Create, Read, Update, Delete) API backed by an in-memory database, complete with data integrity constraints.

---

## 👥 Team Members & Contributions
This project was developed collaboratively using a Git feature-branch workflow to prevent merge conflicts and ensure code stability.

* **Member 1: Mpilwenhle Jubane** - Project initialization, application architecture, and static endpoint routing.
* **Member 2: Abahle Mati** - Entity modeling (`Course.java`) and H2 Database configuration.
* **Member 3: Lugayeni Anele** - Service layer implementation and business logic separation.
* **Member 4: Kamva Fetumani** - REST Controller (`POST` and `GET` mappings).
* **Member 5: Sisanda Gcuma** - REST Controller (`PUT` and `DELETE` mappings).
* **Member 6: Ovayo Kani** - JSR-380 Data Validation and exception handling integration.

---

## 🛠️ Technology Stack
* **Language:** Java (JDK 17+)
* **Framework:** Spring Boot 3.x
* **Web Layer:** Spring Web (Embedded Tomcat server)
* **Persistence:** Spring Data JPA / Hibernate
* **Database:** H2 Database (In-Memory)
* **Validation:** Jakarta Bean Validation (Hibernate Validator)
* **Build Tool:** Maven

---

## 🚀 Setup & Installation
Because this project utilizes an in-memory H2 database, no external database installation (like MySQL or PostgreSQL) is required. The database spins up automatically when the application starts.

1. **Clone the repository:**
   ```bash
   git clone
**https://github.com/Mjubane5/SpringAssignment1**
   cd SpringAssignment1
