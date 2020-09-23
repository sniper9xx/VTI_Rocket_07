package Inheritance;

import java.util.Scanner;

public class KySu extends CanBo{
	private String trainingIndustry; //ngành đào tạo

	public String getTrainingIndustry() {
		return trainingIndustry;
	}
	@Override
	public void Add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngành đào tạo: ");
		trainingIndustry = sc.nextLine();
		super.Add();
	}
	
	@Override
	public void Mess(){
		super.Mess();
		System.out.println("Phòng ban: Kỹ sư");
		System.out.println("Ngành đào tạo: " + trainingIndustry);
	}
}
