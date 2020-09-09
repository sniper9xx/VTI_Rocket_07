USE Exercise;

-- Cau 2: Lấy ra tất cả các phòng ban
SELECT * FROM department 
ORDER BY DepartmentID;

-- Cau 3: Lấy ra id của phòng ban "Bán hàng"
SELECT * FROM department 
WHERE DepartmentName = 'Bán hàng';

-- Câu 4: Lấy ra thông tin account có FullName dài nhất và sắp xếp chúng theo thứ tự giảm dần
SELECT *,length(FullName) AS So_ki_tu 
FROM 		`account` 
GROUP BY 	FullName 
ORDER BY 	length(FullName) DESC;

-- Câu 5: Lấy ra thông tin account có Fullname dài nhất và thuộc phòng ban có id = 3
SELECT *,length(FullName) AS So_ki_tu 
FROM 		`account` 
WHERE 		DepartmentID = '3' 
GROUP  BY   FullName 
ORDER BY 	length(FullName) DESC 
LIMIT 1;

-- Câu 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT	 	GroupName,CreateDate 
FROM 		`group` 
WHERE 		CreateDate < '2019-12-20';

-- Câu 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT		 QuestionID, count(content)
FROM 		`answer`
GROUP BY 	QuestionID 
HAVING 		count(content) >= '1' 
ORDER BY 	QuestionID;

-- Câu 8:  Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT `code`,duration,createdate 
FROM 	exam 
WHERE 	duration >= 60 AND Createdate < '2019-12-20';

-- Câu 9:  Lấy ra 5 group được tạo gần đây nhất
SELECT 		GroupName, Createdate 
FROM 		`group`
ORDER BY 	Createdate DESC 
LIMIT 5;

-- Câu 10: Đếm số nhân viên thuộc department có id = 2 
SELECT 	 	count(DepartmentID) AS dem_so_nhan_vien 
FROM 		`account` 
WHERE 		departmentid = '2'
GROUP BY 	departmentid;

-- Câu 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" 
SELECT 		UserName AS ten 
FROM 		`account` 
WHERE	 	UserName LIKE 'D%o'; 

-- Câu 12:  Xóa tất cả các exam được tạo trước ngày 20/12/2019 
SET SQL_SAFE_UPDATES = 0;

DELETE 
FROM 	`exam` 
WHERE 	createdate < '2019-12-20';

-- Câu 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 
DELETE 
FROM 	`question` 
WHERE 	content LIKE 'câu hỏi %';

-- Câu 14:  update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE 		`account` 
SET 		fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn' 
WHERE 		AccountID = 5 ;

-- Câu 15:  update account có id = 5 sẽ thuộc group có id = 4 
UPDATE 		`GroupAccount` 
SET 		GroupID = 4
WHERE 		AccountID = 5;