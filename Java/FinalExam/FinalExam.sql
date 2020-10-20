DROP DATABASE IF EXISTS `Exam`;
CREATE DATABASE IF NOT EXISTS `Exam`;
USE Exam;

CREATE TABLE IF NOT EXISTS `Candidate` (
    id INT AUTO_INCREMENT,
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    pass VARCHAR(30) NOT NULL,
    phone VARCHAR(11),
    email VARCHAR(50) NOT NULL,
    expInYear TINYINT,
    proSkill VARCHAR(50),
    graduationRank enum('Excellence', 'Good', 'Fair', 'Poor'),
    PRIMARY KEY (id)
);

INSERT into `Candidate` (firstName,lastName,pass,phone, email,expInYear, proSkill,graduationRank) 
VALUES ('Ho',		'Thanh Dat',	'dat66060nuce',		'0344343895',	'dat.hothanh@vti.com.vn',		'',		'',		'Poor'),
	   ('Nguyen',	'Van Binh',		'binh99960nuce',	'0934893723',	'binh.nguyenvan@vti.com.vn',	'1',	'dev',	'');

select * from `Candidate`;

