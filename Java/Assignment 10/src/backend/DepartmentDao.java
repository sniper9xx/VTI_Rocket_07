package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DepartmentDao {
	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/exercise";
	private final String USER = "root";
	private final String PASSWORD = "dat66060nuce";
	
	//Question 1
	public void getDepartment() throws SQLException{
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);					
		Statement statement = conection.createStatement();
		String selectSql = "Select * from department";
		ResultSet result = statement.executeQuery(selectSql);
		while (result.next()) {
			System.out.println(result.getString(1) + "\t" + result.getString(2));
		}
		conection.close();		
	}
	
	//Question 2:
	public void DepartId5() throws SQLException{
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);					
		Statement statement = conection.createStatement();
		String selectSql = "Select * from department where DepartmentID = 5";
		ResultSet result = statement.executeQuery(selectSql);
		if (result.next()) {
			System.out.println(result.getString(1) + "\t" + result.getString(2));
		}else {
			System.out.println("Cannot find department which has id = 5");
		}
		conection.close();
	}
	
	//Question 3:
	public void FindId() throws SQLException{
		//Nhap id can tim
		Scanner scan = new Scanner(System.in);
		System.out.println("----------TIM DEPARTMENT----------");
		System.out.println("Nhap id can tim: ");
		int idDepart = scan.nextInt();
		System.out.println("----------------------------------");
		
		//Tim id
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);					
		Statement statement = conection.createStatement();
		String selectSql = "Select * from department where DepartmentID = ?";
		PreparedStatement ps = conection.prepareStatement(selectSql);
		ps.setInt(1, idDepart);
		ResultSet effectedRows = ps.executeQuery();
		if (effectedRows.next()) {
			System.out.println(effectedRows.getString(1) + "\t" + effectedRows.getString(2));
		}else {
			System.out.println("Cannot find department which has id = "+idDepart);
		}
		conection.close();		
	}
	
	//Question 4:
	public void isDepartmentNameExists() throws SQLException{
		//Nhap name
		Scanner scan = new Scanner(System.in);
		System.out.println("----------TIM DEPARTMENT NAME----------");
		System.out.println("true: Tim thay             false: Khong tim thay");
		System.out.println("Nhap name can tim: ");
		String nameDepart = scan.next();
		System.out.println("----------------------------------");
		
		//Tìm
		boolean check;
		Connection conection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);					
		Statement statement = conection.createStatement();
		String selectSql = "select * from department where DepartmentName = ?";
		PreparedStatement ps = conection.prepareStatement(selectSql);
		ps.setString(1, nameDepart);
		ResultSet effectedRows = ps.executeQuery();

//			if (effectedRows.getString(2) == nameDepart) {
//				check = true;
//				System.out.println(check);
//			}else{
//				check = false;
//				System.out.println(check);
//			}
//		
		conection.close();	
	}
	
	public void CreateDepartment() throws SQLException{
		//Nhap bang
		Scanner scan = new Scanner(System.in);
		System.out.println("----------CREATE DEPARTMENT----------");
		System.out.println("Nhap name: ");
		String nameDepart = scan.next();
		System.out.println("----------------------------------");
		
		//Tạo bảng 
		
		
	}
}
