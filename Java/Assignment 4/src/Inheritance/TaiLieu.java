package Inheritance;

import java.util.Scanner;

public class TaiLieu {
	private int id; // Mã tài liệu
	private String name; // Tên nhà xuất bản
	private String number; // Số bản phát hành

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void Add() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu: ");
		id = scaner.nextInt();
		System.out.println("Nhập tên nhà xuất bản: ");
		name = scaner.next();
		System.out.println("Nhập số bản phát hành: ");
		number = scaner.next();
	}

	public void Mess() {
		System.out.println("Thông tin tài liệu vừa nhập là:");
		System.out.println("Mã tài liệu: " + id);
		System.out.println("Nhà xuất bản: " + name);
		System.out.println("Số bản phát hành: " + number);
	}

}
