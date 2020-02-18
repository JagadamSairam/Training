delimiter $$
create trigger saltgr
after delete
on emp for each row
begin
insert into emp2 values(old.id,old.name,old.dept_id,old.salary);
end $$
delimiter ;

delete from emp where id=101;

select * from emp2