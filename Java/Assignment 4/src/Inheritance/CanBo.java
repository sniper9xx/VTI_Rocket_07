package Inheritance;

import java.util.Scanner;

public class CanBo {
	protected String name, address;
	protected int age;
	protected Gender gender;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gioitinh) {
		switch (gioitinh) {
		case "Nam":
			this.gender = Gender.Nam;
			break;
		case "Nữ":
			this.gender = Gender.Nữ;
			break;
		case "Khác":
			this.gender = Gender.Khác;
			break;
		default:
			break;
		}
	}

	// Thêm cán bộ
	public void Add() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập tên cán bộ: ");
		name = scaner.nextLine();

		System.out.println("Nhập tuổi cán bộ: ");
		age = scaner.nextInt();

		System.out.println("Nhập giới tính cán bộ: ");
		setGender(scaner.next());

		System.out.println("Nhập địa chỉ cán bộ: ");
		address = scaner.next();
	}

	// Hiển thị
	public void Mess() {
		System.out.println();
		System.out.println("Thông tin cán bộ vừa được thêm mới");
		System.out.println("Tên cán bộ: " + name);
		System.out.println("Tuổi cán bộ: " + age);
		System.out.println("Giới tính cán bộ: " + gender);
		System.out.println("Địa chỉ cán bộ: " + address);
	}

}
