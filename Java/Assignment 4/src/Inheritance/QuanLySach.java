package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Thêm mới tài liêu: Sách, tạp chí, báo
		Them();
		//2.Xoá tài liệu
		Xoa();
		//3.Hiện thông tin tài liệu
		ThongTin();
	}

	public static void Them(){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập loại tài liệu: ");
		String input = scaner.nextLine();
		switch (input) {
		case "Sách":
			Book b = new Book();
			b.Add();
			b.Mess();
			break;
		case "Tạp chí":
			Magazine m = new Magazine();
			m.Add();
			m.Mess();
			break;
		case "Báo":
			Newspaper n = new Newspaper();
			n.Add();
			n.Mess();
			break;
		default:
			break;
		}
	}
	
	public static void Xoa(){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu muốn xoá: ");
		int input = scaner.nextInt();
		ArrayList<TaiLieu> taiLieu = new ArrayList<TaiLieu>(); // tạo ra danh sách các tài liệu
		for (TaiLieu taiLieu1 : taiLieu) {	
			if (input == taiLieu1.getId()) {
				taiLieu.remove(taiLieu1);
			}
		}
	}
	
	public static void ThongTin(){
		ArrayList<TaiLieu> taiLieu = new ArrayList<TaiLieu>(); // tạo ra danh sách các tài liệu
		for (TaiLieu TaiLieu1 : taiLieu) {
			TaiLieu1.Mess();
		}
	}
	
	public static void TimKiem(){
		ArrayList<TaiLieu> taiLieu = new ArrayList<TaiLieu>(); // tạo ra danh sách các tài liệu
		for (TaiLieu TaiLieu1 : taiLieu) {
			////////////
		}
	}
	
}
