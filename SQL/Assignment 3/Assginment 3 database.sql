USE Exercise;

INSERT INTO `Department`(DepartmentName) 
VALUES 		('Bán hàng'),
			('Tiếp thị'),
			('Hành chính'),
            ('Kế hoạch'),
            ('Kế toán'),
            ('Vật tư'),
            ('Dự án'),
            ('Thư ký'),
            ('Trợ lý'),
            ('Kiểm soát');

SELECT * FROM department;

INSERT INTO `position`(PositionName)
VALUES 		('Dev'),
			('Test'),
			('Scrum Master'),
            ('PM');

SELECT * FROM position;

INSERT INTO `account` ( Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 
(' hothanhdat@gmail.com',		'Dat',			'HoThanhDat',		'1',	'1',	'2020-08-28'),
(' nguyenthanhdat@gmail.com',	'DAtNguyen',	'NguyenThanhDat',	'2',	'1',	'2000-08-20'),
(' tranthanhdat@gmail.com',		'DatTran',		'TranThanhDat',		'3',	'2',	'2010-06-10'),
(' lethanhdat@gmail.com',		'DatLe',		'LeThanhDat',		'5',	'4',	'2011-01-01'),
(' nguyenvanbinh@gmail.com',	'Binh',			'NguyenVanBinh',	'1',	'3',	'2011-02-08'),
(' tranvanbinh@gmail.com',		'BinhTran',		'TranVanBinh',		'1',	'4',	'1997-05-02'),
(' levanbinh@gmail.com',		'BinhLe',		'LeVanBinh',		'10',	'3',	'1994-02-02'),
(' nguyenvansy@gmail.com',		'Sy',			'NguyenVanSy',		'9',	'2',	'2007-12-07'),
(' tranvansy@gmail.com',		'SyTran',		'NguyenVanSy',		'8',	'4',	'2012-03-02'),
(' levansy@gmail.com',			'SyLe',			'LeVanSy',			'7',	'3',	'1995-07-09');

SELECT * FROM `account`;

INSERT INTO `Group`(GroupName,CreatorID,CreateDate)
VALUES 		('Nhom1',	'1',	'2010-10-10'),
			('Nhom2',	'3',	'2010-09-01'),
			('Nhom3',	'5',	'1998-08-02'),
			('Nhom4',	'1',	'2005-08-04'),
			('Nhom5',	'7',	'2009-01-03'),
			('Nhom6',	'8',	'2007-02-01'),
			('Nhom7',	'2',	'1997-03-15'),
			('Nhom8',	'3',	'1997-05-21'),
			('Nhom9',	'5',	'1999-08-21'),
			('Nhom10',	'9',	'2000-07-11');

SELECT * FROM `group`;

INSERT INTO  `GroupAccount`( GroupID,AccountID,JoinDate)
VALUES		('1',	'1',	'2020-11-20'),
			('1',	'2',	'2020-12-10'),
			('1',	'5',	'2020-12-02'),
			('2',	'4',	'2020-10-29'),
			('3',	'4',	'2000-02-03'),
			('5',	'9',	'2006-08-07'),
			('2',	'10',	'2020-10-19'),
			('7',	'6',	'1999-01-20'),
			('8',	'7',	'2002-05-17'),
			('10',	'2',	'2005-08-21');

SELECT * FROM `groupaccount`; 

INSERT INTO `typequestion`(TypeName)
VALUES	('Essay'),
		('Multiple-Choice');

SELECT * FROM typequestion;

INSERT INTO `CategoryQuestion`(CategoryName)
VALUES 
			('Java'),
			('.NET'),
			('SQL sever'),
			('SQL workbench'),
			('Postman'),
			('Ruby'),
			('PHP'),
			('Linux'),
			('Windows'),
			('MacOS');

SELECT * FROM `CategoryQuestion`;

INSERT INTO `question`(Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUES
('Lam cach nao de insert du lieu trong mysql ?',	'4',	'1',	'1',	'2020-12-20'),
('Lam cach nao de xoa du lieu trong mysql ?',		'4',	'2',	'5',	'2020-10-29'),
('Tai lieu hoc PHP tham khao o dau ?',				'7',	'1',	'2',	'2006-08-21'),
('Cach su dung he dieu hanh MacOS ?',				'10',	'1',	'4',	'2001-02-03'),
('Cach su dung he dieu hanh Windows ?',				'9',	'1',	'5',	'2020-10-28'),
('.NET la gi ?',									'2',	'2',	'6',	'1999-01-25'),
('Tai sao phai hoc Java ?',							'1',	'2',	'6',	'2002-01-20'),
('Loi the cua Sqlsever la gi?',						'3',	'1',	'1',	'2020-12-21'),
('Uu diem cua he dieu hanh Linux ?',				'8',	'1',	'7',	'2003-05-20'),
('Postman duoc su dung de lam gi ?',				'5',	'1',	'7',	'2004-05-03'),
('Ruby co duoc su dung pho bien khong?',			'6',	'1',	'4',	'2007-02-03');

SELECT * FROM `question`;

INSERT INTO `answer`(Content,QuestionID,isCorrect)
VALUES
('Dung lenh Insert into',		'1',		'True'),
('Dung lenh delete from',		'2',		'True'),
('Tao chiu',					'3',		'False'),
('Tao cung chiu',				'4',		'False'),
('Len mang ma xem',				'5',		'True'),
('Len google ma tim',			'6',		'True'),
('Hoc nhieu cho do ngu',		'7',		'True'),
('Tao khong biet',				'8',		'False'),
('Hoi lam the, tao khong biet',	'9',		'False'),
('I DONT CARE',				   '10',		'False'),
('Tao doan la khong',		   '11',		'False');


SELECT * FROM `answer`;

INSERT INTO `exam`(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate)
VALUES		('050',		'Thi khao sat',		'1',	'45',	'1',	'2010-05-08'),
			('051',		'Thi giua ki',		'2',	'15',	'2',	'2005-05-09'),
			('052',		'Thi cuoi ki',		'1',	'30',	'3',	'2007-06-08'),
			('053',		'Thi sat hach',		'3',	'45',	'1',	'2002-02-03'),
			('054',		'Thi lai',			'4',	'90',	'9',	'2002-10-18'),
			('055',		'Thi het mon',		'5',	'90',  '10',	'2003-09-11'),
			('056',		'Thi giua nam hoc',	'7',   ' 90',	'5',	'2005-01-07'),
			('057',		'Thi cuoi nam hoc',	'9',	'90',	'6',	'2011-05-09'),
			('058',		'Thi tot nghiep',	'6',	'90',	'10',	'2015-01-02'),
			('059',		'Thi dai hoc',		'10',	'45',	'3',	'2013-03-03');

SELECT * FROM `exam`;

INSERT INTO `ExamQuestion`(ExamID,QuestionID)
VALUES 		('1',	'1'),
			('1	',	'2'),
			('3',	'1'),
			('5',	'3'),
			('4',	'4'),
			('6',	'8'),
			('2',	'7'),
			('10',	'5'),
			('8',	'9'),
			('9',	'10'),
			('7',	'2');
            
SELECT * FROM `ExamQuestion`;




