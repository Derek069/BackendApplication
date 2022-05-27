<h1>Backend Application</h1>

Derek Alvarado Saenz - TIDBIS51M - IoT Applications

This is a backend application developed in Java working in conjunction with postgreSQL and Maven. This is the explanation of the 4 elements that work together to create an element in the Database.

First we have the ***entities***, these files are in charge of crating the columns that the table is going to have and how are those columns are going to receive data. They follow a getters and setters structure.

Then the ***repositories***, these extend to the entity and are created as an interface.

The ***services*** connect to the repositories and obtain the list from the entities for the data to be transferred through the rest controller.

Finally the ***rest controllers*** obtain the lists and return them for the usage of the entities.
