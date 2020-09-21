package Inheritance;

public class CanBo {
	protected String name, address;
	protected int age;
	protected enum Gender {
		Nam, Nữ, Khác
	};
	
	public CanBo(String name, int age, Gender gender, String address){
		this.name = name;
		this.age = age;
		this.address = address;		
	}
	
	
}
