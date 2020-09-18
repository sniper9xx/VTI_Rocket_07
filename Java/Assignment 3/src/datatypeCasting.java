import java.util.Random;
import java.util.Scanner;

public class datatypeCasting {


	public static void main(String[] args) {
		//Question 1 : Ép kiểu dữ liệu
		Question1();
		
		//Question 2,3
		Question23();
		
		//Question 4
		div();
	}
	
	public static void Question1(){
		System.out.println("Câu 1");
		float salaryAc1 =  5240.5f;
		float  salaryAc2 = 10970.055f;		
		int acc1Salary = (int) salaryAc1;
		System.out.println("Tiền lương của Account 1:  " + acc1Salary);
		int acc2Salary = (int) salaryAc2;
		System.out.println("Tiền lương của Account 2:  " + acc2Salary);
	}

	public static void Question23() {
		System.out.println("Câu 2");
		Random rand = new Random();
		int x = rand.nextInt(10000);
		if (1000 <= x && x < 10000) {
			System.out.println("0" + x);
		} else if (100 <= x && x < 1000) {
			System.out.println("00" + x);
		} else if (10 <= x && x < 100) {
			System.out.println("000" + x);
		} else if (0 < x && x < 10) {
			System.out.println("0000" + x);
		} else {
			System.out.println("00000");
		}
		
		System.out.println("Câu 3");
		int y = x % 100;
		if (0 < y && y < 10) {
			System.out.println("0" + y);
		} else if (y == 0) {
			System.out.println("00");
		} else {
			System.out.println(y);
		}
	}
	
	public static void div(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số a: ");
		int valuea = scan.nextInt();
		System.out.println("Nhập số b: ");
		int valueb = scan.nextInt();
		float c = 1f*valuea/valueb;
		System.out.println("Kết quả a/b = " + c);
	}
}