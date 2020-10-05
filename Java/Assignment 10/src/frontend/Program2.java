package frontend;

import java.sql.SQLException;

import backend.DepartmentDao;

public class Program2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Question 1:
		DepartmentDao dept = new DepartmentDao();
//		dept.getDepartment();
//		
//		//Question 2:
//		dept.DepartId5();
//		
//		//Question 3:
//		dept.FindId();
//		
//		//Question 4:
		dept.isDepartmentNameExists();
	}

}
