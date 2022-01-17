CREATE DATABASE everyday;
use everyday;

CREATE TABLE tb_user

(

    f_no INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,

    f_user_id VARCHAR(30),

    f_user_pwd VARCHAR(20),

    u_user_name VARCHAR(20)

);

insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid001', 'upwd001', 'uname001');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid002', 'upwd002', 'uname002');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid003', 'upwd003', 'uname003');