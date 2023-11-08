import java.util.Scanner;

public class InterfaceShape {
	public static void main(String [] args) {
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	Circle c=new Circle();
	r.getArea();
	c.getArea();
	t.getArea();
	}	
}
interface Shape{
	Scanner sc = new Scanner(System.in);
	public void getArea();
}
class Rectangle implements Shape {
	public void getArea() {
	System.out.print("Enter the Length and Breadth:");	
	int length= sc.nextInt();
	int breadth=sc.nextInt();
	System.out.println("Area of Rectangle:"+ breadth*length);
	}
}
class Triangle implements Shape {
	public void getArea() {
	System.out.print("Enter the Length and Height:");	
	int length= sc.nextInt();
	int height=sc.nextInt();
	System.out.println("Area of Triangle:"+ 0.5*height*length);
	}
}
class Circle implements Shape{
	public void getArea() {
	System.out.print("Enter the radius:");
	float radius=sc.nextFloat();
	System.out.println("Arae of Circle:"+ 3.14*radius*radius);
	}	
}

