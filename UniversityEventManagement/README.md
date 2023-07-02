# JOB PORTAL Project
![Version](https://img.shields.io/static/v1?label=java-version&message=%3E=11&color=blue) ![documentation](https://img.shields.io/static/v1?label=documentation&message=yes&color=green) ![maintanined?](https://img.shields.io/static/v1?label=maintained?&message=yes&color=green) ![License](https://img.shields.io/static/v1?label=license&message=ZAHID&color=orange)

README file for JOB PORTAL PROJECT
## 🏠  [Homepage](https://github.com/ZahidFarooqDar/Class-test/tree/main/UniversityEventManagement)
## Prerequisities
* java >=11.0
* Spring Boot
* H2 Database

## Author

* 🙍‍♂️ Zahid Farooq Dar
  * LinkedIn: [@Zahid Farooq](https://www.linkedin.com/in/zahid-farooq-dar/)
  * Github: [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)

## DATA FLOW
* Application is based on MVC architecture where we have
---
### MODEL
* It contains two models viz Student and Event
* It contains model of Student where we have entities of Student class
---
### CONTROLLER
* This package contains different API end points of both Student and Event model with two different controllers 

### SERVICE
* Service package contain both models business logic for the API's
---
### DAO 
* it is the repository layer where we extend JPA repository with some custom query methods for updation and deletion of Students.
* it also contain repository of Event model as well.

### DATA BASE DESIGN
* HERE we are using in-memory database H2 Database 
---

## PROJECT SUMMARY
* The application is designed to perform very basic CRUD operations on Student and Event, it tracks our data regarding Student model and Event Model
---
## 📝 License

 Copyright @ 2019 [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)


# 

This README was generated with ❤️ by [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)
