create database testmis81;

use testmis81;

create table book(
                     book_id int primary key auto_increment,
                     book_name varchar(50),
                     book_author varchar(50),
                     book_price double,
                     book_date date,
                     user_id int
);

select * from book;

insert into book values(1,'神雕侠侣','张三',20.3,now(),1  );
insert into book values(2,'天龙八部','张三丰',20.3,now(),2  );