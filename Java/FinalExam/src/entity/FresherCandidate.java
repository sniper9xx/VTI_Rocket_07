package entity;

public class FresherCandidate extends Candidate {
	private String GraduationRank;

	public FresherCandidate(String firstName, String lastName, String email, String phone, String graduationRank) {
		super(firstName, lastName, email, phone);
		GraduationRank = graduationRank;
	}
	
	
}
