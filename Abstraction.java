/* File 	  : Abstraction.java
 * Description    : Abstraction of Class
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 21/10/2023
 */
package javalab;
public class Abstraction {
	public static void main(String [] args) {
				Rectangle rectangle = new Rectangle();
				Triangle triangle = new Triangle();
				Hexagon hexagon = new Hexagon();
				rectangle.numberOfSides();
				triangle.numberOfSides();
				hexagon.numberOfSides();
	}
}
				
		abstract class Shapes{
		abstract public void numberOfSides();
			
		
				
			
		}
			class Rectangle extends Shape{
				public void numberOfSides(){
					System.out.println("The number of sides of Rectangle is 4");
				}
			}
			class Triangle extends Shape{
				public void numberOfSides() {
					System.out.println("The number of sides of Triangle is 3");
				}
			}
			class Hexagon extends Shape{
				public void numberOfSides() {
					System.out.println("The number of sides of Hexagon is 6");
				}
			
				
	}

