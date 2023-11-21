/*file			:	Exception.java
 * Author		:	Doney Siby
 * version		:	1.0
 * description	:	Exception handling
 * date			:	31/10/23
 */
package animals;
import java.util.Scanner;
public class ExceptionDemo1 {

	public static void main(String[] args) {
		char ch='y';
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		while(ch=='y') {
		System.out.println("Program to perform division");
		System.out.print("Enter the first number=");
		num1=sc.nextInt();
		System.out.print("enter the second number=");
		num2=sc.nextInt();
		try {
		result=num1/num2;
		System.out.println("Result="+result);

	}
		catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}
		finally {
			System.out.println("End of operation");
			System.out.println("do you want to continue?(y/n)");
			ch=sc.next().charAt(0);
		}
		}

}
}