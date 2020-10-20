package entity;

public class ExperienceCandidate extends Candidate{
	private int expInYear;
	private String proSkill;
	public ExperienceCandidate(String firstName, String lastName, String email, String phone, int expInYear,
			String proSkill) {
		super(firstName, lastName, email, phone);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	
}
