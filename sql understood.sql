CREATE DATABASE facebook;
CREATE TABLE media(profile varchar(30),post int,users bigint);
SELECT * FROM media;
ALTER TABLE media ADD COLUMN followers int;
ALTER TABLE media DROP COLUMN post;
ALTER TABLE media RENAME COLUMN profile to id;
ALTER TABLE media MODIFY COLUMN users int;
DESC media;
INSERT media VALUES('kiran','1',332);
INSERT media VALUES('kishan','2',333);
INSERT media VALUES('kishor','3',334);
INSERT media VALUES('aishu','4',335);
INSERT media VALUES('deepu','5',336);
INSERT media VALUES('ammu','6',337);
INSERT media VALUES('tharun','7',338);
INSERT media VALUES('meghana','8',339);
INSERT media VALUES('karan','9',400);
INSERT media VALUES('kushal','10',401);


CREATE DATABASE instagram;
CREATE TABLE social(name varchar(20),chats int,follower bigint);
SELECT * FROM social;
ALTER TABLE social ADD COLUMN post bigint;
ALTER TABLE social DROP COLUMN chats;
ALTER TABLE social RENAME COLUMN name to myid;
ALTER TABLE social MODIFY COLUMN follower int;
DESC social;
INSERT social VALUES('kiran',123,2);
INSERT social VALUES('kishan',124,3);
INSERT social VALUES('tharu',125,4);
INSERT social VALUES('meghana',126,5);
INSERT social VALUES('karan',127,6);
INSERT social VALUES('kushal',128,7);
INSERT social VALUES('aishu',129,8);
INSERT social VALUES('deepu',130,9);
INSERT social VALUES('surya',131,10);


CREATE DATABASE flipkart;
CREATE TABLE shop(id_name varchar(10),offers int,buyer bigint);
SELECT * FROM shop;
ALTER TABLE shop ADD COLUMN coin int;
ALTER TABLE shop DROP COLUMN offers;
ALTER TABLE shop RENAME COLUMN id_name to account;
ALTER TABLE shop MODIFY COLUMN buyer int;
DESC shop;
INSERT shop VALUES('kiran',111,12);
INSERT shop VALUES('kishan',112,13);
INSERT shop VALUES('surya',113,14);
INSERT shop VALUES('samarth',114,15);
INSERT shop VALUES('meghana',115,16);
INSERT shop VALUES('tharun',116,17);
INSERT shop VALUES('karan',118,18);
INSERT shop VALUES('kushal',119,19);


CREATE DATABASE myntra;
CREATE TABLE customer(user_name varchar(15),jobs int,delivery bigint);
SELECT * FROM customer;
ALTER TABLE customer ADD COLUMN brand int;
ALTER TABLE customer DROP COLUMN jobs;
ALTER TABLE customer RENAME COLUMN user_name to shopper_name;
ALTER TABLE customer MODIFY COLUMN delivery int;
DESC customer;
INSERT customer VALUES('kiran',123,1);
INSERT customer VALUES('kishan',124,2);
INSERT customer VALUES('karan',125,3);
INSERT customer VALUES('kushal',126,4);
INSERT customer VALUES('deepu',127,5);
INSERT customer VALUES('aishu',128,6);
INSERT customer VALUES('navya',129,7);
INSERT customer VALUES('rakshitha',130,8);
INSERT customer VALUES('ramu',131,9);


CREATE DATABASE forest;
CREATE TABLE information(name varchar(1),animal int,pin_code bigint);
SELECT * FROM information;
ALTER TABLE information ADD COLUMN bird int;
ALTER TABLE information DROP COLUMN animal;
ALTER TABLE information RENAME COLUMN name to jungle;
ALTER TABLE information MODIFY COLUMN pin_code int;
DESC information;
INSERT information VALUES(1,234569,1);
INSERT information VALUES(2,234568,11);
INSERT information VALUES(3,234560,22);
INSERT information VALUES(4,234561,33);
INSERT information VALUES(5,234562,44);
INSERT information VALUES(6,234563,55);
INSERT information VALUES(7,234564,66);
INSERT information VALUES(8,234565,77);
select * from  information;
select pin_code from information where pin_code=234561;
select * from  information where jungle=4 && pin_code=234561;

