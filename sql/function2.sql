delimiter $$

create function f4(eid int) returns varchar(20)
begin
declare nm varchar(20);
select name into nm from dept where id=(select dept_id from emp where id=eid);
return nm;
end $$

delimiter ;

set @depnm=f4(101);
select @depnm;