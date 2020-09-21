
public class Circle {
	private double radius = 1.0;
	private String color = "red";
	private final static double PI = 3.14;
	
	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){	
		return PI*this.radius*this.radius;
	}
	
	public String toString(){		
		return "radius =  " + this.radius + "\n" + "color = " + color +"\n" + "Area = " + getArea();
	}
	
	public static void main(String[] args) {
		//Example
		Circle C1 = new Circle(10, "blue");
		System.out.println(C1.toString());
	}
}
