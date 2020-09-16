import java.util.Random;
import java.time.LocalDate;


public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Câu 1");
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
		System.out.println("\n");

		//Question 2:
		System.out.println("Câu 2");
		float y = random.nextFloat();
		System.out.println(y);
		System.out.println("\n");
		
		//Question 3:
		System.out.println("Câu 3");
		String arr[] = {"dat", "binh", "sy", "son", "thang", "trung","anh"};
		int z = random.nextInt(arr.length-1) ;
		System.out.println(arr[z]);
		System.out.println("\n");
		

		//Question 4:
		System.out.println("Câu 4");
		int startD = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int endD  = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long ranDay = startD +  random.nextInt(endD - startD);
		LocalDate randomDay = LocalDate.ofEpochDay(ranDay);
		System.out.println(randomDay);
		System.out.println("\n");

		//Question 5:
		System.out.println("Câu 5");
		int startD1 = (int) LocalDate.of(2019, 9, 16).toEpochDay();
		LocalDate end = LocalDate.now();
		int endD1 = (int) end.toEpochDay();
		long ranDay1 = startD1 +  random.nextInt(endD1 - startD1);
		LocalDate randomDay1 = LocalDate.ofEpochDay(ranDay1);
		System.out.println(randomDay1);
		System.out.println("\n");
		
		//Question 6:
		System.out.println("Câu 6");
		LocalDate end1 = LocalDate.now();
		int endD2 = (int) end1.toEpochDay();
		long ranDay2 = random.nextInt(endD2);
		LocalDate randomDay2 = LocalDate.ofEpochDay(ranDay2);
		System.out.println(randomDay2);	
		System.out.println("\n");
		
		//Question 7:
		System.out.println("Câu 7");
		int rd = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(rd);
		System.out.println("\n");
		

	}

}
