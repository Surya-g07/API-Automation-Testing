# API-Automation-Testing
This project demonstrates API Automation Testing using REST Assured, Java, TestNG, and Maven. The framework covers end-to-end CRUD operations on REST APIs along with authentication, request/response validation, serialization, deserialization, path parameters, query parameters, and negative test scenarios.


Project Overview

# REST Assured API Automation Framework

## Project Overview

This project is an API Automation Testing Framework developed using Rest Assured, Java, TestNG, and Maven. The framework validates REST API endpoints by performing CRUD operations, authentication, serialization, deserialization, and negative test scenarios.

## Tech Stack

* Java
* Rest Assured
* TestNG
* Maven
* Jackson (Serialization & Deserialization)

## Test Scenarios Covered

### Authentication

* Generate Authentication Token
* Validate Authorized Requests

### CRUD Operations

* Create Booking (POST)
* Get Booking (GET)
* Update Booking (PUT/PATCH)
* Delete Booking (DELETE)

### Serialization & Deserialization

* Convert Java Objects to JSON Request Body
* Convert JSON Response to Java Objects

### Parameterization

* Path Parameters
* Query Parameters

### Response Validation

* Status Code Validation
* Response Body Validation

### Negative Testing

* Invalid Booking ID
* Unauthorized Requests
* Invalid Endpoint Validation

## Framework Features

* POJO Based Request Models
* Reusable Base Test Configuration
* TestNG Test Execution
* Clean Project Structure

## Project Structure

src/test/java
│
├── base
├── models
├── tests
└── utils

## How to Run

mvn test

Run Specific Test: mvn -Dtest=ClassName test

## Learning Outcomes

* REST API Automation using Rest Assured
* API Request and Response Validation
* Authentication Handling
* Serialization and Deserialization
* Test Framework Design using Java and TestNG

## Future Enhancements

* Data Driven Testing
* Extent Reports Integration
* API Chaining
* CI/CD using GitHub Actions
* UI + API Automation using Playwright and Rest Assured

** The test script and framework is important u dont need to install all the thing. Just look through the maven and structure of the project**
**Don't look for target file/folder it will generate automatically when u run the test**


**NOTE**: * Before getting started, ensure to lookup the structure and this file (README.md)...
      
          * This is demo site for practice so verify the documentation in that site and also read the description about the site which is mentioned in the site itself. 

          * This api demo site is for practice purpose and it is not a real world application so do not expect the real world scenarios in this site.
