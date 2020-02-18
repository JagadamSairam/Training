
delimiter $$
 create function f2(eid int)returns varchar(20)
 begin
 declare nm varchar(20);
 select name into nm from emp where id=eid;
 return nm;
 end $$;
 delimiter ;
set @name=f2(103);
select @name;