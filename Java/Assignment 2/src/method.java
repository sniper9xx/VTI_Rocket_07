import java.util.Date;

public class method {
	
	// Question 1:
	public static void  Sochan(){
		for(int i = 0; i <= 10; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	//Question 2:

	// Question 3:
	public static void  Soduong(){
		for(int i = 1; i <= 10; i++){
				System.out.println(i);	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sochan(); // Call Q1
				  // Call Q2
		Soduong(); //Call Q3
		
		// Insert dữ liệu
		Department depart1 = new Department();
		depart1.DepartmentID = 1;
		depart1.DepartmentName = "Bán hàng";

		Department depart2 = new Department();
		depart2.DepartmentID = 2;
		depart2.DepartmentName = "Tiếp thị";

		Department depart3 = new Department();
		depart3.DepartmentID = 3;
		depart3.DepartmentName = "Hành chính";

		Department depart4 = new Department();
		depart4.DepartmentID = 4;
		depart4.DepartmentName = "Kế toán";

		Department depart5 = new Department();
		depart5.DepartmentID = 5;
		depart5.DepartmentName = "Dự án";

		// Khởi tạo bảng Position
		Position pos1 = new Position();
		pos1.PositionID = 1;
		pos1.PositionName = positionName.Dev;

		Position pos2 = new Position();
		pos2.PositionID = 2;
		pos2.PositionName = positionName.Test;

		Position pos3 = new Position();
		pos3.PositionID = 3;
		pos3.PositionName = positionName.ScrumMaster;

		Position pos4 = new Position();
		pos4.PositionID = 4;
		pos4.PositionName = positionName.PM;

		// Khoi tao bang Account
		Account acc1 = new Account();
		acc1.AccountID = 1;
		acc1.Email = "hothanhdat@gmail.com";
		acc1.UserName = "Dat";
		acc1.FullName = "HoThanhDat";
		acc1.DepartID = depart1;
		acc1.PosiID = pos1;
		acc1.CreateDate = new Date("2020/08/28");

		Account acc2 = new Account();
		acc2.AccountID = 2;
		acc2.Email = "nguyenvanbinh@gmail.com";
		acc2.UserName = "Binh";
		acc2.FullName = "NguyenVanBinh";
		acc2.DepartID = depart1;
		acc2.PosiID = pos3;
		acc2.CreateDate = new Date("2011/02/08");

		Account acc3 = new Account();
		acc3.AccountID = 3;
		acc3.Email = "nguyenvansy@gmail.com";
		acc3.UserName = "Sy";
		acc3.FullName = "NguyenVanSy";
		acc3.DepartID = depart2;
		acc3.PosiID = pos1;
		acc3.CreateDate = new Date("2007/12/07");

		Account acc4 = new Account();
		acc4.AccountID = 4;
		acc4.Email = "donaldtrump@gmail.com";
		acc4.UserName = "Donald";
		acc4.FullName = "DonaldTrump";
		acc4.DepartID = depart3;
		acc4.PosiID = pos2;
		acc4.CreateDate = new Date("2010/06/10");

		Account acc5 = new Account();
		acc5.AccountID = 5;
		acc5.Email = "trantiger@gmail.com";
		acc5.UserName = "Dan";
		acc5.FullName = "TranVanDan";
		acc5.DepartID = depart5;
		acc5.PosiID = pos4;
		acc5.CreateDate = new Date("2011/01/01");

		// Khởi tạo bảng Group
		Group gr1 = new Group();
		gr1.GroupID = 1;
		gr1.GroupName = "Nhóm 1";
		gr1.CreatorID = acc1;
		gr1.CreateDate = new Date("2010/10/10");

		Group gr2 = new Group();
		gr2.GroupID = 2;
		gr2.GroupName = "Nhóm 2";
		gr2.CreatorID = acc3;
		gr2.CreateDate = new Date("2010/09/01");

		Group gr3 = new Group();
		gr3.GroupID = 3;
		gr3.GroupName = "Nhóm 3";
		gr3.CreatorID = acc5;
		gr3.CreateDate = new Date("1998/08/02");

		Group gr4 = new Group();
		gr4.GroupID = 4;
		gr4.GroupName = "Nhóm 4";
		gr4.CreatorID = acc1;
		gr4.CreateDate = new Date("2005/08/04");

		// Khởi tạo bảng GroupAccount
		GroupAccount gracc1 = new GroupAccount();
		gracc1.GroupID = gr1;
		gracc1.AccountID = acc1;
		gracc1.JoinDate = new Date("2020/11/20");

		GroupAccount gracc2 = new GroupAccount();
		gracc2.GroupID = gr1;
		gracc2.AccountID = acc2;
		gracc2.JoinDate = new Date("2020/12/10");

		GroupAccount gracc3 = new GroupAccount();
		gracc3.GroupID = gr1;
		gracc3.AccountID = acc5;
		gracc3.JoinDate = new Date("2020/12/02");

		GroupAccount gracc4 = new GroupAccount();
		gracc4.GroupID = gr2;
		gracc4.AccountID = acc4;
		gracc4.JoinDate = new Date("2020/10/29");

		GroupAccount gracc5 = new GroupAccount();
		gracc5.GroupID = gr3;
		gracc5.AccountID = acc4;
		gracc5.JoinDate = new Date("2000/02/03");

		// Khởi tạo bảng TypeQuestion
		TypeQuestion typeQ1 = new TypeQuestion();
		typeQ1.TypeID = 1;
		typeQ1.TypeName = typeName.Essay;

		TypeQuestion typeQ2 = new TypeQuestion();
		typeQ2.TypeID = 2;
		typeQ2.TypeName = typeName.MultipleChoice;

		// Khởi tạo bảng CategoryQuestion
		CategoryQuestion cateQ1 = new CategoryQuestion();
		cateQ1.CategoryID = 1;
		cateQ1.CategoryName = "Java";

		CategoryQuestion cateQ2 = new CategoryQuestion();
		cateQ2.CategoryID = 2;
		cateQ2.CategoryName = ".NET";

		CategoryQuestion cateQ3 = new CategoryQuestion();
		cateQ3.CategoryID = 3;
		cateQ3.CategoryName = "SQL sever";

		CategoryQuestion cateQ4 = new CategoryQuestion();
		cateQ4.CategoryID = 4;
		cateQ4.CategoryName = "SQL workbench";

		CategoryQuestion cateQ5 = new CategoryQuestion();
		cateQ5.CategoryID = 5;
		cateQ5.CategoryName = "PHP";

		// Khởi tạo bảng Question
		Question ques1 = new Question();
		ques1.QuestionID = 1;
		ques1.Content = "Lam cach nao de insert du lieu trong mysql ?";
		ques1.CategoryID = cateQ4;
		ques1.TypeID = typeQ1;
		ques1.CreatorID = acc1;
		ques1.CreateDate = new Date("2020/12/20");

		Question ques2 = new Question();
		ques2.QuestionID = 2;
		ques2.Content = "Lam cach nao de xoa du lieu trong mysql ?";
		ques2.CategoryID = cateQ4;
		ques2.TypeID = typeQ2;
		ques2.CreatorID = acc5;
		ques2.CreateDate = new Date("2020/10/29");

		Question ques3 = new Question();
		ques3.QuestionID = 3;
		ques3.Content = "Tai lieu hoc PHP tham khao o dau ?";
		ques3.CategoryID = cateQ5;
		ques3.TypeID = typeQ1;
		ques3.CreatorID = acc2;
		ques3.CreateDate = new Date("2006/08/21");

		Question ques4 = new Question();
		ques4.QuestionID = 4;
		ques4.Content = ".NET la gi ?";
		ques4.CategoryID = cateQ2;
		ques4.TypeID = typeQ2;
		ques4.CreatorID = acc3;
		ques4.CreateDate = new Date("1999/01/25");

		Question ques5 = new Question();
		ques5.QuestionID = 5;
		ques5.Content = "Loi the cua Sqlsever la gi?";
		ques5.CategoryID = cateQ3;
		ques5.TypeID = typeQ1;
		ques5.CreatorID = acc1;
		ques5.CreateDate = new Date("2020/12/21");

		// Khởi tạo bảng Answer
		Answer ans1 = new Answer();
		ans1.AnswerID = 1;
		ans1.Content = "Dung lenh Insert into";
		ans1.QuestionID = ques1;
		ans1.isCorrect = true;

		Answer ans2 = new Answer();
		ans2.AnswerID = 2;
		ans2.Content = "Dung lenh delete from";
		ans2.QuestionID = ques2;
		ans2.isCorrect = true;

		Answer ans3 = new Answer();
		ans3.AnswerID = 3;
		ans3.Content = "Toi chiu";
		ans3.QuestionID = ques3;
		ans3.isCorrect = false;

		Answer ans4 = new Answer();
		ans4.AnswerID = 4;
		ans4.Content = "Vao trang web: w3schools.com";
		ans4.QuestionID = ques3;
		ans4.isCorrect = true;

		Answer ans5 = new Answer();
		ans5.AnswerID = 5;
		ans5.Content = "Toi khong biet";
		ans5.QuestionID = ques4;
		ans5.isCorrect = false;

		// Khởi tạo bảng Exam
		Exam ex1 = new Exam();
		ex1.ExamID = 1;
		ex1.Code = 050;
		ex1.Title = "Thi khao sat";
		ex1.CategoryID = cateQ1;
		ex1.Duration = 45;
		ex1.CreatorID = acc1;
		ex1.CreateDate = new Date("2010/05/08");

		Exam ex2 = new Exam();
		ex2.ExamID = 2;
		ex2.Code = 051;
		ex2.Title = "Thi giua ki";
		ex2.CategoryID = cateQ2;
		ex2.Duration = 90;
		ex2.CreatorID = acc2;
		ex2.CreateDate = new Date("2005/05/09");

		Exam ex3 = new Exam();
		ex3.ExamID = 3;
		ex3.Code = 052;
		ex3.Title = "Thi cuoi ki";
		ex3.CategoryID = cateQ1;
		ex3.Duration = 120;
		ex3.CreatorID = acc3;
		ex3.CreateDate = new Date("2007/06/08");

		Exam ex4 = new Exam();
		ex4.ExamID = 4;
		ex4.Code = 053;
		ex4.Title = "Thi sat hach";
		ex4.CategoryID = cateQ3;
		ex4.Duration = 45;
		ex4.CreatorID = acc1;
		ex4.CreateDate = new Date("2002/02/03");

		Exam ex5 = new Exam();
		ex5.ExamID = 5;
		ex5.Code = 054;
		ex5.Title = "Thi tot nghiep";
		ex5.CategoryID = cateQ5;
		ex5.Duration = 120;
		ex5.CreatorID = acc1;
		ex5.CreateDate = new Date("2015/01/02");

		// Khởi tạo bảng ExamQuestion
		ExamQuestion exQ1 = new ExamQuestion();
		exQ1.ExamID = ex1;
		exQ1.QuestionID = ques1;

		ExamQuestion exQ2 = new ExamQuestion();
		exQ2.ExamID = ex1;
		exQ2.QuestionID = ques2;

		ExamQuestion exQ3 = new ExamQuestion();
		exQ3.ExamID = ex3;
		exQ3.QuestionID = ques1;

		ExamQuestion exQ4 = new ExamQuestion();
		exQ4.ExamID = ex5;
		exQ4.QuestionID = ques3;

		ExamQuestion exQ5 = new ExamQuestion();
		exQ5.ExamID = ex4;
		exQ5.QuestionID = ques4;
	}
	

}
