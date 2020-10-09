package entity;

public class Manager extends User{
	private int expInYear;

	public Manager(String fullName, String email, String password, int expInYear) {
		super(fullName, email, password);
		this.expInYear = expInYear;
	}	
}
