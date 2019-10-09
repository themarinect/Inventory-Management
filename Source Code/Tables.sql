CREATE DATABASE InventoryManagement ON PRIMARY (NAME='InventoryManagement_data',FILENAME='C:\InventoryManagement_data.mdf')LOG ON(NAME='InventoryManagement_log',FILENAME='C:\InventoryManagement_log.ldf')
USE InventoryManagement
CREATE TABLE Roles(RoleID varchar(5) constraint PK_Roles_RoleID primary key,RoleName nvarchar(30) not null)
CREATE TABLE Administrators(AdminID varchar(5) constraint PK_Administrators_AdminID primary key,Username varchar(30) not null,Password varchar(20) not null,Phone nvarchar(20),Email nvarchar(50),RoleID varchar(5) constraint FK_Administrators_RoleID foreign key references Roles(RoleID),Status bit default 1)
CREATE TABLE Categories(CategoryID int identity(1,1) constraint PK_Categories_CategoryID primary key,CategoryName nvarchar(30) not null)
insert into Roles values('AD',N'Administrators')
insert into Roles values('SM',N'SalesManager')
insert into Roles values('IM',N'InventoryManager')
insert into Roles values('SL',N'Sales')
insert into Administrators values('AD1','admin','123456','0974234388','ngoctoan89@gmail.com','AD',1)
CREATE TABLE Items(ItemID varchar(5) constraint PK_Items_ItemID primary key,ItemName nvarchar(25) not null,Unit nvarchar(20) not null,QuantityAvailable int default 0 not null,Price float default 0 not null,DateImport datetime default getdate(),Manufacture nvarchar(50) default 'Unknow',Descript nvarchar(200) default 'No descript',CategoryID int constraint FK_Items_CategoryID foreign key references Categories(CategoryID) ON DELETE CASCADE ON UPDATE CASCADE,Status bit default 1,Sold int default 0)
CREATE TABLE Customers(CustomerID int identity(1,1) constraint PK_Customers_CustomerID primary key,CustomerName nvarchar(50) not null,Address nvarchar(200) not null,Phone varchar(20) not null,Email nvarchar(100) not null,Gender bit default 1,Status bit default 1,Purchased float default 0)
CREATE TABLE Bills(BillID int identity(1,1) constraint PK_Bills_BillID primary key,AdminID varchar(5) constraint FK_Bills_AdminID foreign key references Administrators(AdminID) ON DELETE CASCADE ON UPDATE CASCADE,Date datetime default getdate(),Discount float default 0,VAT float default 0,Payment nvarchar(20),Total float default 0,CustomerID int constraint FK_Bills_CustomerID foreign key references Customers(CustomerID) ON DELETE CASCADE ON UPDATE CASCADE,Status bit default 0)
CREATE TABLE BillDetails(BillID int constraint FK_BillDetails_BillID foreign key references Bills(BillID) ON DELETE CASCADE ON UPDATE CASCADE,ItemID varchar(5) constraint FK_BillDetails_ItemID foreign key references Items(ItemID) ON DELETE CASCADE ON UPDATE CASCADE,Quantity int default 0,Price float default 0 not null,primary key(BillID,ItemID))
create view V_Items as select ItemID,ItemName,QuantityAvailable,convert(char(10),DateImport,103) as date,Sold,CategoryID from Items
create view V_Customers as select CustomerID,CustomerName,Address,Purchased from Customers
create view V_BillInDay as select BillID,Username,Total,convert(char(10),Date,101) as DateTranstract,Bills.Status,CustomerName from Bills,Administrators,Customers where Bills.AdminID=Administrators.AdminID and Bills.CustomerID=Customers.CustomerID
create view V_SoldPreviousDay as select sum(Quantity) as total,convert(char(10),Date,101) as d from Bills,BillDetails where Bills.BillID=BillDetails.BillID and datediff(dd,Date,getdate())=1 group by Date
create view V_ItemsCancel as select Bills.BillID,Status,convert(char(10),Date,101) as DateTranstract,ItemID,Quantity from Bills,BillDetails where Bills.BillID=BillDetails.BillID and Status=0
create view V_ItemsSoldPreviousDay as select Items.ItemID,ItemName,Items.Price,Quantity as QuantitySold,AdminID as Sales,convert(char(10),Date,101) as DateSold,Total,Discount from Items,BillDetails,Bills where Items.ItemID=BillDetails.ItemID and Bills.BillID=BillDetails.BillID and datediff(dd,Date,getdate())=1
create proc spDetroyBill @quan as int,@itemId as varchar(5),@total as float,@cusId as int as update Items set Sold=Sold-@quan where ItemID=@itemId update Items set QuantityAvailable=QuantityAvailable+@quan where ItemID=@itemId update Customers set Purchased=Purchased-@total where CustomerID=@cusId

