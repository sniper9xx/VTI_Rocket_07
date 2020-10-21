package backend.sevices;

import java.sql.SQLException;
import java.util.regex.Pattern;

import utils.ScannerUtils;
import backend.reponsitory.ICandidateReponsitory;
import backend.reponsitory.CandidateReponsitory;

public class CandidateService implements ICandidateService {
	private ICandidateReponsitory candidateReponsitory;

	public CandidateService() {
		this.candidateReponsitory = new CandidateReponsitory();
	}

	// Check phone
	public boolean checkPhone(String phone) {
		boolean check = false;
		if (phone.length() >= 9 && phone.length() <= 12) {
			check = true;
		}
		return check;
	}

	// Check ExpInYear
	public boolean checkExpInYear(int expInYear) {
		boolean check = false;
		if (expInYear >= 0 && expInYear <= 10) {
			check = true;
		}
		return check;
	}

	// Check GraduationRank
	public boolean checkGraduationRank(String graduationRank) {
		boolean check = false;
		switch (graduationRank) {
		case "Excellence":
			check = true;
			break;
		case "Good":
			check = true;
			break;
		case "Fair":
			check = true;
			break;
		case "Poor":
			check = true;
			break;
		default:
			System.out.println();
			break;
		}
		return check;
	}

	// Check Email
	public boolean checkEmail(String email) {
		boolean check = false;
		Pattern p = Pattern.compile("^[a-zA-Z]+(\\.[a-zA-Z]+)@[a-zA-Z]{3}(\\.[a-zA-Z]{3})(\\.[a-zA-Z]{2})");
									//nguyen.vannam@vti.com.vn) 
		if (p.matcher(email).find()) {
			check = true;
		}
		return check;
	}

	// Check Password
	public boolean checkPass(String pass) {
		boolean check = false;
		boolean check1 = false;

		if (pass.length() >= 6 && pass.length() <= 12) {
			check = true;
		}

		for (int i = 0; i < pass.length(); i++) {
			if (pass.charAt(i) == Character.toUpperCase(pass.charAt(i)) && check == true) {
				check1 = true;
				break;
			}
		}
		return check1;
	}

	@Override
	public void dangKyExperienceCandidate(String firstName, String lastName, String pass, String phone, String email,
			int expInYear, String proSkill) throws SQLException {
		String email1 = email;
		String pass1 = pass;
		String phone1 = phone;
		int expInYear1 = expInYear;
		boolean check = false;

		// Check email
		while (!check) {
			if (checkEmail(email1)) {
				check = true;
			} else {
				System.out.println("Nhap email dung dinh dang");
				email1 = ScannerUtils.inputString();
			}
		}

		// Check password
		check = false;
		while (!check) {
			if (checkPass(pass1)) {
				check = true;
			} else {
				System.out.println("Nhap password tu 6 den 12 ki tu,it nhat co 1 chu cai viet hoa,");
				pass1 = ScannerUtils.inputString();
			}
		}

		// Check phone
		check = false;
		while (!check) {
			if (checkPhone(phone1)) {
				check = true;
			} else {
				System.out.println("Nhap phone tu 9 den 12 so");
				phone1 = ScannerUtils.inputString();
			}
		}

		// Check expInYear
		check = false;
		while (!check) {
			if (checkExpInYear(expInYear1)) {
				check = true;
			} else {
				System.out.println("Nhap expInYear tu 0 den 10");
				expInYear1 = ScannerUtils.inputInt();
			}
		}

		candidateReponsitory.dangKyExperienceCandidate(firstName, lastName, pass1, phone1, email1, expInYear1, proSkill);

	}

	@Override
	public void dangKyFresherCandidate(String firstName, String lastName, String pass, String phone, String email,
			String graduationRank) throws SQLException {
		boolean check = false;
		String email1 = email;
		String pass1 = pass;
		String phone1 = phone;
		String graduationRank1 = graduationRank;

		// Check email
		while (!check) {
			if (checkEmail(email1)) {
				check = true;
			} else {
				System.out.println("Nhap email dung dinh dang");
				email1 = ScannerUtils.inputString();
			}
		}

		// Check password
		check = false;
		while (!check) {
			if (checkPass(pass1)) {
				check = true;
			} else {
				System.out.println("Nhap password it nhat co 1 chu cai viet hoa");
				pass1 = ScannerUtils.inputString();
			}
		}

		// Check phone
		check = false;
		while (!check) {
			if (checkPhone(phone1)) {
				check = true;
			} else {
				System.out.println("Nhap phone tu 9 den 12 so");
				phone1 = ScannerUtils.inputString();
			}
		}
		
		//Check GraduationRank
		check = false;
		while(!check) {
			if (checkGraduationRank(graduationRank1)) {
				check = true;
			} else {
				System.out.println("Chọn 1 trong 4 giá trị (Excellence, Good, Fair, Poor)");
				graduationRank1 = ScannerUtils.inputString();
			}
		}
		
		candidateReponsitory.dangKyFresherCandidate(firstName, lastName, pass1, phone1, email1, graduationRank1);
	}

	@Override
	public boolean errorLogin(String email, String pass) throws SQLException {
		boolean check = false;
		String email1 = email;
		String pass1 = pass;
		
		while(!check){
			if (checkEmail(email1)) {
				check = true;
			}else{
				System.out.println("Nhap email dung dinh dang");
				email1 = ScannerUtils.inputString();
			}
		}
		
		check = false;
		while(!check){
			if (checkPass(pass1)) {
				check = true;
			}else{
				System.out.println("Nhap password it nhat co 1 chu cai viet hoa");
				pass1 = ScannerUtils.inputString();
			}
		}
		return candidateReponsitory.errorLogin(email1, pass1);
	}

}
