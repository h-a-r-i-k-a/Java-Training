-- display the last occurance of given char in a string 'keerthi' word 'e' exists 2 times ,display last occurance
-- take full name as 'harika maddela' split into first name and last name
-- 'sowmya' display this word in sentence case-means first char only captial
-- in word 'misissipi' count no.of i 
select length('misissipi')-length(replace('misissipi','i',''));
select replace('sowmya',substr('sowmya',1,1),upper(substr('sowmya',1,1)))
select 'harika maddela',substr('harika maddela',1,instr('harika maddela',' ')) 'firstname',
substr('harika maddela',instr('harika maddela',' ')+1)"lastname";
select length(reverse('keerthi'))-instr(reverse('keerthi'),'e')