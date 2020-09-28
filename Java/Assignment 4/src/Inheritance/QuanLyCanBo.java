package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	public static void ThemCanBo() {
		System.out.println("Thêm cán bộ");
		System.out.println("Nhập phòng ban cán bộ(Kỹ sư, Công nhân, Nhân viên)");
		Scanner sc = new Scanner(System.in);
		String dept = sc.nextLine();
		switch (dept) {
		case "Kỹ sư":
			KySu ks = new KySu();
			ks.Add();
			ks.Mess();
			break;
		case "Công nhân":
			CongNhan cn = new CongNhan();
			cn.Add();
			cn.Mess();
			break;
		case "Nhân viên":
			NhanVien nv = new NhanVien();
			nv.Add();
			nv.Mess();
			break;
		default:
			break;
		}
	}

	public static void TimKiem() {
		System.out.println("Nhập tên cán bộ cần tìm: ");
		Scanner sc = new Scanner(System.in);
		String find = sc.nextLine();
		CanBo cb = new CanBo();
		if (cb.name.equals(find)) {
			cb.Mess();
		}
	}

	public static void ListCanBo() {
		ArrayList<CanBo> canbo = new ArrayList<CanBo>();
		for (CanBo canbo1 : canbo) {
			canbo1.Mess();
		}
	}

	public static void DeleteCanBo() {
		System.out.println("Nhập tên cán bộ cần xoá: ");
		Scanner sc = new Scanner(System.in);
		String dele = sc.nextLine();
		CanBo cb = new CanBo();
		if (cb.name.equals(dele)) {
			/////////////////
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Thêm cán bộ
		ThemCanBo();

		// 2. Tìm kiếm theo họ tên
		TimKiem();

		// 3. Hiện danh sách cán bộ
		ListCanBo();

		// 4.Nhập vào tên cán bộ và xoá tên cán bộ đó
		DeleteCanBo();

	}

	
}
