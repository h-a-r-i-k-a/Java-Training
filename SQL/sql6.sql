-- string functions
-- instr(): displays the first occurance of given char
select instr('hello','l');
-- length(): displays total no.of chars
select length('hello');
-- reverse(): displays in reverse order
select reverse('hello');
select lower('hello');
select upper('hello');
-- substr(): displays part of string ,as in that from 3rd char it prints 5 chars
select substr('welcome to sql',3,5);
-- replace(): replaces the old value with the new value
select replace('java training','java','sql')
