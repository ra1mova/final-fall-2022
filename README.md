# *CS 204: Back-end Development with Spring Framework (Final)*
## Student Management System

Simple and fully responsive Student Management System using Spring Boot, Thymeleaf and PostgresSQL database.

It works with 4 tables: *students, role, users-roles, user-table*.
Only admin can add or delete students;
## - login: **admin**
## - password: **Admin2022**

Students can register and see their marks, if they exist in table.

# Tools and technologies used:
- *Java 11*
- *Spring Boot*
- *Spring Data JPA (Hibernate)*
- *PostgresSQL*
- *Thymeleaf*
- *Bootstrap 4*


## ER Diagram of DB

![image](images/er_diagram.jpg)

## *Some screenshots*

![image](images/screenshot1.JPG)
![image](images/screenshot2.JPG)
![image](images/screenshot3.JPG)
![image](images/screenshot4.JPG)

# Deployment process
 ## We deployed our project to AWS. 
## Firstly we connected our database to RDS.

![rds](https://user-images.githubusercontent.com/100186256/208439448-e540df23-14f5-4e14-9745-c1bb77223bb2.png)


## Then we created an environment for our web server. While creating the environment Elastic Beanstalk created and launched an instance.


![ebt](https://user-images.githubusercontent.com/100186256/208439543-3bdf163a-26e7-43a6-92f6-a71ec37d8a74.png)



![ec2](https://user-images.githubusercontent.com/100186256/208439746-069ad389-faa5-4164-a6f2-45aa04a64e52.png)



## We connected to the instance and deployed our files to Elastic Beanstalk.


## Also we attached the instance to Elastic Load Balancer(ELB) which automatically distributes incoming application traffics.



![lb](https://user-images.githubusercontent.com/100186256/208439839-d4580546-ae1f-4da3-aa50-e6c3aff349f1.png)


## You can see our web-site


![dns](https://user-images.githubusercontent.com/100186256/208439910-31af9550-1c9a-4e00-8b75-286c8d88927f.png)
