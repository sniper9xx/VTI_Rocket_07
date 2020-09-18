import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		//Question 1
		countString();
		
		//Question 2
		concatString();
		
		//Question 3
		Checked();

		//Question 4
		printName();
		
		//Question 5
		fullName();
		
		//Question 6
		splitFullName();
		
		//Question 7
		isoName();
		
		//Question 10
		stringCheck();
		
		//Question 11
		find_a();
		
		//Question 12  giống câu 15
		
		//Question 13: String not contains digit
		intStringCheck();
		
		//Question 14
		replaceAcademy();
		
		//Question 15: Revert string by word 
		revertString();

	}
	
	//Question 1
	public static void countString(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập 1 đoạn văn nào đó!");
		String value = scan.nextLine();
		String nameSplit[] = value.split(" "); //Khai báo mảng
		System.out.println(nameSplit.length);
	}
	
	//Question 2
	public static void concatString(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập xâu thứ 1: ");
		String value1 = scan.nextLine();
		System.out.println("Nhập xâu thứ 2: ");
		String value2 = scan.nextLine();
		System.out.println(value1.concat(value2));
	}
	
	//Question 3
	public static void Checked(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập tên của bạn!");
		String value = scan.nextLine(); // hàm nextLine sẽ trả về nội dung của 1 hàng # next(): trước 1 khoảng trắng
		System.out.print("Tên của bạn là: " + value.substring(0, 1).toUpperCase());
		System.out.print(value.substring(1));
	}
	
	//Question 4
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
	
	//Question 5
	public static void fullName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ của bạn: ");
		String value1 = scan.nextLine();
		System.out.println("Nhập tên của bạn: ");
		String value2 = scan.nextLine();
		System.out.println(value1.concat(value2));
	}
	
	//Question 6
	public static void splitFullName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ tên của bạn: ");
		String value1 = scan.nextLine();
		String arrSplit[] = value1.split(" ");
		System.out.println("Họ là: " +arrSplit[0]);
		System.out.println("Tên đệm là: " +arrSplit[1]);
		System.out.println("Tên là: " +arrSplit[2]);
	}
	
	//Question 7
	public static void isoName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ tên của bạn: ");
		String value1 = scan.nextLine();
		value1 = value1.trim(); // Xoá khoảng trắng ở đầu và cuối string
		String arrSplit[] = value1.split(" ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.print(arrSplit[i].substring(0,1).toUpperCase() + arrSplit[i].substring(1)+ " ");
		}
	}
	
	//Question 10
	public static void stringCheck(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập chuỗi thứ 1: ");
		String value1 = scan.nextLine();
		System.out.println("Nhập chuỗi thứ 2: ");
		String value2 = scan.nextLine();
		int length = value1.length(); // độ dài của value1
		boolean ch = false;   // biến kiểm tra
		if (length == value2.length()) {  // nếu độ dài value1 # value 2 -> in ra "KO", còn bằng thì tiếp tục so sánh 
			for (int i = 0; i < length; i++) {   
				if (value1.charAt(i) == value2.charAt(length-i-1)){  //so sánh kí tự đối xứng giữa 2 value
					 ch = true;
				}
				else{
					ch = false;
					break;
				}
			}
		}
		else{
			ch = false;
		}
		if (ch == true) {
			System.out.println("OK");
		}else{
			System.out.println("KO");
		}
	}
	
	//Question 11
	public static void find_a(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập 1 chuỗi nào đó!");
		String value = scan.nextLine();
		int count = 0; //Tạo biến đếm số kí tự a
		String replaceValue = value.replace(" ",""); // Xoá tất cả các khoảng trắng trong chuỗi
		for (int i = 0; i < replaceValue.length(); i++) {
			if (replaceValue.charAt(i) == 'a'){
				count = count +1;
			}
		}
		System.out.println(count);	
	}
	
	//Question 13
	public static void intStringCheck(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập 1 chuỗi nào đó!");
		boolean value = scan.hasNextInt();
		System.out.println(value);	
	}
	
	//Question 14
		public static void replaceAcademy(){
			String s = "VTI Academy";
			String sReplace = s.replace("e", "*");
			System.out.println(sReplace);
		}
	
	//Question 15
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
