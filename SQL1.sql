-- create database sqlpractice;
use sqlpractice;
show tables
Create Table Agent
(
	AgentID INT AUTO_INCREMENT,
	FirstName varchar(30), 
   MI varchar(1),
   LastName varchar(30),
   FullName varchar(80),
   Gender varchar(10),
    Dob TIMESTAMP,
    SSN varchar(30),
    MaritalStatus INT,
    Address1 varchar(30),
    Address2 varchar(30),
    City varchar(30),
    State varchar(30),
    ZipCode varchar(30),
    Country varchar(30),
    Primary Key(AgentID)
  )
  
  
