package utils;

import java.util.Scanner;

public class ScannerUtils {
	// Declare 1 global variable
	private static Scanner scan = new Scanner(System.in);

	// String processing
	public static String inputString() {
		while (true) {
			String str = scan.nextLine().trim();
			if (!str.isEmpty()) {
				return str;
			} else {
				System.out.println("Xin vui long nhap lai");
			}
		}
	}
	
	//Number integer handling
	public static int inputInt(){
		while(true){
			int number = Integer.parseInt(scan.nextLine().trim());
			if (number > 0) {
				return number;
			}else{
				System.out.println("Xin vui long nhap lai");
			}
		}
	}
}
