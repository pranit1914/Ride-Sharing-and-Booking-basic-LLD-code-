# 🚕 Uber OOP Console Application (Java)

## 📌 Overview

This project is a **console-based Uber-like ride booking system** built using **Java and OOP concepts**.

It simulates:

* User login
* Ride booking
* Driver assignment
* Fare calculation based on vehicle type

The goal of this project is to understand **Object-Oriented Programming (OOP)** and basic **Low-Level Design (LLD)**.

---

## 🚀 Features

### 👤 User Module

* User enters:

  * Name
  * Pickup location
  * Destination
  * Mobile number

### 🔐 Login System

* Simple login validation using:

  * Email
  * Password

### 🚗 Driver Module

* Drivers have:

  * Name
  * Vehicle type (CAR / BIKE)
  * Availability status
* System assigns the **first available driver**

### 💳 Payment System

* Uses **Abstraction**
* Supports:

  * Car payment
  * Bike payment
* Fare calculated based on:

  * Distance
  * Vehicle type
  * Passenger count

---

## 🧠 OOP Concepts Used

### ✅ Encapsulation

* Private variables with controlled access

### ✅ Abstraction

* `Payment` abstract class defines common behavior

### ✅ Inheritance

* `CarPayment` and `BikePayment` extend `Payment`

### ✅ Polymorphism

* Runtime decision of payment type:

```java
Payment payment = new CarPayment(...);
```

---

## 🏗️ Project Structure

```text
Main
│
├── User
├── UserLogin
├── Driver
├── Ride
├── RideService
│
├── Payment (abstract)
│   ├── CarPayment
│   └── BikePayment
```

---

## ▶️ How to Run

1. Compile the program:

```bash
javac Main.java
```

2. Run the program:

```bash
java Main
```

---

## 🧪 Sample Flow

```text
Enter EmailId:
admin@gmail.com

Enter Password:
1234

Passenger Name:
Samarth

Pickup Location:
Pune

Destination:
Mumbai

Driver Assigned: Ravi

Enter vehicle type:
CAR

Enter distance:
10

Passengers:
3

Total Fare: 120
```

---

## ⚠️ Limitations

* Uses static driver data (no database)
* Basic login validation (hardcoded credentials)
* Driver matching is simple (first available)
* No real-time location tracking

---

## 🔮 Future Improvements

* Add **driver matching based on location**
* Implement **pricing strategy pattern**
* Add **multiple users and drivers using ArrayList**
* Integrate **database (MySQL / MongoDB)**
* Build **REST API using Spring Boot**
* Create **frontend (React.js)**

---

## 🎯 Learning Outcome

By building this project, you understand:

* How to model real-world systems using OOP
* How abstraction and polymorphism work in practice
* Basics of system design (LLD thinking)

---

## 👨‍💻 Author

**Samarth P**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and improve it further 🚀
