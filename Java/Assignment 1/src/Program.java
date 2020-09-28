import java.util.Date;

public class Program {
	// Khoi tao ham main
	// hàm main la những hàm mà khi chạy chương trình sẽ chạy hàm main đầu tiên

	public static void main(String[] args) {

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

		// In ra giá trị
		// Department
		System.out.println("Thông tin phòng ban " + depart1.DepartmentID + " là: ");
		System.out.println("DepartmentID = " + depart1.DepartmentID);
		System.out.println("DepartmentName = " + depart1.DepartmentName + "\n");

		System.out.println("Thông tin phòng ban " + depart2.DepartmentID + " là: ");
		System.out.println("DepartmentID = " + depart2.DepartmentID);
		System.out.println("DepartmentName = " + depart2.DepartmentName + "\n");

		// Position
		System.out.println("Thông tin chức vụ" + pos1.PositionID);
		System.out.println("PositionID = " + pos1.PositionID);
		System.out.println("PositionName = " + pos1.PositionName + "\n");

		System.out.println("Thông tin chức vụ" + pos2.PositionID);
		System.out.println("PositionID = " + pos2.PositionID);
		System.out.println("PositionName = " + pos2.PositionName + "\n");

		System.out.println("Thông tin chức vụ" + pos3.PositionID);
		System.out.println("PositionID = " + pos3.PositionID);
		System.out.println("PositionName = " + pos3.PositionName + "\n");

		System.out.println("Thông tin chức vụ" + pos4.PositionID);
		System.out.println("PositionID = " + pos4.PositionID);
		System.out.println("PositionName = " + pos4.PositionName + "\n");

		// Account
		System.out.println("Thông tin account " + acc1.AccountID);
		System.out.println("AccountID = " + acc1.AccountID);
		System.out.println("Email : " + acc1.Email);
		System.out.println("UserName: " + acc1.UserName);
		System.out.println("FullName: " + acc1.FullName);
		System.out.println("DepartmentID = " + acc1.DepartID.DepartmentID);
		System.out.println("PositionId = " + acc1.PosiID.PositionID);
		System.out.println("CreateDate = " + acc1.CreateDate + "\n");

		System.out.println("Thông tin account " + acc2.AccountID);
		System.out.println("AccountID = " + acc2.AccountID);
		System.out.println("Email : " + acc2.Email);
		System.out.println("UserName: " + acc2.UserName);
		System.out.println("FullName: " + acc2.FullName);
		System.out.println("DepartmentID = " + acc2.DepartID.DepartmentID);
		System.out.println("PositionId = " + acc2.PosiID.PositionID);
		System.out.println("CreateDate = " + acc2.CreateDate + "\n");

		System.out.println("Thông tin account " + acc3.AccountID);
		System.out.println("AccountID = " + acc3.AccountID);
		System.out.println("Email : " + acc3.Email);
		System.out.println("UserName: " + acc3.UserName);
		System.out.println("FullName: " + acc3.FullName);
		System.out.println("DepartmentID = " + acc3.DepartID.DepartmentID);
		System.out.println("PositionId = " + acc3.PosiID.PositionID);
		System.out.println("CreateDate = " + acc3.CreateDate + "\n");

		// Group
		System.out.println("Thông tin Group " + gr1.GroupID);
		System.out.println("GroupID = " + gr1.GroupID);
		System.out.println("GroupName = " + gr1.GroupName);
		System.out.println(("CreatorID = " + gr1.CreatorID.AccountID));
		System.out.println("CreateDate = " + gr1.CreateDate + "\n");

		System.out.println("Thông tin Group " + gr2.GroupID);
		System.out.println("GroupID = " + gr2.GroupID);
		System.out.println("GroupName = " + gr2.GroupName);
		System.out.println(("CreatorID = " + gr2.CreatorID.AccountID));
		System.out.println("CreateDate = " + gr2.CreateDate + "\n");

		System.out.println("Thông tin Group " + gr3.GroupID);
		System.out.println("GroupID = " + gr3.GroupID);
		System.out.println("GroupName = " + gr3.GroupName);
		System.out.println(("CreatorID = " + gr3.CreatorID.AccountID));
		System.out.println("CreateDate = " + gr3.CreateDate + "\n");

		// GroupAccount
		System.out.println("Thông tin GroupAccount 1");
		System.out.println("GroupID = " + gracc1.GroupID.GroupID);
		System.out.println("AccountID = " + gracc1.AccountID.AccountID + "\n");

		System.out.println("Thông tin GroupAccount 2");
		System.out.println("GroupID = " + gracc2.GroupID.GroupID);
		System.out.println("AccountID = " + gracc2.AccountID.AccountID + "\n");

		System.out.println("Thông tin GroupAccount 3");
		System.out.println("GroupID = " + gracc3.GroupID.GroupID);
		System.out.println("AccountID = " + gracc3.AccountID.AccountID + "\n");

		// TypeQuestion
		System.out.println("Thông tin TypeQuestion " + typeQ1.TypeID);
		System.out.println("TypeId = " + typeQ1.TypeID);
		System.out.println("TypeName = " + typeQ1.TypeName + "\n");

		System.out.println("Thông tin TypeQuestion " + typeQ2.TypeID);
		System.out.println("TypeId = " + typeQ2.TypeID);
		System.out.println("TypeName = " + typeQ2.TypeName + "\n");
		
		//CategoryQuestion
		System.out.println("Thông tin CategoryQuestion" + cateQ1.CategoryID);
		System.out.println("CategoryID = " +cateQ1.CategoryID);
		System.out.println("CategoryName = " + cateQ1.CategoryName + "\n");
		
		System.out.println("Thông tin CategoryQuestion" + cateQ2.CategoryID);
		System.out.println("CategoryID = " +cateQ2.CategoryID);
		System.out.println("CategoryName = " + cateQ2.CategoryName + "\n");
		
		System.out.println("Thông tin CategoryQuestion" + cateQ2.CategoryID);
		System.out.println("CategoryID = " +cateQ2.CategoryID);
		System.out.println("CategoryName = " + cateQ2.CategoryName + "\n");
		
		// Question
		System.out.println("Thông tin  Question" + ques1.QuestionID);
		System.out.println("QuestionID = "+ ques1.QuestionID);
		System.out.println("Content: "+ques1.Content);
		System.out.println("CategoryID =  "+ques1.CategoryID.CategoryID);
		System.out.println("TypeID = " + ques1.TypeID.TypeID);
		System.out.println("CreatorID = "+ques1.CreatorID.AccountID);
		System.out.println("CreatDate : "+ques1.CreateDate +"\n");
		
		System.out.println("Thông tin  Question" + ques2.QuestionID);
		System.out.println("QuestionID = "+ ques2.QuestionID);
		System.out.println("Content: "+ques2.Content);
		System.out.println("CategoryID =  "+ques2.CategoryID.CategoryID);
		System.out.println("TypeID = " + ques2.TypeID.TypeID);
		System.out.println("CreatorID = "+ques2.CreatorID.AccountID);
		System.out.println("CreatDate : "+ques2.CreateDate +"\n");
		
		System.out.println("Thông tin  Question" + ques3.QuestionID);
		System.out.println("QuestionID = "+ ques3.QuestionID);
		System.out.println("Content: "+ques3.Content);
		System.out.println("CategoryID =  "+ques3.CategoryID.CategoryID);
		System.out.println("TypeID = " + ques3.TypeID.TypeID);
		System.out.println("CreatorID = "+ques3.CreatorID.AccountID);
		System.out.println("CreatDate : "+ques3.CreateDate +"\n");
		
		//Answer
		System.out.println("Thông tin Answer "+ans1.AnswerID);
		System.out.println("AnswerID = "+ans1.AnswerID);
		System.out.println("Content:  " + ans1.Content);
		System.out.println("QuestionID = "+ans1.QuestionID.QuestionID);
		System.out.println("IsCorrect : "+ ans1.isCorrect+ "\n");
		
		System.out.println("Thông tin Answer "+ans2.AnswerID);
		System.out.println("AnswerID = "+ans2.AnswerID);
		System.out.println("Content:  " + ans2.Content);
		System.out.println("QuestionID = "+ans2.QuestionID.QuestionID);
		System.out.println("IsCorrect : "+ ans2.isCorrect+ "\n");

		System.out.println("Thông tin Answer "+ans3.AnswerID);
		System.out.println("AnswerID = "+ans3.AnswerID);
		System.out.println("Content:  " + ans3.Content);
		System.out.println("QuestionID = "+ans3.QuestionID.QuestionID);
		System.out.println("IsCorrect : "+ ans3.isCorrect+ "\n");

		//  Exam
		System.out.println("Thông tin Exam" + ex1.ExamID);
		System.out.println("ExamID = "+ex1.ExamID);
		System.out.println("Code: "+ex1.Code);
		System.out.println("Title: "+ex1.Title);
		System.out.println("CategoryID = "+ex1.CategoryID.CategoryID);
		System.out.println("Duration: "+ex1.Duration);
		System.out.println("CreatorID: "+ex1.CreatorID.AccountID);
		System.out.println("CreateDate: "+ex1.CreateDate + "\n");
		
		System.out.println("Thông tin Exam" + ex2.ExamID);
		System.out.println("ExamID = "+ex2.ExamID);
		System.out.println("Code: "+ex2.Code);
		System.out.println("Title: "+ex2.Title);
		System.out.println("CategoryID = "+ex2.CategoryID.CategoryID);
		System.out.println("Duration: "+ex2.Duration);
		System.out.println("CreatorID: "+ex2.CreatorID.AccountID);
		System.out.println("CreateDate: "+ex2.CreateDate + "\n");
		
		System.out.println("Thông tin Exam" + ex3.ExamID);
		System.out.println("ExamID = "+ex3.ExamID);
		System.out.println("Code: "+ex3.Code);
		System.out.println("Title: "+ex3.Title);
		System.out.println("CategoryID = "+ex3.CategoryID.CategoryID);
		System.out.println("Duration: "+ex3.Duration);
		System.out.println("CreatorID: "+ex3.CreatorID.AccountID);
		System.out.println("CreateDate: "+ex3.CreateDate + "\n");
		
		//Exam Question
		System.out.println("Thông tin ExamQuestion 1");
		System.out.println("ExamID = "+ exQ1.ExamID.ExamID);
		System.out.println("QuestionID = "+exQ1.QuestionID.QuestionID + "\n");
		
		System.out.println("Thông tin ExamQuestion 2");
		System.out.println("ExamId = "+ exQ2.ExamID.ExamID);
		System.out.println("QuestionID = "+exQ2.QuestionID.QuestionID + "\n");
		
		System.out.println("Thông tin ExamQuestion 3");
		System.out.println("ExamID = "+ exQ3.ExamID.ExamID);
		System.out.println("QuestionID = "+exQ3.QuestionID.QuestionID + "\n");
		
		
		
	}
}