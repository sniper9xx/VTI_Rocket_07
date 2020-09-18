
import java.util.Arrays;

public class objectsMethod {

	public static void main(String[] args) {
		// Question 6
		deptArr();

	}
	public static void deptArr(){
		String dept[] = {"Marketing","Accounting", "Waiting room", "Boss of director", "Sale"};
		Arrays.sort(dept); //Mảng theo alphabet (tăng dần)
		System.out.println(Arrays.deepToString(dept));
	}

}
