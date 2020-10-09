package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.Basic;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		Basic b = new Basic();
		//Question 1:
//		b.Connect();
		
//		//Question 2:
//		b.Position();
//		
//		//Question 3:
//		b.CreatePosition();
//		
//		//Question 4:
//		b.UpdateNamePos();
//		
//		//Question 5:
		b.DeletePos();
	}
}
