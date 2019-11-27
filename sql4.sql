--  display list of tables in curent database
show tables
-- display info about Agent table
desc Agent
-- dispaly all records from agent table
select * from Agent
-- display agent id ,firrst name,last name,city,ssn from agent table
Select
AgentId,
FirstName,
LastName,
City,
SSN
FROM Agent
-- where clause:used to display only filtered records -- restrict operator
-- dispaly info whose agent id is 1
select * from Agent where AgentId=1
-- display info whose first name is lavanya
select * from Agent where FirstName='lavanya'
select * from Agent where gender='female'
select * from Agent where city='Detroit'
-- dispaly all records whose agent id between 5 and 10
select * from Agent where AgentId between 5 and 10
select * from Agent where AgentId NOT between 5 and 10
-- like operator :used to display data w.r.t wild cards
select * from Agent where firstname like 's%' -- starts with s
select * from Agent where firstname like '%i' -- ends with i
-- in clause used to display select column valued records
select * from Agent where city IN ('HYDBAD','Detroit')
select * from Agent where FirstName IN ('raj','murali','lalitha')
select * from Agent where city NOT IN ('HYDBAD','Detroit')
select * from Agent where FirstName NOT IN ('raj','murali','lalitha')
-- Order By : used to sort data on specific fields in ascending or descending order
SELECT
AgentId,
FirstName,
LastName,
City,
SSN
FROM AGENT
Order By FirstName  DESC
SELECT
AgentId,
FirstName,
LastName,
City,
SSN
FROM AGENT
Order By City,FirstName 
select AgentId,FirstName,MaritalStatus from Agent
select AgentId,FirstName,MaritalStatus,
CASE MaritalStatus
 WHEN 0 THEN 'UNMARRIED'
 WHEN 1 THEN 'MARRIED'
END 'Status'
from Agent
select distinct city from Agent
select * from Agent
-- display output as if country is usa then $ if country is india then rs
select AgentId ,City,Country,
CASE Country
WHEN 'USA' THEN '$'
WHEN 'INDIA' THEN 'RS'
END 'Currency'
From Agent
select * from policy
-- dispaly Policyid,annual premium,modal premium,payament mode,
--if paymentmode 

select PolicyID,AnnualPremium,PaymentModeID,ModalPremium,
CASE PaymentModeID
WHEN 1 THEN 'ANNUAL'
WHEN 2 THEN 'HALF YEARLY'
WHEN 3 THEN 'QUATERLY'
END 'pay'
From policy

select * from policy
