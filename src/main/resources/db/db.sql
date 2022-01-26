CREATE DATABASE everyday;
use everyday;

CREATE TABLE tb_user

(

    f_no INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,

    f_user_id VARCHAR(30),

    f_user_pwd VARCHAR(20),

    u_user_name VARCHAR(20)

);

CREATE TABLE user
(
    id VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(20),
    email VARCHAR(50),
    nickname VARCHAR(20),
    enteranceyear VARCHAR(10),
    school VARCHAR(20),
    token VARCHAR(255),
    tokenexpiration INT(10)
);


insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid001', 'upwd001', 'uname001');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid002', 'upwd002', 'uname002');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid003', 'upwd003', 'uname003');


#2022-01-22

ALTER TABLE user
ADD COLUMN sex CHAR(1);


UPDATE user set sex='F' WHERE sex IS NULL;


ALTER TABLE user
ADD COLUMN del_yn CHAR(1);


UPDATE user set del_yn='N' WHERE del_yn IS NULL;


