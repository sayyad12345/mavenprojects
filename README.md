🚗 Driving License Registration System
A console-based application developed using Java, JDBC, PostgreSQL, and Maven, designed to register applicant details for driving licenses and store them securely in a database.

🧰 Technologies Used
Core Java – For application logic and object-oriented programming concepts.

JDBC (Java Database Connectivity) – For seamless interaction with the PostgreSQL database.

PostgreSQL – As the backend database to store applicant data.

Maven – For efficient dependency and project management.

File I/O – For handling text-based input/output operations when needed.

📦 Project Structure
css
Copy
Edit
drivinglicense/
│
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
├── pom.xml
⚙️ Database Setup
Run the following SQL query to create the necessary table:

sql
Copy
Edit
CREATE TABLE IF NOT EXISTS applicants (
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    address VARCHAR(100),
    vehical VARCHAR(100),
    date VARCHAR(100)
);
✅ Make sure your PostgreSQL server is running and the database is configured correctly.

✨ Features
📥 Register applicant data for a new driving license.

✏️ Update or modify existing details.

👁️ View all stored applicant records.

🗄️ Data is stored persistently using PostgreSQL.

📄 Dependencies
All required dependencies (like PostgreSQL JDBC driver) are managed via Maven and declared in the pom.xml file.

Example:

xml
Copy
Edit
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.2</version>
</dependency>
👨‍💻 Created By
Abdulraheman Mahamad Sayyad

Amankhan Khalil Pathan
