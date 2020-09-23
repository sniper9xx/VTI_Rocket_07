package Inheritance;

public abstract class Student extends Person {
	protected int id;

	public Student(String name,int id) {
		super(name); //Kế thừa từ Person
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
