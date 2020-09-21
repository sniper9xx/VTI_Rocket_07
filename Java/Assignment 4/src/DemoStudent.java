
public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student A = new Student(1, "Dat", "Bach Mai");
		Student B = new Student(2, "Binh", "Giai Phong");
		// Set TestMarks of A = 3
		A.setTestMarks(3);
		// Add TestMarks of A = 5
		A.addTestMarks(5);
		// Show Message
		A.Mess();
		B.Mess();
	}
}
