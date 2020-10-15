package backEnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {
	Scanner scan = new Scanner(System.in);
	// Question 1:
	private ArrayList<Student> student;

	public Exercise1() {
		student = new ArrayList<>();
		student.add(new Student("Dat"));
		student.add(new Student("Dat"));
		student.add(new Student("Dat"));
		student.add(new Student("Binh"));
		student.add(new Student("Sy"));
		student.add(new Student("Nam"));
	}

	// a.In ra tổng số phần tử của students
	public void printStudent() {
		System.out.println("Số phần tử của Student: " + student.size());
	}

	// b. Lấy phần tử thứ 4 của students
	public void getIndex4Student() {
		System.out.println("Phần tử thứ 4 của Student: " + student.get(3));
	}

	// c.In ra phần tử đầu và phần tử cuối của students
	public void printIndexSF() {
		System.out.println("Phần tử đầu của Student: " + student.get(0));
		System.out.println("Phần tử cuối của Student: " + student.get(student.size() - 1));
	}

	// d.Thêm 1 phần tử vào vị trí đầu của students
	public void addIndex1() {
		student.add(0, new Student("Bac"));
		System.out.println("So phan tử: " + student.size());
	}

	// e.Thêm 1 phần tử vào vị trí cuối của students
	public void addIndexFinal() {
		student.add(new Student("Dat"));
		System.out.println("So phan tử: " + student.size());
	}

	// f.Đảo ngược vị trí của students
	public void daoNguoc() {
		Collections.reverse(student);
		System.out.println("Phần tử sau khi đảo ngược: " + student);
	}

	// g.Tạo 1 method tìm kiếm student theo id
	public void findIdStudent() {
		System.out.println("Nhập id mà bạn muốn tìm kiếm: ");
		int number = scan.nextInt();
		// Vì id = student.size()
		System.out.println("Bạn đã tìm kiếm: " + student.get(number - 1));
	}

	// h.Tạo 1 method tìm kiếm student theo name
	public void findNameStudent() {
		System.out.println("Nhập tên mà bạn muốn tìm kiếm: ");
		String findName = scan.next();
		if (student.contains(findName)) {
			System.out.println("Bạn đã tìm kiếm : " + findName + " có id = " + (student.indexOf(findName) + 1));
		} else {
			System.out.println("Không có tên sinh viên mà bạn tìm");
		}
	}

	// i. Tạo 1 method để in ra các student có trùng tên
	public void studentTrungTen() {
		System.out.println("Nhập tên mà bạn muốn tìm kiếm: ");
		String printName = scan.next();

	}

	// j. Xóa name của student có id = 2;
	public void clearStudentId2() {
		student.set(1, new Student(" "));
		System.out.println("Đã xoá tên của student có id = 2");
	}

	// k. Delete student có id = 5;
	public void clearStudentId5() {
		student.remove(4);
		System.out.println("Đã xoá student id = 5");
	}

	// l. Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
	// studentCopies
	public void studentCopies() {
		ArrayList<Student> studentCopies = new ArrayList<>(student.size());
		for (int i = 0; i < studentCopies.size(); i++) {
			studentCopies.add(student.get(i));
		}
		System.out.println("Phần tử trong studentCopies là: " + studentCopies);
	}
	
	
	
}
