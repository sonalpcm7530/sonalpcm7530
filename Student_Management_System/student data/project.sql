SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
CREATE TABLE IF NOT EXISTS `student_info` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `dob` text NOT NULL,
  `fname` text NOT NULL,
  `mname` text NOT NULL,
  `sex` text NOT NULL,
  `nationality` text NOT NULL,
  `religion` text NOT NULL,
  `blood` text NOT NULL,
  `subject` text NOT NULL,
  `admission` text NOT NULL,
  `address` text NOT NULL,
  `studentid` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;
select * from student_info;

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `un` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

INSERT INTO `user` (`id`, `un`) VALUES(
(1, 'kazi'),
(2, 'bitto'),
(3,'Haris'),
(4,'Shyam'));
select * from user;