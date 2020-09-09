USE Exercise;

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale(bán hàng)
CREATE	VIEW List_Of_Employee
AS
SELECT		A.*, D.DepartmentName
FROM		`account` A
JOIN		`department` D ON A.DepartmentID = D.DepartmentID
WHERE		D.DepartmentName = 'bán hàng';

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất 
CREATE VIEW Information_Account_Max_Group
AS
SELECT		A.*,Count(GA.AccountID) AS number_involved
FROM		`account` A
JOIN		`groupaccount` GA  ON A.AccountID = GA.AccountID
GROUP BY	GA.AccountID
HAVING		Count(GA.AccountID) = (SELECT	Max(Count_1)
								   FROM	
										(SELECT		Count(AccountID) AS Count_1
										FROM		`groupaccount`
										GROUP BY	AccountID) AS result_1);

/* Question 3: Tạo view có chứa câu hỏi có những content quá dài 
(content quá 300 từ được coi là quá dài) và xóa nó đi */
-- Tạo View
CREATE VIEW 	Count_Content
AS
SELECT			QuestionID
FROM			`question`
WHERE			length(content) > 300;

-- Xoá nó đi
DELETE 		
FROM	`question`
WHERE	QuestionID =  (SELECT	QuestionID
					   FROM	    (SELECT		QuestionID
								 FROM		`question` 
								 WHERE		length(content) > 300) AS table_1);
							
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất 
CREATE	VIEW	Department_Max_Employee
AS
SELECT			G.GroupName, Count(GA.GroupID) AS List_Max
FROM			`group` G
JOIN			`groupaccount` GA  ON  G.GroupID = GA.GroupID
GROUP BY		GA.GroupID
HAVING			List_Max = (SELECT MAX(List1)
							FROM
								(SELECT 	Count(GroupID) List1
								FROM		`groupaccount` 
								GROUP BY	GroupID) AS table_1);

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo 	
CREATE VIEW		Nguyen_Question
AS		
SELECT			Q.*
FROM			`question` Q
JOIN			`account` A  ON Q.CreatorID = A.AccountID
WHERE      		 Q.CreatorID  IN	(SELECT	 	AccountID
									 FROM	  	`account` 
									 WHERE		Username LIKE 'Nguyen%');

