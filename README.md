# car-rental-and-login-in-java
This is a project dealing with a car rental system and a login system using java
Car Rental System

Project Overview

The Car Rental System is a console-based Java application designed to manage car rentals for a rental agency. The system supports functionalities for adding cars and customers, renting and returning cars, and viewing rental transactions.

Table of Contents

Features

Technologies Used

Project Structure

Getting Started

Usage

Sample Data

Testing

Future Enhancements

License

Features

Car Management: Add and list available cars.

Customer Management: Register and list customers.

Car Rental: Rent a car and record rental transactions.

Car Return: Return a car and mark it as available.

Rental Transactions: View details of completed and active transactions.

Technologies Used

Java 8+

JUnit (for testing)

Gradle (for dependency management)

Project Structure

CarRentalSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── stem/
│   │   │   │   ├── CarRentalSystem.java
│   │   │   │   ├── rentalAgency.java
│   │   │   │   ├── car.java
│   │   │   │   ├── customer.java
│   │   │   │   ├── rentalTransaction.java
│   └── test/
├── build.gradle
└── README.md

Getting Started

Prerequisites

Java 8+ installed

Gradle installed

Clone the Repository

$ git clone <repository-url>
$ cd CarRentalSystem

Build the Project

$ gradle build

Run the Application

$ gradle run

Usage

The system provides a menu-based interface with the following options:

1. View Available Cars

Lists all the available cars.

2. Rent a Car

Prompts the user to enter:

Customer ID, name, and phone number

Car number plate

Confirmation of payment

If the car is available, the transaction is recorded.

3. Return a Car

Allows the user to enter the car's number plate and mark it as returned.

4. View Customers

Displays a list of all registered customers.

5. View Transactions

Lists all recorded rental transactions, including rental and return dates.

6. Exit

Exits the application.

Sample Data

The system includes pre-loaded sample data for demonstration purposes:

Cars: Various models of cars with unique number plates.

Customers: A list of customers with names, phone numbers, and IDs.

   #Login System Program Documentaion
   1. Introduction
   This java program shows a simple login system that prompts a user to enter the username and password. The system allows up to three attempts to eneter  the correct credentials. Passwords inpit is displayed with astericks (*) for security.

   2. #Features 
   i. username and password authentication
   ii. Password marking with *
   iii. Three login attempts

   3. #How to run the program
      1 .Open the project in VSCode or any java IDE
      2. Compile the program
         javac LoginSystem.java

     3. Run the program
        java LoginSystem    

        4. #SAMPLE OUTPUT
        Successful Login
        Enter username: admin
Enter password: *****
Welcome back!

5. #Failed Login
Enter username: admin
Enter password: *****
Wrong username or password ! Attempts left : 2;


