package Inheritance;

import java.util.Scanner;

public class Magazine extends TaiLieu {
	private int issueNumber; // Số phát hành
	private int month; // Tháng phát hành

	public int getIssueNumber() {
		return issueNumber;
	}

	public int getMonth() {
		return month;
	}
	
	@Override
	public void Add() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập số phát hành: ");
		issueNumber = scaner.nextInt();
		System.out.println("Nhập tháng phát hành: ");
		month = scaner.nextInt();
		super.Add(); // Ke thua Tai lieu
	}

	@Override
	public void Mess() {
		// Ke thua Tai lieu
		super.Mess(); 
		System.out.println("Số phát hành: " + issueNumber);
		System.out.println("Tháng phát hành: " + month);
		System.out.println("Loại tài liệu: Tạp chí");

	}
}
