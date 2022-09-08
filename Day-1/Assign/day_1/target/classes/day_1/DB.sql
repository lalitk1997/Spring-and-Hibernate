show databases;
drop database db1;
create database db1;
use db1;

create table employee (empId int, name varchar(255) not null,
 address varchar(255) not null, salary int not null, primary key(empId));
 
 insert into employee values 
 (1, "lalit kumar", "gurgaon", 1000),
 (2, "roshan lal", "jamshedpur", 3000),
 (3, "karan singh", "indore", 5000);
 
 select * from emp;
 