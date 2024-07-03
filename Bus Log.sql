----Database Project
----Group Members(A2)
----1.Minhajul Islam(170104001)
----2.Zamia Mustafiz(170204041)
----3.Azad Sheikh(160104129)

Create Database BUS_LOG


Create Table RouteList
(
RouteId int not null Primary Key ,
RouteFrome varchar(50) not null,
RouteTo varchar(50) not null,
Distance int not null,
PerKMFare float not null,
)

select * from RouteList


Create Table Bus
(
BusNo varchar(50) not null primary key, 
BusName varchar(50) not null,
Model varchar(50) not null,
Condition varchar(50) not null,
BusType varchar(50) not null,
Seat int not null,
DepartureTime time not null ,
RouteId int not null Foreign key references RouteList (RouteId),
)

select * from Bus


Create Table Customer
(
CustomerId int identity(1,1) PRIMARY KEY,
FirstName varchar(50) not null,
LastName varchar(50) not null,
Email varchar(50) not null,
PhoneNo varchar(50) not null,
CustomerAddress varchar(50) not null,
)

select * from Customer



Create Table Orders
(
OrderId int Primary Key,
CustomerId int  Foreign Key references Customer(CustomerId),
BusNo varchar(50) not null Foreign Key references Bus(BusNo),
SeatCount int not null,
OrderDate date not null ,
Departuredate date not null,
Total_Fare float not null
)


select * from Orders

Create Table Users
(
UserNo int Primary Key,
UserID varchar(50) not null,
Userpassoword int not null check(Userpassoword<999999999),
)
select * from Users

--Drop Table Users


---RouteList
insert into RouteList values(101, 'Dhaka','Comilla',100,1.2)
insert into RouteList values(102, 'Comilla','Dhaka',100,1.2)
insert into RouteList values(103, 'Dhaka','Chittagong',232,1.2)
insert into RouteList values(104, 'Chittagong','Dhaka',232,1.2)
insert into RouteList values(105, 'Dhaka','Coxs Bazar',480,1.2)
insert into RouteList values(106, 'Coxs Bazar','Dhaka',480,1.2)
insert into RouteList values(107, 'Dhaka','Sylhet',232,1.2)
insert into RouteList values(108, 'Sylhet','Dhaka',232,1.2)
insert into RouteList values(109, 'Dhaka','Rangpur',316,1.2)
insert into RouteList values(110, 'Rangpur','Dhaka',316,1.2)
insert into RouteList values(111, 'Dhaka','Rajshahi',245,1.2)
insert into RouteList values(112, 'Rajshahi','Dhaka',245,1.2)
insert into RouteList values(113, 'Dhaka','khulna',315,1.2)
insert into RouteList values(114, 'Khulna','Dhaka',315,1.2)
insert into RouteList values(115, 'Dhaka','Jesshore',245,1.2)
insert into RouteList values(116, 'Jesshore','Dhaka',245,1.2)
insert into RouteList values(117, 'Dhaka','Barishal',230,1.2)
insert into RouteList values(118, 'Barishal','Dhaka',230,1.2)

------


-------Bus

Insert into Bus values('Dha-B 123456','Hanif Enterprise','Hino Ak-1J','Non AC','Economy Class',36,'09:00:00',103) 
Insert into Bus values('Dha-B 123457','Hanif Enterprise','Hino Ak-1J','Non AC','Economy Class',36,'09:00:00',104)
Insert into Bus values('Dha-B 123458','Shaymoli Paribahan','Hino Ak-1J','Non AC','Economy Class',36,'10:00:00',103) 
Insert into Bus values('Dha-B 123459','Shaymoli Paribahan','Hino Ak-1J','Non AC','Economy Class',36,'10:00:00',104) 
Insert into Bus values('Dha-B 123430','Asia Line','Hino Ak-1J','Non AC','Economy Class',36,'08:00:00',101) 
Insert into Bus values('Dha-B 123431','Asia Line','Hino Ak-1J','Non AC','Economy Class',36,'08:00:00',102) 
Insert into Bus values('Dha-B 123460','Desh Travels','Hyundai 2007','AC','Business Class',27,'09:00:00',105)
Insert into Bus values('Dha-B 123461','Desh Travels','Hyundai 2007','AC','Business Class',27,'09:00:00',106)
Insert into Bus values('Dha-B 123470','London Express','Man Cla','AC','Business Class',27,'08:00:00',107)
Insert into Bus values('Dha-B 123471','London Express','Man Cla','AC','Business Class',27,'08:00:00',108)
Insert into Bus values('Dha-B 123480','SR Travels','Hyundai 2007','AC','Economy Class',36,'09:00:00',109)
Insert into Bus values('Dha-B 123481','SR Travels','Hyundai 2007','AC','Economy Class',36,'09:00:00',110)
Insert into Bus values('Dha-B 123490','National Travels','Hino RN-2','AC','Economy Class',36,'11:00:00',111)
Insert into Bus values('Dha-B 123491','National Travels','Hino RN-2','AC','Economy Class',36,'11:00:00',112)

--------------------------------

-------Customer

Insert into Customer values('Iqbal','Ahmed','iqbal.su@gmail.com','01563787878','Jhigatola,Dhaka')
Insert into Customer values('Arif','Hasan','arif.ha@gmail.com','01723757677','Jatrabri,Dhaka')
Insert into Customer values('Mahbub','Chowdhury','mahbub.chy@yahoo.com','01863586833','Andor Killa,Chittagong')
Insert into Customer values('Rehnuma','Kabir','rehnuma.kb@gmail.com','01663698811','Fultola,Khulna')
Insert into Customer values('Asif','Khan','Asif.su@gmail.com','0177475780','Uttora,Dhaka')
--------------

---------------Order

Insert into Orders values(10001,2,'Dha-B 123460',1,'09/15/2021','09/18/2021',2000)
 



