-- Aggregate functions
use sqlpractice
-- sum(): performs sum operation on given field
select sum(sal) from Emp;
select sum(annualpremium) from Policy
select avg(sal) from Emp;
select avg(annualpremium) from Policy
select max(sal) from Emp
select max(annualpremium) from Policy
select min(sal) from Emp
select min(annualpremium) from Policy
select count(*) from Emp
select count(*) from Agent
select count(*) from Policy
select * from Policy
select
job
from Emp
select Distinct job from Emp
group by: generates summarized aggregate reports on the fields(s) specified
select job,sum(sal) from Emp
Group By job
select job,count(*) from Emp
group by job
select job,count(*),sum(sal),max(sal),min(sal),avg(sal) from Emp
group by job
select city,count(*) from Agent
group by city
