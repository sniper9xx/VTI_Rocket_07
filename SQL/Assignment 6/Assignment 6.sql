USE Exercise;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS _1_account_in_department;
DELIMITER $$
CREATE PROCEDURE _1_account_in_department(IN in_departmentname varchar(20))
BEGIN
SELECT		A.*,D.DepartmentName
FROM		`department` D
JOIN		`account` A ON D.DepartmentID = A.DepartmentID
WHERE		D.DepartmentName = in_DepartmentName;
END $$
DELIMITER ;
	-- Gọi hàm 
CALL	 _1_account_in_department('bán hàng');		

-- Question 2: Tạo store để in ra số lượng account trong mỗi group 
DROP PROCEDURE IF EXISTS  _2_statistical_account;
DELIMITER $$
CREATE PROCEDURE _2_statistical_account()
BEGIN
SELECT		GroupID,Count(GroupID)
FROM 		`groupaccount` 
GROUP BY 	GroupID;
END $$
DELIMITER ;

	-- Gọi hàm
CALL _2_statistical_account();

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại 
DROP PROCEDURE IF EXISTS  _3_statistical_type_ques;
DELIMITER $$
CREATE PROCEDURE _3_statistical_type_ques()
BEGIN
SELECT		TQ.TypeName, IFNULL(Count(Q.TypeID), 0)
FROM		`question`	Q
JOIN 		`typequestion`  TQ	ON Q.TypeID = TQ.TypeID
WHERE		month(Q.CreateDate) = month(now())
GROUP BY	Q.TypeID		
ORDER BY 	TQ.TypeName ;
END $$
DELIMITER ;

	-- Gọi hàm
CALL _3_statistical_type_ques();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS  _4_id_question;
DELIMITER $$
CREATE PROCEDURE _4_id_question()
BEGIN
SELECT		TypeID, Count(TypeID)
FROM		`question`
GROUP BY	TypeID
HAVING		Count(TypeID) = (SELECT	Max(Max_1)
							 FROM
								(SELECT		Count(TypeID) AS Max_1
								FROM 		`question`
								GROUP BY	TypeID) AS table_1); 		
END $$
DELIMITER ;

	-- Gọi hàm
CALL _4_id_question();

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question 
DROP PROCEDURE IF EXISTS  _5_name_question;
DELIMITER $$
CREATE PROCEDURE _5_name_question()
BEGIN
SELECT		TQ.TypeName, Count(Q.TypeID)
FROM		`question` Q
JOIN		`typequestion` TQ  ON Q.TypeID = TQ.TypeID
GROUP BY	Q.TypeID
HAVING		Count(Q.TypeID) = (SELECT	Max(Max_1)
							 FROM
								(SELECT		Count(TypeID) AS Max_1
								FROM 		`question`
								GROUP BY	TypeID) AS table_1); 
END $$
DELIMITER ;

	-- Gọi hàm
CALL _5_name_question();

/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi 
của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào */
DROP PROCEDURE IF EXISTS  _6_enter_a_string;
DELIMITER $$
CREATE PROCEDURE _6_enter_a_string(IN in_string varchar(30), IN in_checked int)
BEGIN
	IF	in_checked = 1 
	THEN	
		SELECT	*
		FROM	`account`
		WHERE	Username LIKE in_string;
	ELSEIF in_checked = 2
    THEN
		SELECT 	*
		FROM 	`group`
        WHERE	GroupName  LIKE in_string;
	END IF;
END $$
DELIMITER ;
	
    -- Gọi hàm
CALL _6_enter_a_string('nhom2',2);

/* Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán 
	username sẽ giống email nhưng bỏ phần @..mail đi 
	positionID: sẽ có default là developer 
    departmentID: sẽ được cho vào 1 phòng chờ 
Sau đó in ra kết quả tạo thành công  */

DROP PROCEDURE IF EXISTS  _7_fullname_and_email;
DELIMITER $$
CREATE PROCEDURE _7_fullname_and_email(IN in_fullname varchar(30), IN in_email varchar(30))
BEGIN
	-- Khai báo biến
    DECLARE   PositionID_insert	 	INT 			DEFAULT 	'1';
    DECLARE   DepartmentID_insert   INT 			DEFAULT  	'2';
	DECLARE	  UserName_insert		VARCHAR(30)		DEFAULT		substring_index(in_email,'@',1);
    DECLARE	  CreateDate_insert		DATE			DEFAULT		NOW();
    -- Thêm bản ghi
    INSERT	INTO	`account`(Email, 	Username, 		 Fullname, 	  DepartmentID, 		PositionID, 		CreateDate)
    VALUES					(in_email,  UserName_insert, in_FullName, DepartmentID_insert,  PositionID_insert,  CreateDate_insert);	
END $$
DELIMITER ;

	-- Gọi hàm
CALL _7_fullname_and_email('HoThanhDat','Dat66060nuce@gmail.com');
	-- Kiểm tra kết quả
SELECT * FROM `account`;

/* Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice 
để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất */

DROP PROCEDURE IF EXISTS  _8_Essay_Or_Multiple;
DELIMITER $$
CREATE PROCEDURE _8_Essay_Or_Multiple(IN in_check_string varchar(30))
BEGIN

IF	(in_check_string = 'Essay')
THEN
	SELECT		TQ.TypeName, Q.Content, length(content)
	FROM		`question` Q
	JOIN		`typequestion` TQ  ON Q.TypeID = TQ.TypeID
    WHERE		TQ.TypeName = 'Essay'
    GROUP BY	TQ.TypeName
	HAVING		length(content) = (SELECT Max(length_1) -- Tìm max(length) của typeID = 1
									FROM	
										(SELECT 	length(Content) length_1
										 FROM		`question`
										 WHERE		TypeID = 1) AS Table_1);
