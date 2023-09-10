 use forest;
select * from information ;
use facebook;
select * from media;
use flipkart;
select * from shop;
use instagram;
select * from social;
use myntra;
select * from customer;

//In
select * from information where jungle in (1,4,5);
use facebook;
select * from media where id in ('kiran','kishan','kishor');
use flipkart;
select * from shop where account in('kiran','kishan','surya');
select * from social where myid in('kiran','kishan','tharu');
select * from customer where shopper_name in('kiran','kishan','kushal');

//Not In 
select * from information where jungle not in(1,4);
select * from media where id not in ('kiran','kishan','kishor');
select * from shop where account not in('kiran','kishan','surya');
select * from social where myid not in('kiran','kishan','tharu');
select * from customer where shopper_name not in('kiran','kishan','kushal');

//between

select * from information where jungle between 1 and 5;
select * from media where id between 'kiran'and'kishan';
select * from shop where account between 'kiran'and'surya';
select * from social where myid between 'kiran'and'tharu';
select * from customer where shopper_name between 'kishan'and'kushal';

//not between
select * from information where jungle not between 1 and 5;
select * from media where id not between 'kiran'and'kishan';
select * from shop where account not between 'kiran'and'surya';
select * from social where myid not between 'kiran'and'tharu';
select * from customer where shopper_name not between 'kishan'and'kushal';

//Aggregation sum
use forest;
select * from information;
select Count(bird) as sum from information;  
select * from media;
Select count(followers)as sum from media;
select * from shop;
Select count(coin)as sum from shop;
select * from social;
Select count(post)as sum from social;
select * from customer;
Select count(brand)as sum from customer;

//
select * from information;
select sum(jungle) as addition from information;
select * from media;
select sum(users) as addition from media;
select * from shop;
select sum(coin) as addition from shop;
select * from social;
select sum(post) as addition from social;







select avg(jungle) as average from information;

select max(jungle) as max from information;








 