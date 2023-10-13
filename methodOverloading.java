package javalab;


import java.util.Scanner;

public class methodOverloading {
		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Base of the Triangle:");
			int base=sc.nextInt();
			System.out.println("Enter the Height of the Triangle:");
			int breadth=sc.nextInt();
			System.out.println("Enter the Width of the Rectangle");
			float width=sc.nextFloat();
			System.out.println("Enter the Height of the Rectangle");
			float height=sc.nextFloat();
			System.out.println("Enter the Radius of the Circle");
			float radius=sc.nextFloat();
			Shape shapes = new Shape();
			shapes.area(breadth,base);
			shapes.area(width,height);
			shapes.area(radius);
			
		}
		}
		class Shape {
			int area;
			public void area(int base, int breadth ) {
				area=(base*breadth)/2;
				System.out.println("The area of Triangle "+area);
			}
			public void area(float width, float height) 
			{
				 
				System.out.println("The area of Rectangle "+height*width);
			}
		    public void area(float radius)
		    {	    	
		    	System.out.println("The area of Circle "+3.14*radius*radius);
		    }
		}
		

