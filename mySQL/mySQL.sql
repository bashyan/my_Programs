create database retail;
use retail;

create table if not exists salespeople (
snum int not null,
sname varchar(30) not null,
city varchar(30) not null,
comm decimal(4,2) not null,
primary key (snum)
);

select * from salespeople;

create table if not exists customer (
cnum int not null,
cname varchar(30) not null,
city varchar(30) not null,
rating int not null,
snum int not null,
primary key (cnum),
foreign key (snum) references salespeople(snum)
);
select * from customer;

create table orders (   
onum integer primary key default 0,   
amt decimal default 0.00,   
odate date not null default '0',
cnum integer not null default 0,   
snum integer not null default 0 references salespeople(snum),   
foreign key(cnum) references customer (cnum));

select * from orders;

select * from salespeople;
select * from customer;
select * from orders;
select * from customer where rating = 100;  -- rating =100
select * from customer where city = 'null'; -- find row where city =null
select snum,odate,max(amt) from orders group by snum, odate; -- find largest order taken by each person on each date
select * from orders order by cnum desc; -- orders table cnum descending order
select salespeople.sname, salespeople.snum from orders inner join salespeople on salespeople.snum=orders.snum; -- currently have orders
select customer.cname, salespeople.sname from salespeople inner join customer on salespeople.snum=customer.snum; -- all customers matched with the salespeople serving them
select salespeople.sname, salespeople.snum from salespeople where snum in ( select snum from customer group by snum having count(snum)>1); -- salesman with customer>1
select snum,count(*) from orders group by snum order by count(*) desc; -- Count the orders of each of the salespeople and output the results in descending order
select * from customer where city='san jose'; -- List the Customer table if and only if one or more of the customers in the Customer table are	located in San Jose
select * from salespeople where city=any (select city from customer); --  Match salespeople to customers according to what city they lived in
select snum, max(amt) from orders group by snum; -- Find the largest order taken by each salesperson
select * from customer where city='san jose' and rating>200; -- Find customers in San Jose who have a rating above 200
select  sname, comm from salespeople  where city='london' ; -- List the names and commissions of all salespeople in London
select * from orders where snum=1004; -- List all the orders of salesperson Motika from the Orders table
select orders.onum, orders.odate, customer.cname from orders inner join customer on customer.cnum=orders.cnum where day(odate)='10' and month(odate)='03'; -- Find all customers with orders on October 3
select odate, sum(amt) from orders group by odate having sum(amt)>2000; -- sums of the amounts from the Orders table, grouped by date, eliminating all those dates where the SUM was not at least 2000.00 above the MAX amount
select onum, odate, amt from orders where /*odate!='1996-06-10' and*/ amt>(select min(amt) from orders where odate='1996-06-10'); -- Select all orders that had amounts that were greater than at least one of the orders from October 6
select * from salespeople where exists (select snum from customer where customer.rating=300 and salespeople.snum=customer.snum ); -- EXISTS operator to extract all salespeople who have customers with a rating of 300
select a.cname 'A', b.cname 'B', a.rating from customer a, customer b where a.rating=b.rating and a.cnum!=b.cnum and a.cnum<b.cnum ; -- Find all pairs of customers having the same rating
-- Find all customers whose CNUM is 1000 above the SNUM of Serres
select sname, concat(comm*100,'%')'Percentage' from salespeople order by sname; -- Give the salespeople’s commissions as percentages instead of decimal numbers
select * from orders group by amt having max(amt)>3000;    -- Find the largest order taken by each salesperson on each date, eliminating those MAX orders which are less than $3000.00 in value
select snum, max(amt) from orders where odate='1996-03-10' group by snum;-- 24. List the largest orders for October 3, for each salesperson
select * from customer where customer.city in  (select city from salespeople where sname='serres') ; -- 25. Find all customers located in cities where Serres (SNUM 1002) has customers.
	select * from salespeople inner join customer on customer.snum=salespeople.snum where salespeople.sname='serres';
	select b.cname, b.city from customer a, customer b where a.city=b.city and a.snum=1002 order by b.cname; 