ELSEIF	(in_check_string = 'Multiple-Choice')
THEN
	SELECT		TQ.TypeName, Q.Content, length(content)
	FROM		`question` Q
	JOIN		`typequestion` TQ  ON Q.TypeID = TQ.TypeID
    WHERE		TQ.TypeName = 'Multiple-Choice'
    GROUP BY	TQ.TypeName
	HAVING		length(content) = (SELECT Max(length_2) -- Tìm max(length) của typeID = 2
									FROM
										(SELECT 	length(Content) length_2
										 FROM		`question`
										 WHERE		TypeID = 2) AS Table_2);
END IF; 
END $$
DELIMITER ;

	-- Gọi hàm
CALL _8_Essay_Or_Multiple('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID 

DROP PROCEDURE IF EXISTS  _9_Delete_Exam;
DELIMITER $$
CREATE PROCEDURE _9_Delete_Exam(IN in_checked_id int)
BEGIN
DELETE	
FROM	`exam`
WHERE	ExamID = in_checked_id;
END $$
DELIMITER ;

	-- Gọi hàm
CALL _9_Delete_Exam(10);

/* Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa), 
sau đó in số lượng record đã remove từ các table liên quan trong khi removing */
DROP PROCEDURE IF EXISTS  _10_Delete_Exam_3_Year_Ago;
DELIMITER $$
CREATE PROCEDURE _10_Delete_Exam_3_Year_Ago()
BEGIN
DECLARE	cal_year DATE;
WITH Exam_ID AS(
	 SELECT 	  ExamID
	 FROM		  Exam
	 -- now() - (creatdate) = cal_year sẽ trả ra 'YY-MM-DD'
	 WHERE		  now() - (createdate) = cal_year AND Year(cal_year) >= 3)
DELETE	
FROM	`exam`
WHERE	ExamID = (SELECT 	ExamID 
				  FROM		Exam_ID);
END $$
DELIMITER ;

	-- Gọi hàm
CALL _10_Delete_Exam_3_Year_Ago();

/* Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và 
				các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc */
DROP PROCEDURE IF EXISTS  _11_Delete_Department;
DELIMITER $$             
CREATE PROCEDURE _11_Delete_Department(IN in_DepartmentName VARCHAR(20))
BEGIN                
DECLARE	   DepartmentID_In 	INT	 DEFAULT  2;
DELETE 
FROM		`department`
WHERE		DepartmentName = in_DepartmentName;
 
UPDATE	   `account`
SET			DepartmentID = DepartmentID_In
WHERE		DepartmentID = (SELECT	DepartmentID
							FROM	`department`
							WHERE	DepartmentName = in_DepartmentName);                      
END $$
DELIMITER ;               

	-- Gọi hàm
SET SQL_SAFE_UPDATES = 0;
CALL _10_Delete_Department('kiểm soát');

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay 
DROP PROCEDURE IF EXISTS  _12_Statistical;
DELIMITER $$             
CREATE PROCEDURE _12_Statistical()
BEGIN               
SELECT		CheckMonth.MONTH, IFNULL(Count(QuestionID), '0') AS So_cau_hoi
FROM
		(	-- Tạo ra 1 bảng gồm 12 tháng		
					SELECT	1  AS MONTH
			UNION   SELECT	2  AS MONTH
			UNION   SELECT	3  AS MONTH
			UNION   SELECT	4  AS MONTH
			UNION   SELECT	5  AS MONTH
			UNION   SELECT	6  AS MONTH
			UNION   SELECT	7  AS MONTH
			UNION   SELECT	8  AS MONTH
			UNION   SELECT	9  AS MONTH
			UNION   SELECT	10 AS MONTH
			UNION   SELECT	11 AS MONTH
			UNION   SELECT	12 AS MONTH
		)	AS CheckMonth 
LEFT JOIN  	`question` ON CheckMonth.MONTH = MONTH(Createdate) 		
WHERE		YEAR(question.CreateDate) = YEAR(now())
GROUP BY	CheckMonth.MONTH	
ORDER BY	CheckMonth.MONTH;
END $$
DELIMITER ;               

	-- Gọi hàm
CALL _12_Statistical();

/* Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất 
(nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng") */

DROP PROCEDURE IF EXISTS  _13_Statistical;
DELIMITER $$             
CREATE PROCEDURE _13_Statistical()
BEGIN 
SELECT		CheckMonth.MONTH, IFNULL(Count(QuestionID), 'Không có câu hỏi nào trong tháng') AS So_cau_hoi
FROM
		(	-- 	interval : khoảng thời gian
					SELECT	MONTH(now() - interval 5 month) AS MONTH
			UNION   SELECT	MONTH(now() - interval 4 month) AS MONTH
            UNION   SELECT	MONTH(now() - interval 3 month) AS MONTH
            UNION   SELECT	MONTH(now() - interval 2 month) AS MONTH
            UNION   SELECT	MONTH(now() - interval 1 month) AS MONTH
			UNION   SELECT	MONTH(now()) 				    AS MONTH	
		)	AS CheckMonth 
LEFT JOIN  	`question` ON CheckMonth.MONTH = MONTH(Createdate) 		
WHERE		YEAR(question.CreateDate) = YEAR(now())
GROUP BY	CheckMonth.MONTH	
ORDER BY	CheckMonth.MONTH;
END $$
DELIMITER ;               

	-- Gọi hàm
CALL  _13_Statistical();

