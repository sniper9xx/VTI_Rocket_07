import java.util.Date;

public class defaultValue {

	public static void main(String[] args) {
		// TODO
		Acc();
	}
	
	public static void Acc(){
		Date date = new Date();
		int acc[] = new int[5];
		for (int i = 0; i < acc.length; i++) {
			System.out.println("Thông tin account "+ (i+1) +" là");
			System.out.println("Email: Email"+ (i+1));
			System.out.println("UserName: UserName"+ (i+1));
			System.out.println("FullName: FullName"+ (i+1));
			System.out.println("CreateDate: " + date + "\n");
		}	
	}

}
