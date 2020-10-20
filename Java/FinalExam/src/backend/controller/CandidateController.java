package backend.controller;

import java.sql.SQLException;

import backend.sevices.CandidateService;
import backend.sevices.ICandidateService;

public class CandidateController {
	private ICandidateService candidateService;

	// Contructor
	public CandidateController() {
		this.candidateService = new CandidateService();
	}

	// Methods
	// Method registerExperienceCandidate
	public void dangKyExperienceCandidate(String firstName, String lastName, String pass, String phone, String email,
			int expInYear, String proSkill) throws SQLException {
		candidateService.dangKyExperienceCandidate(firstName, lastName, pass, phone, email, expInYear, proSkill);
	}

	// Method registerFresherCandidate 
	public void dangKyFresherCandidate (String firstName, String lastName, String pass, String phone, String email,String graduationRank)
			throws SQLException {
		candidateService.dangKyFresherCandidate(firstName, lastName, pass, phone, email,graduationRank );
	}

	// Method errorLogin
	public boolean errorLogin(String email, String pass) throws SQLException {
		return candidateService.errorLogin(email, pass);
	}
}