select * from customer where rating>200; -- 26. Select all customers with a rating above 200.00
select count(distinct(snum)) from orders; -- 27. Count the number of salespeople currently listing orders in the Orders table
select b.cname, a.comm from salespeople a, customer b where comm>0.12 and a.snum=b.snum; -- 28. Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name and the salesperson’s rate of commission
select b.sname from customer a, salespeople b where b.snum=a.snum group by b.sname having count(a.snum)>1; -- 29. Find salespeople who have multiple customers.
select a.sname, a.city from salespeople a, customer b where a.city=b.city group by a.city; -- 30. Find salespeople with customers located in their city
select sname from salespeople having substring(sname,1,1)='p' and  substring(sname,4,1)='l';-- 31. Find all salespeople whose name starts with ‘P’ and the fourth character is ‘l’ 
select sname from salespeople where sname like('p__l%');
select * from orders where cnum=(select cnum from customer where cname='cisneros');-- 32. Write a query that uses a subquery to obtain all orders for the customer named Cisneros. Assume you do not know his customer number
select sname, max(a.amt) from orders a, customer b, salespeople c where (c.sname='serres' or c.sname='rifkin') and a.cnum=b.cnum and b.snum=c.snum group by c.sname;  -- 33. Find the largest orders for Serres and Rifkin
select snum, sname, comm as commission, city from salespeople; -- 34. Extract the Salespeople table in the following order : SNUM, SNAME, COMMISSION, CITY.
select cname from customer where cname between 'a%' and 'g%'; -- 35. Select all customers whose names fall in between ‘A’ and ‘G’ alphabetical range.
 -- 36. Select all the possible combinations of customers that you can assign.
select * from orders where amt>(select avg(amt) from orders where odate='1996-04-10'); -- 37. Select all orders that are greater than the average for October 4.
select * from customer a where a.rating=(select max(b.rating) from customer b where a.city=b.city) ; -- 38. Write a select command using a corelated subquery that selects the names and numbers of all customers with ratings equal to the maximum for their city
select odate,sum(amt) from orders group by odate order by sum(amt) desc; -- 39. Write a query that totals the orders for each day and places the results in descending order.
select rating, cname from customer where city='san jose'; -- 40. Write a select command that produces the rating followed by the name of each customer in San Jose.
select * from orders where amt<(select min(a.amt) from orders a, customer b where b.city='san jose'); -- 41. Find all orders with amounts smaller than any amount for a customer in San Jose.
select onum, amt, cnum from orders where amt> any (select avg(amt) from orders group by cnum) group by cnum;  -- 42. Find all orders with above average amounts for their customers.
select city, rating from customer group by city; -- 43. Write a query that selects the highest rating in each city.
select c.onum, a.rating, c.amt, b.comm, c.amt*b.comm as SPcommission  from customer a, salespeople b, orders c where rating>100 and a.snum=b.snum and a.cnum=c.cnum; -- 44. Write a query that calculates the amount of the salesperson’s commission on each order by a	customer with a rating above 100.00
select count(cnum) from customer where rating> (select avg(rating) from customer where city='san jose'); -- 45. Count the customers with ratings above San Jose’s average.
select c.onum, a.sname from salespeople a, customer b, orders c where a.snum=b.snum and b.cnum=c.cnum group by c.onum order by c.onum desc; -- 46. Write a query that produces all pairs of salespeople with themselves as well as duplicate rows with the order reversed
select sname from salespeople where city='barcelona' or city='london'; -- 47. Find all salespeople that are located in either Barcelona or London.
select snum from customer group by snum having count(snum)=1; -- 48. Find all salespeople with only one customer.
select * from customer a, customer b where a.snum=b.snum and a.cnum!=b.cnum and a.cnum<b.cnum;  -- 49. Write a query that joins the Customer table to itself to find all pairs of customers served by a single salesperson.
select * from orders where amt>1000.00; -- 50. Write a query that will give you all orders for more than $1000.00
select a.onum, b.cname from orders a, customer b where a.cnum=b.cnum ;  -- 51. Write a query that lists each order number followed by the name of the customer who made that order
                             select a.sname, a.snum, b.snum, b.cnum, b.cname, b.city, a.city from salespeople a, customer b where a.snum!=b.snum and a.city=b.city group by a.snum; -- 52. Write 2 queries that select all salespeople (by name and number) who have customers in their cities who they do not service, one using a join and one a corelated subquery. Which solution 	is more elegant?
