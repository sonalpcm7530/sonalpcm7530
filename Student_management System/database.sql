CREATE TABLE IF NOT EXISTS studentdata(
  roll_No int(2) NOT NULL DEFAULT 0,
  sname varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '',
  clgname varchar(10) CHARACTER SET utf8 NOT NULL DEFAULT '',
  city  varchar(10) CHARACTER SET utf8 NOT NULL DEFAULT '',
  percentage int(10) NOT NULL DEFAULT 0
  );
INSERT INTO studentdata(roll_No, sname , clgname, city ,percentage)values 
(1, 'John Deo', 'DIT','A', 75), 
(2, 'Max Ruin', 'SRM', 'b',85), 
(3, 'Arnold', 'DIT','c', 55), 
(4, 'Krish Star', 'VIT','d', 60), 
(5, 'John Mike', 'DIT','e', 60), 
(6, 'Alex John', 'DIT', 'f',55), 
(7, 'My John Rob', 'SRM','g', 78), 
(8, 'Asruid', 'KITTEE','h', 85), 
(9, 'Tes Qry', 'DIT', 'i',78), 
(10, 'Big John', 'SRM','j', 55), 
(11, 'Ronald', 'VIT', 'k',89), 
(12, 'Recky', 'VIT','l', 94), 
(13, 'Kty', 'VIT','m', 88), 
(14, 'Bigy', 'VIT','n', 88), 
(15, 'Tade Row', 'DIT','o', 88), 
(16, 'Gimmy', 'DIT','p', 88), 
(17, 'Tumyu', 'DIT','q', 54), 
(18, 'Honny', 'SRM','r', 75), 
(19, 'Tinny', 'NITTEE','s',89), 
(20, 'Jackly', 'UPES','t', 65), 
(21,'Anjali','SRM','v',98), 
(22,'OM','DIT','v',64), 
(23,'Haris','KITTE','s',74);
select * from studentdata;