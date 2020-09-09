USE exercise;

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
SELECT 		* , D.DepartmentName
FROM 		`account` A
JOIN 		`department` D ON A.DepartmentID = D.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT 		* 
FROM 		`account`
WHERE		CreateDate < '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer   
SELECT 		* 
FROM 		`account` A
JOIN		`position` P ON A.PositionID = P.PositionID
WHERE		P.PositionName = 'Dev';

-- Question 3: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT 		D.DepartmentName, Count(A.AccountID)
FROM 		`department` D
JOIN		`account` A ON D.DepartmentID = A.DepartmentID
GROUP BY	A.DepartmentID
HAVING		Count(A.AccountID) > 3
ORDER BY	D.DepartmentName;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất 
SELECT 		Q.*, count(EQ.ExamID) MAX_total
FROM		`question` Q 
JOIN		`examquestion` EQ  ON Q.QuestionID = EQ.QuestionID
GROUP BY	EQ.QuestionID
HAVING		count(EQ.ExamID) = (SELECT Max(Count_EQ)
								FROM 
									(SELECT		 Count(EQ.ExamID) AS Count_EQ
									FROM		`examquestion` EQ
									JOIN		`question` Q ON EQ.QuestionID = Q.QuestionID
									GROUP BY	EQ.QuestionID) AS Max_EQ);
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question 
SELECT  		CQ.* , Count(Q.CategoryID) AS Statistical
FROM			`categoryquestion` CQ
LEFT JOIN	 	`question` Q ON CQ.CategoryID = Q.CategoryID
GROUP BY		Q.CategoryID
ORDER BY		CQ.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 
SELECT		 Q.*, Count(EQ.QuestionID) AS Statistical
FROM		`question` Q
LEFT JOIN	`examquestion` EQ ON Q.QuestionID = EQ.QuestionID 
GROUP BY 	EQ.QuestionID ;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT 		Q.*, Count(A.QuestionID) AS MAX_Answer_of_Q
FROM		`question` Q
JOIN		`answer` A ON Q.QuestionID = A.QuestionID
GROUP BY	A.QuestionID
HAVING 		Count(A.QuestionID) = (SELECT	Max(Count_Answer)
									FROM
										(SELECT 		Count(A.QuestionID) AS Count_Answer
										 FROM			`answer` A
										 GROUP BY		A.QuestionID) AS Table_Count_Answer);

-- Question 9: Thống kê số lượng account trong mỗi group  
SELECT 			 G.GroupName, Count(GA.GroupID)  Statistical
FROM			 `group`  G
LEFT JOIN		`groupaccount` GA ON G.GroupID = GA.GroupID
GROUP BY		GA.GroupID
ORDER BY		Count(GA.GroupID);

-- Question 10: Tìm chức vụ có ít người nhất
SELECT		P.PositionName, Count(A.PositionID) AS Min_Position
FROM		`position`	P
JOIN		`account`	A ON  P.PositionID = A.PositionID
GROUP BY	A.PositionID
HAVING		Min_Position = (SELECT	Min(CountID)
							FROM
								(SELECT 		Count(P.PositionID)	CountID
								FROM		`position`	P
								JOIN		`account`  	A ON  P.PositionID = A.PositionID
								GROUP BY 	A.PositionID) AS Found_Min);	

-- Question 12:	Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì,.. 
SELECT		Q.QuestionID, Q.Content, A.Content, TQ.TypeName, Q.CreateDate, Q.CreatorID
FROM 		`answer` A
JOIN		`question` Q ON	A.QuestionID = Q.QuestionID
JOIN		`typequestion` TQ ON  Q.TypeID = TQ.TypeID;

-- Question 13: lấy ra số lượng câu hỏi của mỗi loại 
SELECT		Q.TypeID, TQ.TypeName, Count(Q.TypeID)
FROM		`question` Q
JOIN		`typequestion` TQ ON Q.TypeID = TQ.TypeID
GROUP BY	Q.TypeID;

-- Question 14: lấy ra group không có account nào 
SELECT	DISTINCT	 G.GroupName
FROM				`group` G 
LEFT JOIN			`groupaccount` GA ON G.GroupID = GA.GroupID
WHERE				GA.AccountID IS NULL;	

-- Question 15: lấy ra question không có answer nào 
SELECT DISTINCT 	Q.Content
FROM				`question` Q
LEFT JOIN			`answer` A ON	Q.QuestionID = A.QuestionID
WHERE				A.Content IS NULL;

-- Question 17: 
-- a) Lấy các account thuộc nhóm thứ 1 
SELECT		A.*,GA.GroupID
FROM 		`account` A
JOIN		`groupaccount` GA ON A.AccountID = GA.AccountID
WHERE		GA.GroupID = 1;

-- b) Lấy các account thuộc nhóm thứ 2 
SELECT		A.*,GA.GroupID
FROM 		`account` A
JOIN		`groupaccount` GA ON A.AccountID = GA.AccountID
WHERE		GA.GroupID = 2;

-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau 
SELECT	*
FROM	(SELECT		A.*,GA.GroupID
		FROM 		`account` A
		JOIN		`groupaccount` GA ON A.AccountID = GA.AccountID
		WHERE		GA.GroupID = 1) AS cau_a
UNION DISTINCT
SELECT	*
FROM	(SELECT		A.*,GA.GroupID
		FROM 		`account` A
		JOIN		`groupaccount` GA ON A.AccountID = GA.AccountID
		WHERE		GA.GroupID = 2) AS cau_b;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên 
SELECT		G.GroupName, Count(GA.GroupID) AS Count_member
FROM		`group` G
JOIN		`groupaccount` GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		Count_member > 5;

-- b) Lấy các group có nhỏ hơn 7 thành viên 
SELECT		G.GroupName, Count(GA.GroupID) AS Count_member
FROM		`group` G
JOIN		`groupaccount` GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING		Count_member < 7;

-- c) Ghép 2 kết quả từ câu a) và câu b) 

SELECT 		*
FROM		(SELECT		G.GroupName, Count(GA.GroupID) AS Count_member
			 FROM		`group` G
			 JOIN		`groupaccount` GA ON G.GroupID = GA.GroupID
			 GROUP BY	GA.GroupID
			 HAVING		Count_member > 5) AS table_1
UNION DISTINCT
SELECT		*
FROM		(SELECT		G.GroupName, Count(GA.GroupID) AS Count_member
			 FROM		`group` G
			 JOIN		`groupaccount` GA ON G.GroupID = GA.GroupID
			 GROUP BY	GA.GroupID
			 HAVING		Count_member < 7) AS table_2;
	


















