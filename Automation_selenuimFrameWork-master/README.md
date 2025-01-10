# Automation Testing Framework for Automation Exercise Website

This repository contains an automation testing framework designed to test the functionality of the [Automation Exercise website](https://automationexercise.com/) based on the [test cases provided](https://automationexercise.com/test_cases).

---

## Key Features

### 1. Design Pattern
- **Page Object Model (POM)**: Ensures modularity and maintainability of the code by separating the elements and actions of each page into dedicated classes.

### 2. Technologies Used
- **Programming Language**: Java
- **Frameworks and Tools**: Selenium WebDriver, TestNG
- **IDE**: IntelliJ IDEA

---

## Framework Structure

### **Main**: Selenium Framework
This contains the core implementation of the framework, including the following components:
- **BrowserActions**: Generic browser interaction methods.
- **Assertions**: Custom assertions for validating test results.
- **Utilities**: Reusable utility functions.
- **Config**: Configuration files and utilities for managing settings.
- **DriverManager**: WebDriver setup and teardown logic.

### **Test**: PageObjects and Test Cases
- **PageObjects**: 
  - Organized as a package for each page of the application.
  - Each package contains:
    - A class for the **elements** of the page (locators).
    - A class for the **actions** that can be performed on the page.

- **Tests**:
  - Contains the actual test cases that implement the test scenarios provided in the [test cases](https://automationexercise.com/test_cases).

