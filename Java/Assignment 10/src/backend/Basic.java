package backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Basic {
	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/exercise";
	private final String USER = "root";
	private final String PASSWORD = "dat66060nuce";
	
	//Question 1:
	public void Connect() throws FileNotFoundException, IOException, SQLException{
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);		
		System.out.println("Connect success!" );			
		Statement statement = conection.createStatement();
		conection.close(); 
	}
	
	//Question 2:
	public void Position() throws SQLException{
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);				
		Statement statement = conection.createStatement();
		String SelectSql = "select * from position";  
		ResultSet result = statement.executeQuery(SelectSql);
		while (result.next()) {
			System.out.println(result.getString(1) + "\t" + result.getString(2));
		}
		conection.close();
	}
	
	//Question 3:
	public void CreatePosition() throws SQLException{
		//Nhập dữ liệu
		Scanner scan = new Scanner(System.in);
		System.out.println("----------THEM POSITION----------");
		System.out.println("Nhap id: ");
		int idPos = scan.nextInt();
		System.out.println("Nhap name: ");
		String namePos = scan.next();	
		
		//Thêm dữ liệu vào database
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);				
		Statement statement = conection.createStatement();
		String insert = "INSERT INTO position values (?,?);";
		PreparedStatement ps = conection.prepareStatement(insert);
		ps.setInt(1, idPos);
		ps.setString(2,namePos);
		int effectedRows = ps.executeUpdate();
		conection.close();		
	}
	
	//Question 4:
	public void UpdateNamePos() throws SQLException{
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);				
		Statement statement = conection.createStatement();
		//Không thể đổi tên Position thành Vị Trí 1 vì kiểu dữ liệu của PositionName là Enum ---> Đổi tên từ PM -> Test
		String update = "UPDATE position SET PositionName = 'Test'  WHERE PositionID = 5";
		PreparedStatement ps = conection.prepareStatement(update);
		int effectedRows2 = ps.executeUpdate();
		conection.close();
	}
	
	//Question 5:
	public void DeletePos() throws SQLException{
		//Nhập id cần xoá
		Scanner scan = new Scanner(System.in);
		System.out.println("----------XOA POSITION----------");
		System.out.println("Nhap id can xoa: ");
		int idPos = scan.nextInt();
		
		//Xoá dữ liệu
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);				
		Statement statement = conection.createStatement();
		String delete = "DELETE FROM position WHERE PositionID = ?";
		PreparedStatement ps = conection.prepareStatement(delete);
		ps.setInt(1, idPos);
		int effectedRows3 = ps.executeUpdate();
		conection.close();
	}
	
}

