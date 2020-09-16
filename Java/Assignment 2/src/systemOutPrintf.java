import java.util.Date;
import java.util.Scanner;


public class systemOutPrintf {

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

		// Question 1:
		int x = 5;
		System.out.printf("So nguyên : %s", x + "\n \n");

		// Question 2:
		int y = 100000000;
		System.out.printf("Kiểu số mới : %,d", y);
		System.out.println("\n");

		// Question 3:
		float z = 5.567098f;
		System.out.printf("Định dạng mới: %.4f", z);
		System.out.println("\n");

		// //Question 4:
		// Scanner sc = new Scanner(System.in);
		// String name = sc.next();
		// System.out.printf("Tên tôi là %s ", name + " và tôi đang độc thân");
		// System.out.println("\n");

		// Question 5:
		Date date = new Date();
		System.out.printf("");
		System.out.printf("%1$td/%1$tm/%1$tY %tHh:%tMp:%tSs %n", date, date, date, date);
		System.out.println("\n");
		
		// Question 6:
		Account accarr[] = {acc1, acc2, acc3, acc4, acc5};
		System.out.println("Account			      Email			       UserName			       FullName			       DepartID			     PosiID			      CreateDate");
		for (int i = 0; i < accarr.length; i ++){
			System.out.printf("%s             %s			   %s			       %s			        %s			      %s			      %s\n",accarr[i].AccountID, accarr[i].Email, accarr[i].UserName, accarr[i].FullName, accarr[i].DepartID.DepartmentID, accarr[i].PosiID.PositionID, accarr[i].CreateDate);
		}
		
		
	}

}
