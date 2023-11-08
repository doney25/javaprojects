package javalab;

public class ExceptionDemo {
	public static void main(String [] args) {
		try {
			String s="123";
			int [] array =  new int[5];
			System.out.println(Integer.parseInt(s)); 
			System.out.println(10/0); //ArithmaticException
			System.out.println(array[6]); //ArrayIndexOutOfBoundException
			
		}
		catch (NumberFormatException e)
		{
			//e.printStackTrace();
			System.out.println("Sorry!! Number format");
		}
		catch (ArithmeticException e) {
			System.out.println("sorry");
		}
		catch (Exception e) {
			System.out.println("general exception");
			
		}
		
		finally {
			System.out.println("Hello");
		}
	}
}
