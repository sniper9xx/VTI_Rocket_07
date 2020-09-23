package Inheritance;

public class HighSchoolStudent extends Student {
	protected String clazz, desiredUniversity;

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id); // kế thừa Student
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	public String toString() {
		return "Name: " + super.name + "\n" + "id: " + super.id + "\n" + "Class: " + clazz + "HighSchool: "
				+ desiredUniversity;
	}

}
