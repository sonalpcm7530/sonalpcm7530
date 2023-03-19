CREATE TABLE IF NOT EXISTS `student_info` (
    `id` INT(10) NOT NULL AUTO_INCREMENT,
    `name` TEXT NOT NULL,
    `dob` TEXT NOT NULL,
    `fname` TEXT NOT NULL,
    `mname` TEXT NOT NULL,
    `sex` TEXT NOT NULL,
    `nationality` TEXT NOT NULL,
    `religion` TEXT NOT NULL,
    `blood` TEXT NOT NULL,
    `subject` TEXT NOT NULL,
    `admission` TEXT NOT NULL,
    `address` TEXT NOT NULL,
    `studentid` TEXT NOT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1 AUTO_INCREMENT=1;
CREATE TABLE IF NOT EXISTS `user` (
    `id` INT(10) NOT NULL AUTO_INCREMENT,
    `un` TEXT NOT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1 AUTO_INCREMENT=4;
INSERT INTO `user` (`id`, `un`) VALUES
(1, 'Shyam'),
(3, 'Harish'),
(4,'Ravi');
select * from user;