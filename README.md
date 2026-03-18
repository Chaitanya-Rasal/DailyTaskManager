# 🚀 Daily Task Manager (Core Java + JDBC)

A console-based multi-user **Task Management System** built using **Core Java and JDBC**, designed with a layered architecture (DAO + Service). This application allows users to manage daily tasks efficiently with authentication and session handling.

---

## ✨ Features

* 🔐 User Registration & Login (Authentication System)
* 👤 Session Management (User-specific operations)
* 📋 Add, View, Update, Delete Tasks (CRUD)
* ✅ Mark Tasks as Completed
* ⚡ Task Priority (High / Medium / Low)
* 📅 Due Date Management
* 🔎 View only logged-in user's tasks
* 🔄 Logout functionality

---

## 🏗️ Project Architecture

```
User (Console UI)
        ↓
Service Layer (Business Logic)
        ↓
DAO Layer (Database Operations)
        ↓
MySQL Database
```

---

## 📁 Project Structure

```
DailyTaskManager/
│
├── src/
│   ├── com.taskmanager.main/
│   │      └── MainApp.java
│   │
│   ├── com.taskmanager.model/
│   │      ├── Task.java
│   │      └── User.java
│   │
│   ├── com.taskmanager.dao/
│   │      ├── TaskDAO.java
│   │      ├── TaskDAOImpl.java
│   │      ├── UserDAO.java
│   │      └── UserDAOImpl.java
│   │
│   ├── com.taskmanager.service/
│   │      ├── TaskService.java
│   │      ├── TaskServiceImpl.java
│   │      ├── UserService.java
│   │      └── UserServiceImpl.java
│   │
│   ├── com.taskmanager.util/
│   │      ├── DBConnection.java
│   │      └── SessionManager.java
│
└── lib/
       └── mysql-connector.jar
```

---

## 🗄️ Database Setup

### Create Database

```sql
CREATE DATABASE taskdb;
USE taskdb;
```

### Users Table

```sql
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(100)
);
```

### Tasks Table

```sql
CREATE TABLE tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    title VARCHAR(100),
    description VARCHAR(255),
    status VARCHAR(20),
    priority VARCHAR(20),
    due_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
```

---

## ⚙️ Technologies Used

* ☕ Core Java
* 🔗 JDBC (Java Database Connectivity)
* 🗄️ MySQL
* 🧠 OOP Concepts
* 🏗️ Layered Architecture (DAO + Service)

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/DailyTaskManager.git
```

2. Open project in Eclipse

3. Add MySQL Connector JAR to Build Path

4. Configure database credentials in:

```
DBConnection.java
```

5. Run:

```
MainApp.java
```

---

## 🧠 Key Concepts Implemented

* JDBC (Connection, PreparedStatement, ResultSet)
* Session Management in Console Application
* DAO Design Pattern
* Exception Handling
* Multi-user Data Handling using Foreign Keys

---

## 🔮 Future Enhancements

* 🔐 Password Encryption (Hashing)
* 🔍 Search & Filter Tasks
* 📊 Task Analytics Dashboard
* 🖥️ GUI using JavaFX / Swing
* 🌐 Convert to REST API (Spring Boot)

---

## 👨‍💻 Author

**Chaitanya Rasal**

---

## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!
