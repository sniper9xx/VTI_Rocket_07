USE assignment122;

INSERT INTO `Department`(DepartmentName) 
VALUEs ('Bán hàng'),('Tiếp thị'),('Hành chính'),('Kế hoạch'),('Kế toán'),('Vật tư'),('Dự án'),('Thư ký'),('Trợ lý'),('Kiểm soát');

SELECT 
    *
FROM
    department;
    
INSERT INTO `position`(PositionName)
VALUES ('Dev'),('Test'),('Scrum Master'),('PM');

SELECT 
    *
FROM
    `position`;

INSERT INTO `account` ( Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 
(' hothanhdat@gmail.com','Dat','HoThanhDat','1','1','2020-08-28'),
(' nguyenthanhdat@gmail.com','DAtNguyen','NguyenThanhDat','2','1','2000-08-20'),
(' tranthanhdat@gmail.com','DatTran','TranThanhDat','3','2','2010-06-10'),
(' lethanhdat@gmail.com','DatLe','LeThanhDat','5','4','2011-01-01'),
(' nguyenvanbinh@gmail.com','Binh','NguyenVanBinh','1','3','2011-02-08'),
(' tranvanbinh@gmail.com','BinhTran','TranVanBinh','1','4','1997-05-02'),
(' levanbinh@gmail.com','BinhLe','LeVanBinh','10','3','1994-02-02'),
(' nguyenvansy@gmail.com','Sy','NguyenVanSy','9','2','2007-12-07'),
(' tranvansy@gmail.com','SyTran','NguyenVanSy','8','4','2012-03-02'),
(' levansy@gmail.com','SyLe','LeVanSy','7','3','1995-07-09');

SELECT 
    *
FROM
    `account`;

DELETE from `account`where AccountID;
alter table `account`AUTO_INCREMENT = 1;

INSERT INTO `Group`(GroupName,CreatorID,CreateDate)
Values 
('Nhom1','1','2010-10-10'),
('Nhom2','3','2010-09-01'),
('Nhom3','5','1998-08-02'),
('Nhom4','1','2005-08-04'),
('Nhom5','7','2009-01-03'),
('Nhom6','8','2007-02-01'),
('Nhom7','2','1997-03-15'),
('Nhom8','3','1997-05-21'),
('Nhom9','5','1999-08-21'),
('Nhom10','9','2000-07-11')
;


SELECT 
    *
FROM
    `Group`;
    
INSERT INTO  `GroupAccount`( GroupID,AccountID,JoinDate)
VALUES
('1','1','2020-11-20'),
('1','2','2020-12-10'),
('1','5','2020-12-02'),
('2','4','2020-10-29'),
('3','4','2000-02-03'),
('5','9','2006-08-07'),
('2','10','2020-10-19'),
('7','6','1999-01-20'),
('8','7','2002-05-17'),
('10','2','2005-08-21')
;

SELECT 
    *
FROM
    `GroupAccount`;
    
INSERT INTO `typequestion`(TypeName)
Values
('Essay'),
('Multiple-Choice')
;

SELECT 
    *
FROM
   `typequestion`;

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
('MacOS')
;

SELECT 
    *
FROM
   `CategoryQuestion`;
   
insert into `question`(Content,CategoryID,TypeID,CreatorID,CreateDate)
values
('Lam cach nao de insert du lieu trong mysql ?','4','1','1','2020-12-20'),
('Lam cach nao de xoa du lieu trong mysql ?','4','2','5','2020-10-29'),
('Tai lieu hoc PHP tham khao o dau ?','7','1','2','2006-08-21'),
('Cach su dung he dieu hanh MacOS ?','10','1','4','2001-02-03'),
('Cach su dung he dieu hanh Windows ?','9','1','5','2020-10-28'),
('.NET la gi ?','2','2','6','1999-01-25'),
('Tai sao phai hoc Java ?','1','2','6','2002-01-20'),
('Loi the cua Sqlsever la gi?','3','1','1','2020-12-21'),
('Uu diem cua he dieu hanh Linux ?','8','1','7','2003-05-20'),
('Postman duoc su dung de lam gi ?','5','1','7','2004-05-03'),
('Ruby co duoc su dung pho bien khong?','6','1','4','2007-02-03')
;

SELECT 
    *
FROM
   `question`;

INSERT INTO `answer`(Content,QuestionID,isCorrect)
VALUES
('Dung lenh Insert into','1','True'),
('Dung lenh delete from','2','True'),
('Tao chiu','3','False'),
('Tao cung chiu','4','False'),
('Len mang ma xem','5','True'),
('Len google ma tim','6','True'),
('Hoc nhieu cho do ngu','7','True'),
('Tao khong biet','8','False'),
('Hoi lam the, tao khong biet','9','False'),
('cut cmmd, hoi cc','10','False'),
('Tao doan la khong','11','False')
;

SELECT 
    *
FROM
   `answer`;

insert into `exam`(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate)
values
('050','Thi khao sat','1','45','1','2010-05-08'),
('051','Thi giua ki','2','15','2','2005-05-09'),
('052','Thi cuoi ki','1','30','3','2007-06-08'),
('053','Thi sat hach','3','45','1','2002-02-03'),
('054','Thi lai','4','90','9','2002-10-18'),
('055','Thi het mon','5','90','10','2003-09-11'),
('056','Thi giua nam hoc','7',' 90','5','2005-01-07'),
('057','Thi cuoi nam hoc','9','90','6','2011-05-09'),
('058','Thi tot nghiep','6','90','10','2015-01-02'),
('059','Thi dai hoc','10','45','3','2013-03-03')
;

SELECT * from exam;

ALTER TABLE `exam` AUTO_INCREMENT = 1;

insert into `ExamQuestion`(ExamID,QuestionID)
values 
('1','1'),
('1','2'),
('3','1'),
('5','3'),
('4','4'),
('6','8'),
('2','7'),
('10','5'),
('8','9'),
('9','10'),
('7','2')
;

SELECT * from `ExamQuestion`;

 -- ------------------ Assignment 3 --------------

-- Cau 2: Lấy ra tất cả các phòng ban
select *from department ORDER BY DepartmentID;

-- Cau 3: Lấy ra id của phòng ban "Bán hàng"
select * from department where DepartmentName = 'Bán hàng';

-- Câu 4: Lấy ra thông tin account có FullName dài nhất và sắp xếp chúng theo thứ tự giảm dần
SELECT *,length(FullName) as So_ki_tu from `account` GROUP BY FullName HAVING length(FullName) ORDER BY length(FullName) DESC;

-- Câu 5: Lấy ra thông tin account có Fullname dài nhất và thuộc phòng ban có id = 3
SELECT *,length(FullName) as So_ki_tu from `account` where DepartmentID = '3' GROUP  BY FullName HAVING length(FullName) ORDER BY length(FullName) DESC LIMIT 1;

-- Câu 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT GroupName,CreateDate FROM `group` WHERE CreateDate < '2019-12-20';

-- Câu 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT QuestionID, count(QuestionID) FROM answer GROUP BY QuestionID HAVING count(QuestionID) >= '4' ORDER BY QuestionID;

-- Câu 8:  Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT `code`,duration,createdate FROM exam where duration >= 60 and Createdate < '2019-12-20';

-- Câu 9:  Lấy ra 5 group được tạo gần đây nhất
SELECT GroupName, Createdate FROM `group` where createdate <'2020-08-28' ORDER BY Createdate DESC limit 5;

-- Câu 10: Đếm số nhân viên thuộc department có id = 2 
SELECT count(DepartmentID) as dem_so_nhan_vien FROM `account` where departmentid = '2' GROUP BY departmentid HAVING count(departmentid);

-- Câu 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" 
SELECT UserName as ten FROM `account` WHERE UserName LIKE 'D%o'; 

-- Câu 12:  Xóa tất cả các exam được tạo trước ngày 20/12/2019 
SET SQL_SAFE_UPDATES = 0;
DELETE FROM `exam` WHERE createdate < '2019-12-20';

-- Câu 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 
DELETE FROM `question` WHERE content LIKE 'câu hỏi %';

-- Câu 14:  update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE `account` SET fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn' WHERE AccountID = 5 ;

-- Câu 15:  update account có id = 5 sẽ thuộc group có id = 4 
UPDATE 	`GroupAccount`  SET AccountID = 5 WHERE GroupID = 4;

-- -------------- Assignment 4 --------------

-- Câu 1: 



