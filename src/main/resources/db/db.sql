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


    id: {
        type: String,
        maxLength: 50,
        unique: 1
    },
    password: {
        type: String,
    },
    email: {
        type: String,
    },
    nickname: {
        type: String,
    },
    entranceYear: {
        type: String,
    },
    school: {
        type: String,
    },
    token: {
        type: String,
    },
    tokenExpiration: {
        type: Number,
    }

insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid001', 'upwd001', 'uname001');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid002', 'upwd002', 'uname002');
insert into tb_user(f_user_id, f_user_pwd, u_user_name) values('uid003', 'upwd003', 'uname003');