package Inheritance;

import java.util.Scanner;

public class Book extends TaiLieu {
	private String nameWriters; // tên tác giả
	private int numberOfPages; // số trang

	public String getNameWriters() {
		return nameWriters;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	@Override
	public void Add() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập tên tác giả: ");
		nameWriters = scaner.nextLine();
		System.out.println("Nhập số trang: ");
		numberOfPages = scaner.nextInt();
		super.Add();
	}
	
	@Override
	public void Mess(){
		super.Mess();
		System.out.println("Tên tác giả: "+nameWriters);
		System.out.println("Số trang: "+numberOfPages);
		System.out.println("Loại tài liệu: Sách");

	}
}
