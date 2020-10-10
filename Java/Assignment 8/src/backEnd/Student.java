package backEnd;

public class Student {
	private String name;
	private static int id = 0;
	
	public Student(String name){
		this.name = name;
		id++;
	}
	

	public static int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
