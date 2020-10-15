package frontEnd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import backEnd.Student2;

public class Program2 {
	public static void main(String[] args) {
		// Question 1: In ra học sinh sắp xếp theo name
		ArrayList<Student2> st2 = new ArrayList<Student2>();
		st2.add(new Student2("Dat", LocalDate.parse("2020-10-10"), 10));
		st2.add(new Student2("Dong", LocalDate.parse("2020-10-10"), 7));
		st2.add(new Student2("Tay", LocalDate.parse("2020-10-10"), 2));
		st2.add(new Student2("Nam", LocalDate.parse("2020-10-10"), 6));
		st2.add(new Student2("Bac", LocalDate.parse("2020-10-10"), 8));
		Collections.sort(st2);
		System.out.println(st2);

		// Question 2: In ra học sinh sắp xếp theo name, nếu tên trùng nhau thì
		// sẽ sắp xếp theo ngày sinh, nếu ngày sinh trùng nhau thì sẽ sắp xếp
		// theo điểm
		
		
	}
}
