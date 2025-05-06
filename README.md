# 🧩 Project: Java Utilities - Level 1

## 📌 Description

This project consists of two exercises focused on using generic and non-generic classes in Java. The goal is to practice working with parameterized types and demonstrate the flexibility of the language when handling different data types:

### 🧪 Exercise 1 - `NoGenericMethods`
Create a class named `NoGenericMethods` that stores three arguments of the same type. The class should include methods to store and retrieve these objects, as well as a constructor to initialize them. You should verify that the arguments can be passed in any order to the constructor.

### 🧬 Exercise 2 - `GenericMethods`
Create a `Persona` class with the attributes `name`, `surname`, and `age`. Then, implement a class `GenericMethods` that has a generic method which accepts three arguments of any type and prints them to the screen. In the `main()` method, test this generic method with different types of arguments such as a `Persona` object, a `String`, and a primitive type—proving that it can handle any type in any order.

---

## 💻 Technologies Used

- **Java 24**
- **IntelliJ IDEA** 
- Standard Java features:
  - Generics
  - Generic methods
  - Constructor overloading
  - Primitive and object types

---

## ⚙️ Requirements

- JDK 17 or higher
- IDE like IntelliJ IDEA, Eclipse, NetBeans or use of command line

---

## 🛠️ Installation

1. Clone this repository or copy the files to your local environment:
      ```bash
    git clone https://github.com/AlvaroLMC/1.6-Generics-Level1.git

  Open the project in your preferred IDE.

  Make sure to configure the Java SDK version 17 or higher.

---

## 🚀 Execution

 - Navigate to Main.java or create a main class to test the code.

 - Run the main class from your IDE or terminal.

 - Check the console output:

 - For NoGenericMethods: it will display the stored objects and their order.

 - For GenericMethods: it will print any type of parameter passed to the generic method (Persona, String, Boolean, etc.).
