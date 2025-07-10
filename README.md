# Driving License Registration System
A console-based student management system using Java, JDBC, PostgreSQL, file I/O, and Maven.


The Driving License Registration System is a console based application used for the register the aplicants detail for the driving license and store the all data in the database.

# Technologies Used
* Core Java: For application logic and OOP concepts.
* JDBC (Java Database Connectivity): For connecting and interacting with the PostgreSQL database.
* PostgreSQL: For storing student data
* Maven: For managing project dependencies.

# Dependencies

The project required  dependencies are in pom.xml.

# Project Structure
drivinglicense/
│
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── driving/
│   │   │       ├── dbconnect.java
│   │   │       ├── drvinglicenes.java
│   │   │       └── Main.java
│   │   └── resources/
│   ├── test/
│   │   ├── java/
│   │   └── resources/
│
├── target/                
├── Maven Dependencies/
└── JRE System Library/



# database setup/Queries

   "CREATE TABLE IF NOT EXISTS " + tableName + " ("
    + "name VARCHAR(100) NOT NULL, "+
    +  "age INT NOT NULL, "
    + "address VARCHAR(100), "
    + "vehical VARCHAR(100), "
    + "date VARCHAR(100))";

# features
* register the all data.
* Update and chage data is possible.
* view all deatails.

@ Created by:
1. Abdulraheman Mahamad Sayyad.
2. Amankhan Khalil Pathan.
