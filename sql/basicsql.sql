show tables;
select * from emp;

PROCEDURE

delimiter $$
create procedure p3(in a integer)
begin
if a%2=0 then
select 'eve no';
else
select 'odd no';
end if;
end $$
delimiter ;

set@n=25;
call p3(@n);


PROCEDURE PROGRAM 2

delimiter $$
create procedure pdept(in dno int)
begin
declare cnt int;
select count(*) into cnt from emp where dept_id=dno;
select cnt;
end $$
delimiter ;

call pdept(101);


PROCEDURE PROGRAM 3

delimiter $$
create procedure pdept3(in dnm varchar(20),out cnt integer)
begin
select count(*) into cnt from emp where dept_id=(select dept_id from dept where name=dnm);
end $$
delimiter ;

set @dn=101;
call pdept3(@dn);
use sakila;
delimiter $$
create procedure getCostFilmCount(in cost integer,out cnt int)
begin
	select count(*) into cnt from film where replacement_cost>cost;
end $$
delimiter ;
call getCostFilmCount(24,@ct);
select @ct;
-- 
-- select * from payment;

use training;



