# USER MANAGEMENT SYSTEM with VALIDATIONS
## 🏠  [Homepage](https://github.com/ZahidFarooqDar/Class-test/tree/main/AssignmentValidation/usermanagement)
## Prerequisities
* java 17
* Spring Boot
* H2 database
## Author

* 🙍‍♂️ Zahid Farooq Dar
 * LinkedIn: [@Zahid Farooq](https://www.linkedin.com/in/zahid-farooq-dar/)
  * Github: [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)

## DATA FLOW
Application is based on MVC architecture where we have
---
### MODEL
It contains model of USER where we have entities of USER class
---
### CONTROLLER
This package contains different API end points 
* [GET all USERS](http://localhost:8080/User/Management/GetAll)
* [GET USER by ID](http://localhost:8080/api/v1/User/Management/getById/UserId/{userId})
* [POST/ADD USER](http://localhost:8080/User/Management/addUser)
* [DELETE USER](http://localhost:8080/User/Management/delete/{id})
* [UPDATE USER](http://localhost:8080/User/Management/update/UserId/{id})
---

### SERVICE
It contains the business logic for the API's and @Autowired IRepository
---
### DAO
it contains the interface which extends JPARepository
And which contains predefined logic for all basic CRUD Operations
---
### DATA BASE DESIGN
Here we are using in-memory database known as H2 database
---

## PROJECT SUMMARY
The application is designed to perform very basic CRUD operations on User Model where we have different entities and on them we have used some basic validations based on regex pattern

# 

This README was generated with ❤️ by [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)

