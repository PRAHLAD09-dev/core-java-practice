# Core Java Practice
 This repository contains my Core Java practice code covering fundamental OOP concepts with clear, real-world examples.
 
# Encapsulation
- Private data members
- Constructor initialization
- Getters for controlled access
- toString() override
- Real-world example: BankAccount
- Folder: encapsulation/

# Inheritance
- Parent–child relationship
- Code reuse using extends
- Real-world example: Vehicle → Car / Bike
- Folder: inheritance/

# Polymorphism
- Runtime polymorphism using method overriding
- Parent reference holding child object
- Same method call, different behavior at runtime
- Real-world example: Payment system (UPI / Credit Card / Net Banking)
- Folder: polymorphism/

# Abstraction
- Abstract class used to define common payment structure
- Abstract method enforces implementation in child classes
- Parent reference used to achieve runtime polymorphism
- Real-world example: Payment system (UPI / Credit Card / Net Banking)
- Folder: abstraction/

# Interface
- Interface used for complete abstraction
- Runtime selection of implementation using user input
- Loose coupling via service class
- Real-world example: Notification system
- Folder: interface/
 
# Abstract vs Interface
- Abstract class is used when objects share state and behavior
- Interface is used to define capabilities that multiple unrelated classes can implement
- Abstract supports constructors and instance variables
- Interface supports multiple inheritance

# Amazon Delivery System (Loose Coupling)
This project demonstrates **loose coupling in Java** using a real-world
Amazon delivery example.

### Concepts Used
- Interface
- Runtime Polymorphism
- Dependency Injection
- Loose Coupling
- Clean Architecture

### Flow
User selects a delivery partner (FedEx / BlueDart/Delhivery).
Amazon depends only on the interface, not concrete classes.

### Key Advantage
New delivery partners can be added without modifying Amazon class.

# Upcoming Topics
- Exception Handling
- Collections Framework
- Multithreading
- Stream API

## Tech Stack
- Java
- VS Code
- Git & GitHub
  
## Structure
- Each folder represents a single Core Java / OOP concept
- Concepts are implemented independently for better clarity
- Examples are simple, readable, and focused on learning
- Emphasis on core Java fundamentals and real-world logic

## Purpose
 This repository is created to strengthen my Core Java and OOP fundamentals through hands-on practice  and real-world examples.

 This repository will be continuously updated as I progress further in Core Java.
