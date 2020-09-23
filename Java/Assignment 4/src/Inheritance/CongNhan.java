package Inheritance;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int rank;

	public int getRank() {
		return rank;
	}

	@Override // ghi đè
	public void Add() {
		// gọi trực tiếp từ phương thức cha (Cán bộ)
		System.out.println("Nhập bậc của công nhân: ");
		Scanner sc = new Scanner(System.in);
		rank = sc.nextInt();
		super.Add();
	}

	@Override // ghi đè
	public void Mess() {
		super.Mess();
		System.out.println("Phòng ban: Công nhân");
		// gọi trực tiếp từ phương thức cha (Cán bộ)
		System.out.println("Bậc: " + rank);

	}
}
