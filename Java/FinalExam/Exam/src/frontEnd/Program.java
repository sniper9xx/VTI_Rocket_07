package frontEnd;

import java.sql.SQLException;

import backend.controller.UserController;
import utils.ScannerUtils;

public class Program {
	private static UserController userController;

	public static void main(String[] args) throws SQLException {
		userController = new UserController();

		int chon;
		do {
			System.out.println("-----KHONG MUON THI LAI-------");
			System.out.println();
			System.out.println("             Users system              ");
			System.out.println("      1. Đăng nhập                   ");
			System.out.println("      2. Đăng ký                     ");
			System.out.println("      0. Thoát chương trình          ");
			System.out.println("                                       ");
			System.out.println();
			System.out.println("      Xin mời chọn chức năng           ");
			chon = ScannerUtils.inputInt("Vui lòng nhập vào một số. Nhập lại!");
			switch (chon) {
			case 1:
				dangNhap();
				break;
			case 2:
				dangKy();
				break;
			case 0:
				System.out.println("Đã thoát chương trình!");
				break;
			default:
				System.err.println("Không có lựa chọn này. Nhập lại !");
				break;
			}
		} while (chon != 0);
	}

	private static void dangNhap() throws SQLException {
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap pass word:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		if (userController.isUserExists(email, pass))
			System.out.println("Đăng nhập thành công!");
		else
			System.out.println("Email hoặc password không đúng. Kiểm tra lại!");
	}

	private static void dangKy() throws SQLException {
		boolean check = false;
		System.out.println("Nhap loai user muon tao (0-Employee; 1-Manager ;  2-Project): ");
		while (!check) {
			int loaiUser = ScannerUtils.inputInt("Nhap vao 1 so");
			if (loaiUser == 1) {
				dangKyManager();
				check = true;
			} else if (loaiUser == 0) {
				dangKyEmployee();
				check = true;
			} else if (loaiUser == 2) {
				dangKyProject();
				check = true;
			} else {
				System.out.println("Khong co lua chon nay. Nhap lai!");
			}
		}
	}

	private static void dangKyProject() throws SQLException {
		System.out.println("Nhap ProjectID:");
		int projectId = ScannerUtils.inputInt("Nhap lai!");
		System.out.println("Nhap teamSize:");
		int teamSize = ScannerUtils.inputInt("Nhap lai!");
		System.out.println("Nhap idManager:");
		int idManager = ScannerUtils.inputInt("Nhap lai!");
		System.out.println("Nhap idEmployees");
		int idEmployees = ScannerUtils.inputInt("Nhap lai!");
		userController.registerProject(projectId, teamSize, idManager, idEmployees);
	}
	
	private static void dangKyManager() throws SQLException {
		System.out.println("Nhap FullName:");
		String fullName = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap pass word:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap ExpInYear:");
		int expInYear = ScannerUtils.inputInt("Nhap lai!");
		userController.registerManager(fullName, email, pass, expInYear);
	}

	private static void dangKyEmployee() throws SQLException {
		System.out.println("Nhap FullName:");
		String fullName = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap Password:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap projectId:");
		int projectId = ScannerUtils.inputInt("Nhap lai!");
		System.out.println("Nhap ProSkill:");
		String proSkill = ScannerUtils.inputString("Nhap lai!");
		userController.registerEmployee(fullName, email, pass, projectId, proSkill);
	}
}
