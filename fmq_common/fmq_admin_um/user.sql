#用户表
CREATE TABLE IF NOT EXISTS `fmq_user`(
       `id` INT UNSIGNED AUTO_INCREMENT,
       `user_Name` VARCHAR(100) NOT NULL,
       `pass_Word` VARCHAR(40) NOT NULL,
       `create_date` DATE,
       PRIMARY KEY ( `id` )
     )ENGINE=InnoDB DEFAULT CHARSET=utf8;
     
INSERT INTO fmq_user(user_Name,pass_Word) VALUES ('1','123');