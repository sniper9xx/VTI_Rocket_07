
public class Student {
	private int id, testMarks;
	private String name, homeTown;

	// Create Constructor
	public Student(int id, String name, String homeTown) {
		this.id = id;
		this.name = name;
		this.testMarks = 0;
		this.homeTown = homeTown;
	}

	public void Mess() {
		System.out.println("name = " + name);
		if (testMarks <= 4) {
			System.out.println("Học lực : Yếu");
		} else if (testMarks > 4 && testMarks <= 6) {
			System.out.println("Học lực : Trung Bình");
		} else if (testMarks > 6 && testMarks <= 8) {
			System.out.println("Học lực : Khá");
		} else {
			System.out.println("Học lực : Giỏi");
		}
		System.out.println();
	}

	// Set TestMarks
	public void setTestMarks(int testMarks) {
		if (testMarks <= 10) {
			this.testMarks = testMarks;
		}
	}

	// ADD TestMarks
	public void addTestMarks(int Marks) {
		if (testMarks + Marks <= 10) {
			this.testMarks = testMarks + Marks;
		}
	}

}
