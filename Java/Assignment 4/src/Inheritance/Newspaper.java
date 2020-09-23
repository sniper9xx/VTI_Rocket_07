package Inheritance;

import java.util.Scanner;

public class Newspaper extends TaiLieu {
	private int day; //ngày phát hành

	public int getDay() {
		return day;
	}
	@Override
	public void Add(){
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập ngày phát hành");
		day = scaner.nextInt();
		super.Add();		
	}
	@Override
	public void Mess(){
		super.Mess();
		System.out.println("Ngày phát hành: "+ day);
		System.out.println("Loại tài liệu: Báo");

	}
}
