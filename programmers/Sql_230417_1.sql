// 조건에맞는회원수구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/131535
// complete

SELECT COUNT(USER_ID) AS USERS 
FROM USER_INFO 
WHERE 20 <= AGE AND AGE <= 29 
AND JOINED BETWEEN '2021-01-01' AND '2021-12-31';