select * from customer where rating>= any ( select rating from customer where snum=(select snum from salespeople where sname='serres')); -- 53. Write a query that selects all customers whose ratings are equal to or greater than ANY (in the	SQL sense) of Serres’?
select * from orders where odate='1996-04-10' or odate='1996-03-10';
select * from orders where month(odate) in ('04','03') ; -- 54. Write 2 queries that will produce all orders taken on October 3 or October 4.
select c.cname, a.onum, b.onum  from orders a, orders b, customer c where a.cnum=c.cnum and a.cnum=b.cnum and a.onum!=b.onum and a.onum<b.onum; -- 55. Write a query that produces all pairs of orders by a given customer. Name that customer and eliminate duplicates.
select * from customer where rating> any (select rating from customer where city='rome'); -- 56. Find only those customers whose ratings are higher than every customer in Rome.
select * from customer where city='rome' or not rating<=100; -- 57. Write a query on the Customers table whose output will exclude all customers with a rating <= 100.00, unless they are located in Rome
select * from customer where snum=1001; -- 58. Find all rows from the Customers table for which the salesperson number is 1001.
select c.sname, b.snum, sum(a.amt) from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum group by b.snum having sum(a.amt)> (select max(amt) from orders); -- 59. Find the total amount in Orders for each salesperson for whom this total is greater than the amount of the largest order in the table
select onum, @amt:=0 as amt, odate, cnum from orders ;  -- 60. Write a query that selects all orders save those with zeroes or NULLs in the amount field.
select a.cname, b.sname, a.rating from customer a, salespeople b where a.cname>b.sname and a.rating<200; -- 61. Produce all combinations of salespeople and customer names such that the former precedes the latter alphabetically, and the latter has a rating of less than 200.
select a.sname, a.comm, sum(c.amt) as tot_orderAmt, a.comm*sum(c.amt) as Comm_Amt from salespeople a, customer b, orders c where a.snum=b.snum and b.cnum=c.cnum group by a.sname order by Comm_Amt desc; -- 62. List all Salespeople’s names and the Commission they have earned.
select cname, city from customer where rating= (select rating from customer where cname='hoffman');  -- 63. Write a query that produces the names and cities of all customers with the same rating as Hoffman. Write the query using Hoffman’s CNUM rather than his rating, so that it would still be usable if his rating changed.
select a.sname, b.cname from salespeople a, customer b where a.snum=b.snum and a.sname<b.cname;  -- 64. Find all salespeople for whom there are customers that follow them in alphabetical order.
select a.cname, a.cnum, a.rating, avg(b.amt) as cAVG from customer a, orders b where a.cnum=b.cnum group by a.cnum having cAVG >(select avg(amt) from orders); -- 65. Write a query that produces the names and ratings of all customers of all who have above average orders.
select sum(amt) as SUM_allPurchase from orders; -- 66. Find the SUM of all purchases from the Orders table.
select onum, amt, odate from orders; -- 67. Write a SELECT command that produces the order number, amount and date for all rows in the order table
select count(rating) from customer where rating!='null'; -- 68. Count the number of nonNULL rating fields in the Customers table (including repeats).
select c.onum, a.sname, b.cname from salespeople a, customer b, orders c where a.snum=b.snum and b.cnum=c.cnum; -- 69. Write a query that gives the names of both the salesperson and the customer for each order after the order number.
select distinct a.sname, a.comm from salespeople a, customer b where a.snum=b.snum and b.city='london'; -- 70. List the commissions of all salespeople servicing customers in London.
							select a.sname, a.city from salespeople a, customer b where a.snum=b.snum and a.city!=any(select b.city from salespeople a, customer b where a.snum=b.snum) and a.city!=b.city ; -- 71. Write a query using ANY or ALL that will find all salespeople who have no customers located in their city.
