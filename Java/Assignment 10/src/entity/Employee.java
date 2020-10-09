package entity;

public class Employee extends User {
	private String proSkill;
	private ProjectName projectName;
	public Employee(String firstName, String lastName, String email, String phone, String proSkill,
			ProjectName projectName) {
		super(firstName, lastName, email, phone);
		this.proSkill = proSkill;
		this.projectName = projectName;
	}
}
