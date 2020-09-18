import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		//Question 3
		Checked();

		//Question 4
		printName();
		
		//Question 15: Revert string by word 
		revertString();

	}
	public static void Checked(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập tên của bạn!");
		String value = scan.nextLine(); // hàm nextLine sẽ trả về nội dung của 1 hàng # next(): trước 1 khoảng trắng
		System.out.print("Tên của bạn là: " + value.substring(0, 1).toUpperCase());
		System.out.print(value.substring(1));
	}
	
	public static void printName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập tên của bạn!");
		String value = scan.nextLine();
		String nameUpper = value.toUpperCase(); //Chuyển sang kí tự viết hoa
		String nameSplit[] = nameUpper.split(""); //Khai báo mảng gồm các kí tự viết hoa
		for(String arrName : nameSplit){  		// for - each
			System.out.println("Kí tự thứ 1 là: " + arrName);
		}
	}
	
	public static void revertString(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập 1 đoạn văn nào đó!");
		String value = scan.nextLine();
		String nameSplit[] = value.split(" "); //Khai báo mảng
		for (int i = nameSplit.length -1 ; i >=0; i--) {
			System.out.print(nameSplit[i]+ " ");
		}
	}
	
}