select a.sname, b.cname from salespeople a, customer b where exists(select * from customer where a.city=b.city) and a.snum!=b.snum ;-- 72. Write a query using the EXISTS operator that selects all salespeople with customers located in their cities who are not assigned to them
select b.cname, b.snum, a.sname from salespeople a, customer b where a.snum=b.snum and (a.sname='peel' or a.sname='motika') ; -- 73. Write a query that selects all customers serviced by Peel or Motika. (Hint : The SNUM field relates the two tables to one another.)
select count(distinct b.snum)as each_Day_Order, a.odate from orders a, customer b where a.cnum=b.cnum group by a.odate ;  -- 74. Count the number of salespeople registering orders for each day. (If a salesperson has more than one order on a given day, he or she should be counted only once.)
select a.onum, a.odate, a.cnum, b.snum, c.city as SP_city, c.sname from orders a, customer b, salespeople c where c.city='london' and a.cnum=b.cnum and b.snum=c.snum ; -- 75. Find all orders attributed to salespeople in London.
select * from orders where cnum= any (select a.cnum from customer a, salespeople b where a.snum=b.snum and a.city!=b.city); -- 76. Find all orders by customers not located in the same cities as their salespeople.
select a.sname, b.cname from salespeople a, customer b where b.cnum= any (select cnum from orders group by cnum having count(cnum)>1) and a.snum=b.snum; -- 77. Find all salespeople who have customers with more than one current order.
select cnum, cname, snum from customer where snum= any (select snum from customer group by snum having count(snum)>1) order by snum; -- 78. Write a query that extracts from the Customers table every customer assigned to a salesperson who currently has at least one other customer (besides the customer being selected) with orders in the Orders table.
select cname from customer where cname like 'c%'; -- 79. Write a query that selects all customers whose names begin with ‘C’.
select city, max(rating) as rating from customer group by city; -- 80. Write a query on the Customers table that will find the highest rating in each city. Put the output in this form : for the city (city) the highest rating is : (rating).
select distinct b.snum from orders a, customer b where a.cnum=b.cnum; -- 81. Write a query that will produce the SNUM values of all salespeople with orders currently in the Orders table (without any repeats).
select rating, cname, cnum from customer order by rating desc; -- 82. Write a query that lists customers in descending order of rating. Output the rating field first, followed by the customer’s names and numbers.
select avg(comm) from salespeople where city='london'; -- 83. Find the average commission for salespeople in London. 
select * from orders where cnum= any (select cnum from customer where snum= (select snum from customer where cname='hoffman')); -- 84. Find all orders credited to the same salesperson who services Hoffman (CNUM 2001).
select * from salespeople where comm between 0.10 and 0.12;  -- 85. Find all salespeople whose commission is in between 0.10 and 0.12 (both inclusive).
select sname,city, comm from salespeople where city='london' and comm>0.10; -- 86. Write a query that will give you the names and cities of all salespeople in London with a commission above 0.10.
select * from orders where (amt < 1000 OR not (odate = '1996-03-10' AND  cnum >2003));  -- 87. What will be the output from the following query?  
							/*	+------+------+------------+------+
								| onum | amt  | odate      | cnum |
								+------+------+------------+------+
								| 3001 |   19 | 1996-03-10 | 2008 |
								| 3003 |  767 | 1996-03-10 | 2001 |
								| 3005 | 5160 | 1996-03-10 | 2003 |
								| 3007 |   76 | 1996-04-10 | 2002 |
								| 3008 | 4723 | 1996-05-10 | 2006 |
								| 3009 | 1713 | 1996-04-10 | 2002 |
								| 3010 | 1310 | 1996-06-10 | 2004 |
								| 3011 | 9892 | 1996-06-10 | 2006 |
								+------+------+------------+------+		*/
select * from orders group by cnum having min(amt); -- 88. Write a query that selects each customer’s smallest order.
select cname from customer where cname like 'g%' limit 1; -- 89. Write a query that selects the first customer in alphabetical order whose name begins with G.
select count( distinct city) from customer where city!='null'; -- 90. Write a query that counts the number of different nonNULL city values in the Customers table.                              
select avg(amt) from orders; -- 91. Find the average amount from the Orders table.
select * from orders where not (odate='1996-03-10' or snum>1006) and amt>=1500 ; -- 92. What would be the output from the following query?
				-- Error Code: 1054. Unknown column 'snum' in 'where clause'
