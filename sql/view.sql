create view view1
as select name,salary
from emp where salary >500;

select * from view1;
