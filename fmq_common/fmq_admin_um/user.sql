#用户表
CREATE TABLE IF NOT EXISTS `UserInfo`(
       `id` INT UNSIGNED AUTO_INCREMENT,
       `userName` VARCHAR(100) NOT NULL,
       `passWord` VARCHAR(40) NOT NULL,
       `create_date` DATE,
       PRIMARY KEY ( `id` )
     )ENGINE=InnoDB DEFAULT CHARSET=utf8;
     
INSERT INTO UserInfo(userName,passWord) VALUES ('1','123');