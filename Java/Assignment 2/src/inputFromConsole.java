import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class inputFromConsole {

	public static void main(String[] args) throws ParseException {
		 //Question 1:
		 System.out.println("Câu 1");
		 System.out.println("Nhập vào 3 số nguyên bất kì :");
		Scanner sc = new Scanner(System.in);
		 System.out.print("Nhập số đầu tiên : ");
		 int nb1 = sc.nextInt();
		 System.out.print("Nhập số thứ hai : ");
		 int nb2 = sc.nextInt();
		 System.out.print("Nhập số thứ ba : ");
		 int nb3 = sc.nextInt();
		 System.out.println("Bạn đã nhập 3 số là : " + nb1 +", " + nb2 + ", "
		 + nb3);

		 //Question 2:
		 System.out.println("Câu 2");
		 System.out.println("Nhập vào 2 số thực bất kì :");
		 System.out.print("Nhập số đầu tiên : ");
		 float f1 = sc.nextFloat();
		 System.out.print("Nhập số thứ hai : ");
		 float f2 = sc.nextFloat();
		 System.out.println("Bạn đã nhập 2 số là : " + f1 +", " + f2);
		
		 // Question 3:
		 System.out.println("Câu 3");
		 System.out.print("Nhập họ: ");
		 String strHo = sc.next();
		 System.out.print("Nhập tên: ");
		 String strTen = sc.next();
		 System.out.println("Bạn đã nhập họ và tên là: " +strHo + " " +
		 strTen);
		
		 //Question 4:
		 System.out.println("Câu 4");
		 System.out.print("Nhập ngày sinh nhật của bạn : ");
		 String dateIn = sc.next();
		 SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		 Date dateBD = dateF.parse(dateIn);
		 System.out.println("Ngày sinh nhật của bạn là: " + dateBD);

		// Question 5:
		createAcc();

		// Question 6:
		createDept();

		// Question 7:
		 System.out.println("Nhập 1 số chẵn: ");
		 int inSoChan = sc.nextInt();
		 if(inSoChan % 2==1){
		 System.out.println("Vui lòng nhập số chắn");
		 }
		 else{
		 System.out.println("Số chẵn là : " + inSoChan);
		 }

		// Question 8:
		

	}

	// method : Create Account
	public static void createAcc() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập thông tin account");
		System.out.print("AccountID : ");
		int acID = scan.nextInt();
		System.out.print("Email : ");
		String emailID = scan.next();
		System.out.print("UserName : ");
		String userID = scan.next();
		System.out.print("FullName : ");
		String nameID = scan.next();
		System.out.print("DepartID: ");
		int depID = scan.nextInt();
		System.out.print("PosiID : ");
		int possID = scan.nextInt(4);
		switch (possID) {
		case 1:
			System.out.println("Dev");
			break;
		case 2:
			System.out.println("Test");
			break;
		case 3:
			System.out.println("ScrumMaster");
			break;
		case 4:
			System.out.println("PM ");
			break;
		default:
			break;
		}
		System.out.println("CreateDate : ");
		String creDate = scan.next();
	}

	// method : Create Department
	public static void createDept(){
		System.out.println("Nhập thông tin Department");
		Scanner scanner = new Scanner(System.in);
		System.out.println("DepartmentID : ");
		int deptID = scanner.nextInt();
		System.out.println("DepartmentName: ");
		String deptName = scanner.next();
	}
	
	//method : Insert Account to Group
	public static void insertAccToGr(){
		
	}
}
