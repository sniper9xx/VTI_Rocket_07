package entity;

public class Manager extends User{
	private int expInYear;

	public Manager(String firstName, String lastName, String email, String phone, int expInYear) {
		super(firstName, lastName, email, phone);
		this.expInYear = expInYear;
	}

}
