create database swing_demo
CREATE TABLE student
( id int NOT NULL,
  name varchar(250) NOT NULL,
  password varchar(250)
);

INSERT INTO student (id, name, password)
VALUES (1, 'Ramesh', 'Ramesh@123');

SELECT * From student 
Go
