# Library Management System (JDBC Project)

- This project is a Java-based Library Management System that utilizes JDBC (Java Database Connectivity) to manage 
  book records, user data, and library transactions. It offers essential features such as book issue/return, user registration, 
  and fine management using a connected MySQL database.

🖥️ Developed and tested using NetBeans IDE for easier project management, built-in JDBC support, and seamless GUI development 
   (Swing integration).

** Open it in NetBeans playtform as it contains codelines that it is exclusively meant for running it in the same platform. 
** Those codelines prevent the project form running in other platform like Eclipse IDE, etc.

🚀 Features:
- 🔍 Search Books by title, author, or ID
- 📖 Issue & Return Books with automatic due date and fine calculation
- 👤 User Registration & Authentication
- 📚 Add/Remove/Edit Book Records
- 📊 View Issued Books and Transaction History

🛠️ Technologies Used:
- Java(Swing)
- JDBC API
- MySQL for database management
- SQL for queries and database design
- NetBeans IDE for development and testing

🧠 Learning Outcomes:
	- Hands-on experience with JDBC and database interaction in Java
	- Implementing CRUD operations and prepared statements
	- Understanding exception handling and modular programming
	- Gaining insight into real-world system design
	
📌 Future Enhancements:
	- Cloud-Based System – Access library anywhere, auto backups.
	- AI-Powered Recommendations – Personalized book suggestions.
	- RFID & IoT Automation – Smart book tracking, self-checkout.
	- Mobile App Integration – Online book reservations, QR scanning.
	- Blockchain Security – Secure transactions & digital book ownership.
	- Voice-Activated Search – Google Assistant/Alexa integration.
	- Advanced User Analytics – Reading trends & book demand insights.
	- Multi-Language Support – Library for diverse users.

** Before importing and running the project you should follow the instructions below:

⚙️ Setup Instructions:

1. Clone the repository:
	>>> git clone https://github.com/Pritanshu5000/alms-java-jdbc-netbeans.git
	
2. Import the folder as a Java project and Open the project folder in NetBeans Application platform.

3. Go to src -> com -> cgu -> ConnectionProvider -> ConnectMySQL.java and follow the next step.

4. Set up the MySQL database:
	- A "DatabaseAndTables.sql" file is already in the directory to create the database and tables. so there is no 
	  need to create database and tables manually in MySQL platform.
    - Update your database connection settings in DBConnection.java:
		- String DB_URL = "jdbc:mysql://localhost:3306/advance_lms";
		- String DB_USER = "root";
		- String DB_PASSWORD = "Enter your MySQL password";
		
5. For Libraries, if not available you should download the .jar files & other relevant files right-click on the project -> click on properties -> go to Libraries -> click Add JAR file and then add the following:
	- jcalendar-1.4.jar or newer version
	- mysql-connector-j-9.1.0.jar or newer version
	- rs2xml.jar or newer version
	- AbsoluteLayout.jar or newer version
	- JDK 23 (Default) - by default the file of this version or any other version installed in your device should 
	                     be present in the library.

6. Run the project in NetBeans:
	- Right-click the project and select Run or press Shift + F6.

** For further reference, read the report and ppt in the repository.	
