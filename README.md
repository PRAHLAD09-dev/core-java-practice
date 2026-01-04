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

# Exception Handling in Java

This module demonstrates Java Exception Handling concepts using
real-world scenarios with custom exceptions and retry mechanisms.

## Concepts Covered
- Checked Exceptions  
- Custom Exception Classes  
- throw vs throws  
- Multiple catch blocks  
- Exception propagation  
- Retry logic using loops  

---

## Example 1: Bank Login System (Retry & Block)

### Scenario
- User must enter valid credentials / details  
- Only 3 attempts are allowed  
- After 3 failed attempts → account gets blocked  

### Key Learnings
- Creating and throwing custom exceptions  
- Handling failures using try-catch  
- Implementing retry logic  
- Controlling application flow after exceptions  

---

## Example 2: Age Verification System (RTO Case)

### Scenario
A user applies for a license:
- Age must be between 18 and 60  
- Below 18 → UnderAgeException  
- Above 60 → OverAgeException  
- User gets maximum 3 attempts  

### Key Learnings
- Business-rule based exception handling  
- Custom exception messages  
- Exception propagation with throws  
- Clean separation of input, validation, and control flow  

### Folder Structure
-exception-handling/
├── LaunchEH1.java        // Bank login example
├── LaunchEH2.java        // RTO age validation

# Java Collections Practice

This repository contains hands-on Java examples for understanding
the Java Collections Framework with practical demos.

## Day 1
- List vs Set vs Map
- ArrayList vs LinkedList

## Upcoming
- HashMap vs TreeMap
- Iterator vs ListIterator vs for-each
- Comparable vs Comparator

> Each topic includes runnable examples with comments for clarity.

# Upcoming Topics
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
