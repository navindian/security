MY SQL commands
------------------
Create Database <SpringDB>;
Create Table <Appuser> (Id INT PRIMARYKEY NOTNULL AUTOINCREMENT ,username varchar(255), password varchar(255),authorities varchar(255));
INSERT INTO appuser (authorities, password, username) VALUES ('ROLE_ADMIN, ROLE_EM PLOYEE, ROLE_MANAGER', '$2a$10$aS/lF2c/9JWPUjDHfJ/zTed1ihGBgfX/7xnGTOM5/lW59X4FHalSi', kavitha);
Note:
$2a$10$aS/lF2c/9JWPUjDHfJ/zTed1ihGBgfX/7xnGTOM5/lW59X4FHalSi is the bcrypted values for ‘123456’

Note:
Hash value match can be had from bcrypt generator online.
https://www.bcrypt-generator.com/


Running in the Postman
-------------------------

(1)	http://localhost:8080/SpringJWT
{ 
  "id" : "1",
  "username" : "kavitha",
  "password" : "123456"
  "authorities" : "ROLE_ADMIN, ROLE_EMPLOYEE, ROLE_MANAGER",

}

(2)	http://localhost:8080/SpringJWT/auth with body
{ 
  "username" : "kavitha",
  "password" : "123456"
}
you will get result
{
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJrYXZpdGhhIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNDc1MjEwOTExMjIwLCJleHAiOjE0NzU4MTU3MTF9.mcfV1DKZ7w2ZZcmEszV8BCXlsMf3i9n65pQ89N1FfCY9Xa90fg9xoaoBtuWoaNABRqRXpW04WScxFCHVxbHZbA "
}
(3)	http://localhost:8080/SpringJWT/protected with header
X- AUTH-TOKEN =” eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJrYXZpdGhhIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNDc1MjEwOTExMjIwLCJleHAiOjE0NzU4MTU3MTF9.mcfV1DKZ7w2ZZcmEszV8BCXlsMf3i9n65pQ89N1FfCY9Xa90fg9xoaoBtuWoaNABRqRXpW04WScxFCHVxbHZbA”
Should return response entity as “Success:/”true”

