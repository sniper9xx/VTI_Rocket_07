package entity;

public class Employee extends User {
	private int projectId, proSkill;

	public Employee(String fullName, String email, String password, int projectId, int proSkill) {
		super(fullName, email, password);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
}
