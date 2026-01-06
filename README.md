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

## Amazon Delivery System (Loose Coupling)
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

## Day 1: Java Collections Basics

This day focuses on understanding the fundamentals of the Java Collections Framework,
including core interfaces and commonly used implementations with simple examples.

### Topics Covered

### List vs Set vs Map
- List allows duplicate elements and maintains insertion order
- Set does not allow duplicates
- Map stores data in key-value pairs

This example demonstrates how different collection types behave based on data storage needs.

### ArrayList vs LinkedList
- ArrayList provides faster access by index
- LinkedList performs better in insertion and deletion operations

The example highlights structural and performance differences.

### Key Learnings
- Clear understanding of Collection interfaces
- Practical difference between List, Set, and Map
- Performance comparison of ArrayList and LinkedList

## Day 2: Java Collections – Maps & Iteration

### 🔹 Topics Covered

### HashMap vs TreeMap
- Implemented HashMap and TreeMap using a real-world Passport records example.
- Demonstrated key-value storage and searching using containsKey() and get().
- Explained ordering behavior:
- HashMap does not guarantee any order.
- TreeMap maintains sorted order based on keys.
- Highlighted performance and use-case differences.

### Folder:
HashMap_vs_TreeMap

---

### Iterator vs ListIterator vs For-Each Loop
- Implemented and compared:
- Iterator
- ListIterator
- Enhanced for-each loop
- Demonstrated:
- Forward and backward traversal
- Safe and unsafe modification during iteration
- Fail-fast behavior of Iterator and for-each loop
- Fail-safe behavior using CopyOnWriteArrayList
- Explained ConcurrentModificationException with practical examples.

### Folder:
Iterator_vs_ListIterator_ForEachLoop

---

###  Key Learnings
- Practical understanding of Java Map implementations
- Clear difference between fail-fast and fail-safe iteration
- When to use Iterator, ListIterator, or for-each loop
- Importance of choosing the right collection based on requirements

---
## Comparable vs Comparator in Java

This project demonstrates sorting of complex objects in Java using both  
Comparable and Comparator interfaces.

---

### Example 1: Comparable (Natural Ordering)

- Cricketer class implements Comparable
- Sorting is based on age
- Uses compareTo() method
- Suitable when only one natural sorting logic is required

### Key Point
> Comparable is used when a class has a single, default sorting order.

---

### Example 2: Comparator (Multiple Sorting Strategies)

- Separate Comparator implementations:
- AgeComparator
- NameComparator
- AvgComparator
- Uses compare() method
- Allows multiple sorting strategies without modifying the main class

### Key Point
> Comparator follows the Strategy Pattern and supports multiple sorting logics.

---

### Concepts Covered
- Comparable vs Comparator
- Collections.sort()
- Strategy Pattern
- Object comparison
- Clean OOP design principles

---
### Output
- Sort by age
- Sort by name
- Sort by average

> Each topic includes runnable examples with comments for clarity.

# Upcoming Topics
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
