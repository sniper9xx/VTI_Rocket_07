package backEnd;

import java.time.LocalDate;

public class Student2 implements Comparable<Student2>{
	private String name;
	private LocalDate ngaySinh;
	private int diem;
	private static int id = 0;
	public Student2(String name, LocalDate ngaySinh, int diem) {
		this.name = name;
		this.ngaySinh = ngaySinh;
		id++; 
		this.diem = diem;
	}
	@Override
	public int compareTo(Student2 str) {
		return 0;
	}
	
}
