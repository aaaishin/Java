create database AdvDb_Project

use AdvDB_Project



create table CUSTOMER (
Customer_No int primary key identity (1,1),
CustomerName varchar (50),
Contact varchar (12),
Email varchar (50)
)

create table SEAT (
SeatID varchar (10) primary key not null,
SeatNumber varchar (10) not null,
ScreenType varchar (10)  check (ScreenType in ('2D', '3D')),
)

create table CASHIER (
CashierID varchar (10) primary key not null
)

create table MOVIE (
MovieID varchar (10) primary key not null,
MovieName varchar (100) not null,
MovieStart time,
MovieEnd time
)

create table PAYMENT (
PaymentID varchar (10) primary key not null,
TicketNo varchar (10) not null,
CustomerNo int not null,
Cashier_ID varchar (10) not null,
Total_Amount smallmoney,

)

create table MOVIEROOM (
RoomID varchar (10) primary key  not null,
Movie_ID varchar (10) not null,
RoomName varchar (30)
)

create table TICKET (
Ticket_No varchar (10) primary key not null,
Room_ID varchar (10) not null,
Seat_ID varchar (10),
DateOfShow datetime
)


alter table PAYMENT
add constraint ticket_fk
foreign key (TicketNo)
references TICKET (Ticket_No)


alter table PAYMENT
add constraint cn_fk
foreign key(CustomerNo)
references CUSTOMER (Customer_No)


alter table PAYMENT
add constraint cashier_fk
foreign key(Cashier_ID)
references CASHIER (CashierID)


alter table MOVIEROOM
add constraint movie_fk
foreign key(Movie_ID)
references MOVIE (MovieID)


alter table PAYMENT
add constraint ticket_fk
foreign key (TicketNo)
references TICKET (Ticket_No)


alter table PAYMENT
add constraint cn_fk
foreign key(CustomerNo)
references CUSTOMER (Customer_No)


alter table TICKET
add constraint roomid_fk
foreign key(Room_ID)
references MOVIEROOM (RoomID)


alter table TICKET
add constraint seatid_fk
foreign key(Seat_ID)
references SEAT (SeatID)


alter table MOVIEROOM
add constraint idmovie_fk
foreign key(Movie_ID)
references MOVIE (MovieID)

alter table CASHIER
ADD EmployeeNo varchar (30) not null