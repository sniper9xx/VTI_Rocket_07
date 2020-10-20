package frontend;

import java.sql.SQLException;

import backend.controller.CandidateController;
import utils.ScannerUtils;

public class Program {
	private static CandidateController CandidateC;
	
	 public static void main(String[] args) throws SQLException {
		CandidateC = new CandidateController();
		
		int selection;
		do {
			System.out.println("-------NOTHING IMPOSSIBLE------");
			System.out.println();
			System.out.println("Mời bạn chọn chức năng:");
			System.out.println("1. Đăng nhập");
			System.out.println("2. Đăng ký");	
			System.out.println("3. Thoát");
			System.out.println();
			selection = ScannerUtils.inputInt();
			switch (selection) {
			case 1:
				dangNhap();
				break;
			case 2:
				dangKy();
				break;
			case 3:
				System.out.println("Thoát chương trình thành công!");
				break;
			default:
				System.out.println("Không có lựa chọn này");
				break;
			}
		} while (selection != 3);
	}
	 
	private static void dangKy() throws SQLException {
		boolean check = false;
		System.out.println("Nhập loại  Candidate  bạn muốn tạo");
		System.out.println("1 - ExperienceCandidate");
		System.out.println("2 - FresherCandidate");
		while(!check) {
			int loai = ScannerUtils.inputInt();
			if (loai == 1) {
				dangKyExperienceCandidate();
				check = true;
			} else if (loai == 2) {
				dangKyFresherCandidate();
				check = true;
			} else {
				System.out.println("Lựa chọn không chính xác. Chọn lại!");
			}			
		}
		
	}
	private static void dangKyFresherCandidate() throws SQLException {
		System.out.println("Nhap firstName:");
		String firstName = ScannerUtils.inputString();
		System.out.println("Nhap lastName:");
		String lastName = ScannerUtils.inputString();
		System.out.println("Nhap Password:");
		String pass = ScannerUtils.inputString();
		System.out.println("Nhap phone:");
		String phone = ScannerUtils.inputString();
		System.out.println("Nhap email:");
		String email = ScannerUtils.inputString();
		System.out.println("Nhap GraduationRank:");
		String graduationRank = ScannerUtils.inputString();
			
		CandidateC.dangKyFresherCandidate(firstName, lastName, pass, phone, email, graduationRank);
	}

	private static void dangKyExperienceCandidate() throws SQLException {
		System.out.println("Nhap firstName:");
		String firstName = ScannerUtils.inputString();
		System.out.println("Nhap lastName:");
		String lastName = ScannerUtils.inputString();
		System.out.println("Nhap Password:");
		String pass = ScannerUtils.inputString();
		System.out.println("Nhap phone:");
		String phone = ScannerUtils.inputString();
		System.out.println("Nhap email:");
		String email = ScannerUtils.inputString();
		System.out.println("Nhap ExpInYear:");
		int expInYear = ScannerUtils.inputInt();
		System.out.println("Nhap proSkill:");
		String proSkill = ScannerUtils.inputString();
		
		CandidateC.dangKyExperienceCandidate(firstName, lastName, pass, phone, email, expInYear, proSkill);
		
	}

	private static void dangNhap() throws SQLException {
		System.out.println("Nhập email: ");
		String email = ScannerUtils.inputString();
		System.out.println("Nhập password: ");
		String pass = ScannerUtils.inputString();
		if (CandidateC.errorLogin(email, pass)) {
			System.out.println("Đăng nhập thành công");
		} else {
			System.out.println("Email hoặc password không chính xác. Vui lòng kiểm tra lại!");
		}
	}
}
