package backend;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exercise5 {

	private static int id = 0;
	private String name;
	// Đường dẫn file
	private final String url = "C:\\Users\\Admin\\Desktop\\VTI_Rocket_07\\Java\\Assignment 7\\src\\StudentInformation.txt";

	//Question 1:
	// Viết 3 student này ra file tên là StudentInformation.txt
	public void Write3Student() {
		try {
			Scanner sc = new Scanner(System.in);
			File file = new File(url); //Lấy dữ liệu từ url
			FileOutputStream fos = new FileOutputStream(file); //nơi ghi file vào
			OutputStreamWriter osw = new OutputStreamWriter(fos); //bắt đầu ghi
			for (int i = 1; i <= 3; i++) {
				System.out.println("Student " + i);
				System.out.println("Input name: ");
				name = sc.nextLine();
				id++;
				osw.write("Student " + id + " :");
				osw.write("\n");
				osw.write("\t Id : " + id);
				osw.write("\n");
				osw.write("\t Ho va ten: ");
				osw.write(name);
				osw.write("\n");
			}
			osw.close(); //đóng file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Đọc thông tin file StudentInformation.txt và in ra màn hình
	public void Print3Student() throws IOException {
		File file2 = new File(url); //Lấy dữ liệu từ url
		InputStream ips = new FileInputStream(file2); //Khởi tạo 1 inputStream chuẩn bị cho việc đọc file
		InputStreamReader ipr = new InputStreamReader(ips); //Tạo ra 1 đối tượng có thể đọc được
		BufferedReader bfr = new BufferedReader(ipr); 
		String line =""; //null
		while ((line = bfr.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	//Question 2:
	
	
}
