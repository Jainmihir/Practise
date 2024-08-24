CREATE DATABASE MIHIR;
CREATE TABLE STU(id int , name varchar(255));
INSERT INTO STU(id,name) values(101,"Mihir");

Select * from STU;
Select * from STU where id==101 limit 1;
Select * from stu where id==101 Order by name asc;

select id, count(name)
from STU
group by id
having id>1;

select id,name, count(name)
form stu 
where id == 1
group by id,name
having name=="Mihir"
order by dsc
limit 1;


select * 
from stu
inner join stu_info
on student.id = stu_info.id;

select * 
from stu as A 
self join stu as b 
on a.id = b.id


create view view1 as SELECT * FROM STUDENT_DATA;
SELECT * FROM view1;

UPDATE STUDENT_DATA
SET grade='B'
WHERE grade='A';

ALTER TABLE STUDENT_DATA
ADD COLUMN TEACHER VARCHAR(255);