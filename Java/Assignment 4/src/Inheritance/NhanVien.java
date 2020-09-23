package Inheritance;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String jobs;

	public String getJobs() {
		return jobs;
	}

	@Override
	public void Add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập công việc nhân viên: ");
		jobs = sc.nextLine();		
		super.Add();
	}
	
	public void Mess(){
		super.Mess();
		System.out.println("Phòng ban: Kỹ sư");
		System.out.println("Công việc:  "+ jobs);
	}
}
