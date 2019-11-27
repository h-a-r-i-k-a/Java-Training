-- number functions
-- abs(): returns the absolute value
select abs(-12)
-- ceiling(): returns the greatest integer value.
select ceiling(12.000001)
-- floor():returns the smallest integer value.
select floor(12.99999)
-- power(n,m):return n power m value
select power(2,3)
-- sqrt(n):returns sqrt value
select sqrt(49)
select round(7687.7786,3)
select round(7687.7786,2)

select round(7687.7786,0)
select round(7687.7786,-1)
select round(7687.7786,-2)
select round(7687.7786,-3)
select truncate(7687.7786,3)
select truncate(7687.7786,-2)
-- disply current date
select curdate()
-- display current time
select dayofweek(curdate())
select last_day(curdate())
select curtime()
select adddate(curdate(),INTERVAL 1 Day)
select adddate(curdate(),INTERVAL 1 MONTH)
select adddate(curdate(),INTERVAL 1 YEAR)
-- display the last day of next month
-- display the last day of previous month
-- display the first day of the current month

select adddate(curdate(),INTERVAL 1 MONTH) 

select last_day(adddate(curdate(),INTERVAL 1 MONTH))
select adddate(curdate(),interval 12-MONTH(curdate()) MONTH)
select last_day(adddate(curdate(),interval 12-MOnth(curdate()) MONTH))
select adddate(curdate(),interval -1 month)
select last_day(adddate(curdate(),interval -1 month))
select adddate(last_day(adddate(curdate(),interval -1 month)),interval 1 day)
select adddate(last_day(adddate(curdate(),interval -1 month)),interval 1 day)
select dayofweek(adddate(last_day(adddate(curdate(),interval -1 month)),interval 1 day))
select adddate(adddate(last_day(adddate(curdate(),interval -1 month),interval 1 day),
interval 6 dayofweek(adddate(last_day(adddate(curdate(),interval -1 month)),interval 1 day)) day)'first friday'
adddate(adddate(adddate((last_day(adddate(curdate(),interval -1 month)),interval 1 day),
interval 6-dayofweek(adddate(last_day(adddate(curdate(),interval -1 month)),interval 1 day))day),interval 7 day)'second friday'

