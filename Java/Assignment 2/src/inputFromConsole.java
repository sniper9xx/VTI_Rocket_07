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
		System.out.println("Bạn đã nhập 3 số là : " + nb1 +", " + nb2 + ", " + nb3);
		
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
		System.out.println("Bạn đã nhập họ và tên là: " +strHo + " " + strTen);
		
		//Question 4:
		System.out.println("Câu 4");	
		System.out.print("Nhập ngày sinh nhật của bạn : ");
		String dateIn = sc.next();
		SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		Date dateBD = dateF.parse(dateIn);
		System.out.println("Ngày sinh nhật của bạn là: " + dateBD);
		
		// Đang làm tiếp Câu 5
		
		//Question 5:
		//Input
//		System.out.println("Câu 5");
//		System.out.print("Nhập AccountID : ");
//		int accID = sc.nextInt();
//		System.out.print("Nhập Email : ");
//		String ema = sc.next();
//		System.out.print("Nhập UserName : ");
//		String user = sc.next();
//		System.out.print("Nhập Fullname: ");
//		String fname = sc.next();
//		System.out.print("Nhập DepartID : ");
//		int depID = sc.nextInt();
//		System.out.print("Nhập PosID : ");
//		int posID = sc.nextInt();
//		System.out.println("Nhập CreateDate : ");
//		String accDate = sc.next();
//		
//
//		//Output
//		System.out.println("Thông tin account vừa nhập");
//		System.out.print("AccountID : " + accID);
//		System.out.print("Email : " + ema);
//		System.out.print("UserName : " + user);
//		System.out.print("Fullname: " + fname);
//		System.out.print("DepartID : " + depID);
////		System.out.print("PosID : " + positionid(posID));
//		System.out.print("Nhập CreateDate : ");
//		
//	}
//	public static String positionid(int possID){	
//		if(possID == 1){
//			String strPoss = "Dev";
//		}
//		else if(possID == 2){
//			String strPoss = "Test";
//		}
//		else if(possID == 3){
//			String strPoss = "ScrumMaster";
//		}
//		else if(possID == 4){
//			String strPoss = "PM";
//		}
//
//		return strPoss;
//			
	}

}
