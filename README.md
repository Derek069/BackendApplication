# Backend Application

Derek Alvarado Saenz - TIDBIS51M - IoT Applications

---

This is a backend application developed in Java working in conjunction with postgreSQL, Maven and spring boot. 

## Setup

---

Create the project through Spring Initializr.

[https://start.spring.io](https://start.spring.io/)

Create with the following dependencies.

<img src= https://user-images.githubusercontent.com/81263819/170722246-90192bd9-c1ad-419e-a1cb-6126a39bdb86.png>

Download Maven Apache from:

[https://maven.apache.org](https://maven.apache.org/)

## Description

---

This is a backend application developed in Java working in conjunction with postgreSQL, Maven and spring boot. This is the explanation of the 4 elements that work together to create an element in the Database.

First we have the ***entities***, these files are in charge of crating the columns that the table is going to have and how are those columns are going to receive data. They follow a getters and setters structure.

Then the ***repositories***, these extend to the entity and are created as an interface.

The ***services*** connect to the repositories and obtain the list from the entities for the data to be transferred through the rest controller.

Finally the ***rest controllers*** obtain the lists and return them for the usage of the entities.

In this repository we have 3 main elements that all of them have repositories, entities, rest controller and services. Those elements are Customer, Product and Supplier.
