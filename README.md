# Pay_Roll-JDBC :

# 💼 Employee Payroll Management System

A beginner-friendly **Java JDBC Web Application** that allows admin users to manage employee records and generate salary reports.This project demonstrates the integration of **Java Servlets, JDBC, MySQL, and HTML/CSS** to build a complete web-based CRUD application with authentication.

It provides a structured approach to handling backend operations along with a clean and simple user interface.
The application also showcases real-world concepts like session management and data-driven decision making through reports.

## 🚀 Features
* 🔐 Admin Login Authentication
* ➕ Add New Employee
* 📋 View Employee List
* ✏️ Update Employee Details
* ❌ Delete Employee
* 📊 Salary Analytics Report (Total, Avg, Max, Min)
* 🔓 Logout Functionality
* 🎨 Responsive & Professional UI Design

## 🛠️ Technologies Used
* **Java (Servlets & JDBC)**
* **MySQL Database**
* **HTML5 & CSS3**
* **Apache Tomcat Server**

## 🗂️ Project Structure
EmployeePayroll/

│── src/main/java/com/Employee/
│ ├── DBConnection.java
│ ├── LoginServlet.java
│ ├── AddEmployeeServlet.java
│ ├── ViewEmployeeServlet.java
│ ├── UpdateEmployeeServlet.java
│ ├── DeleteEmployeeServlet.java
│ ├── SalaryReportServlet.java

│── src/main/webapp/
│ ├── login.html
│ ├── dashboard.html
│ ├── addEmployee.html
│ ├── report.html
│ ├── index.html

## 🧑‍💻 Demo Login
Username: admin
Password: admin123

## ⚙️ Database Setup
This project uses a **MySQL database** to store employee and admin details.
You need to create a database and configure your credentials inside `DBConnection.java` before running the project.

## ▶️ How to Run the Project
* Clone the repository
* Import project into Eclipse / IntelliJ
* Configure Apache Tomcat Server
* Start the server
* Open browser and go to:
  `http://localhost:8080/ProjectName/index.html`

## 🎯 Learning Outcomes
* JDBC Connectivity
* CRUD Operations
* Servlet Handling (GET/POST)
* Session Management
* MVC Basics
* Frontend + Backend Integration

## 📌 Future Improvements
* Role-based login (Admin/User)
* Password encryption
* Pagination for employee list
* REST API version
* UI framework (Bootstrap)

## 🙌 Acknowledgement
This project is built for learning purposes and demonstrates basic concepts of Java web development.

## 📎 License
This project is open-source and free to use for learning.
