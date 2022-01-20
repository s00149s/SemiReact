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

CREATE TABLE user
(
    id VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    nickname VARCHAR(20) NOT NULL,
    enteranceyear VARCHAR(10) NOT NULL,
    school VARCHAR(20) NOT NULL,
    token VARCHAR(255),
    tokenexpiration INT(10)
);

insert into user(id, password, email, nickname, enteranceyear, school) values('admin', '1112', 'admin@study.react', 'REACTER', '2021', 'PSICKUNIV');