select * from customer where city!='san jose' and rating>200; -- 93. Find all customers who are not located in San Jose and whose rating is above 200.
select snum, sname , city, comm from salespeople where comm between 0.121 and 0.14; -- 94. Give a simpler way to write this query :SELECT snum, sname city, comm FROM salespeople WHERE (comm > + 0.12 AND comm < 0.14);
select * from orders a, customer b, salespeople c where not ((a.odate='1996-03-10' and c.snum>1002) or a.amt>2000.00) and a.cnum=b.cnum and b.snum=c.snum;  -- 95. Evaluate the following query :
					/*		 onum,		amt,	odate,		   cnum, 	cnum, 	 cname,    city, 	 rating,  snum,   snum,   sname, 	  city, 	  comm
							'3003', 	'767',	'1996-03-10',  '2001', '2001', 'Hoffman',  'london', '100',   '1001', '1001', 'peel', 	  'london',   '0.12'
							'3007', 	'76', 	'1996-04-10',  '2002', '2002', 'giovanni', 'rome', 	 '200',   '1003', '1003', 'axelroad', 'new york', '0.10'
							'3009', 	'1713', '1996-04-10',  '2002', '2002', 'giovanni', 'rome', 	 '200',   '1003', '1003', 'axelroad', 'new york', '0.10'
							'3010', 	'1310', '1996-06-10',  '2004', '2004', 'grass',    'berlin', '300',   '1002', '1002', 'serres',   'san jose', '0.13'          */
select a.sname from salespeople a, customer b where a.city!=b.city and a.snum=b.snum group by a.snum; -- 96. Which salespersons attend to customers not in the city they have been assigned to?                            
select a.sname, a.comm, b.rating from salespeople a, customer b where a.snum=b.snum and a.comm>0.11 and b.rating<250 group by a.snum; -- 97. Which salespeople get commission greater than 0.11 are serving customers rated less than 250?
select a.sname, a.city, a.comm from salespeople a, salespeople b where a.city=b.city and a.comm!=b.comm group by a.snum ;  -- 98. Which salespeople have been assigned to the same city but get different commission percentages?
select c.sname, c.comm, sum(c.comm*a.amt) as SP_totIncome  from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum group by c.sname order by SP_totIncome desc limit 1;  -- 99. Which salesperson has earned the most by way of commission?
 -- 100.Does the customer who has placed the maximum number of orders have the maximum rating?  Yes
select if(cus_rating=(select max(rating) from customer),'yes','no') as Output  from (select max(rating) as cus_rating from customer where cnum = any (select cnum as Customer_max_orders from orders group by cnum having count(*)= (select max(counted) from (select cnum,count(*) as counted from orders group by cnum) as counts)))as ans ;
 -- 101.Has the customer who has spent the largest amount of money been given the highest rating?
select *from customer a where a.rating=a.rating order by rating, cname;  -- which cus have same rating
select a.cnum, b.cname, sum(a.amt) from orders a, customer b where a.cnum=b.cnum  group by a.cnum order by sum(a.amt) limit 1 ; -- worst cus
select a.cnum, b.cname, sum(a.amt) from orders a, customer b where a.cnum=b.cnum  group by a.cnum order by sum(a.amt) desc limit 1 ; -- best cus
-- join all 3 tables add snum in 3rd table
select a.onum, a.odate, a.amt, a.cnum, a.snum from orders a, customer b where a.cnum=b.cnum;
select sum(a.amt),b.snum from orders a, customer b where a.cnum=b.cnum group by b.snum; 
select c.sname,sum(a.amt) as TotalSale,b.snum, sum(amt)*c.comm from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum group by b.snum order by TotalSale desc;
select c.sname as SaleName,sum(a.amt) as TotalSalebySP,sum(amt)*c.comm as CoMM, (sum(a.amt)*100)/(select sum(amt) from orders) as SalaesPerc from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum group by b.snum order by TotalSalebySP desc;
select snum, sname, comm from salespeople where comm between .121 and .14;
select b.cname,a.cnum, b.rating, sum(a.amt) as TSpend from orders a, customer b where a.cnum=b.cnum group by cnum order by TSpend;
select sum(a.amt) as Y, sum(a.amt*c.comm)as X from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum and (b.city='rome' or b.city='london');
select c.sname, sum(a.amt*c.comm) from orders a, customer b, salespeople c where a.cnum=b.cnum and b.snum=c.snum and (c.city='london' or c.city='rome') group by sname;












