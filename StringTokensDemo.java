/* File 	  : StringTokenizer.java
 * Description: Sum of Integer String
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 25/11/2023
 */
package animals;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokensDemo {
    public static void main(String args []) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter an Integer String:");
    	String numbers = sc.nextLine();
    	StringTokenizer input = new StringTokenizer(numbers);
    	System.out.println("No of tokens before is "+input.countTokens());
    	int sum=0;
    	System.out.println("Integers are:");
    	while(input.hasMoreElements()) {
    		int num = Integer.parseInt(input.nextToken());
    		System.out.println(num);
    		sum=sum+num;
    	}
    	System.out.println("sum is "+ sum);
    }
}