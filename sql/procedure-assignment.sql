delimiter $$
drop procedure if exists pro1 $$
create procedure pro1(in c_id int,out e_salary int,out d_id int)
begin
select id into d_id from dept where id=c_id;
select salary into e_salary from emp where id=c_id;
end $$
delimiter ;
call pro1(101,@e_salary,@d_id);
select @e_salary,@d_id;