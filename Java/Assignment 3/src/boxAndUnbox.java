
public class boxAndUnbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		Salary();
		
		//Question 2
		stringToPrimitive();
		
		//Question 3
		intConvert();

	}
	
	public static void Salary(){
		Integer luong = new Integer(5000);
		int intLuong = luong.intValue();
		float floatLuong = intLuong;
		System.out.printf(" %.2f",floatLuong);
		System.out.println();
	}
	
	public static void intConvert(){
		String s = "1234567";
		Integer sInt = Integer.valueOf(s);
		int  intS = sInt.intValue();
		System.out.println(intS);
		System.out.println();
	}
	
	public static void stringToPrimitive(){
		String s = "1234567";
		int intS = Integer.parseInt(s);
		System.out.println(s);
	}
}
