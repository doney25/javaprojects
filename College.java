/* File 	  : interface.java
 * Description: interface of College
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 03/11/2023
 */
package javalab;

import java.util.Scanner;

public class College {
 public static void main(String [] args) {
	 Student student=new Student();
	 student.getCollegeName();
	 student.getDepartment();
	 student.getName();
	 student.printdetails();
 }
}

interface college{
	void getCollegeName();
	
   }
interface department extends college{
	void getDepartment();
	}
class Student implements department{
	String name,collegeName,department;
	Scanner sc=new Scanner(System.in);
	public void getName() {
		System.out.println("Enter the Name:");
		name=sc.nextLine();
	}
	public void getCollegeName() {
		System.out.println("Enter the College Name:");
		collegeName=sc.nextLine();
	}
	public void getDepartment() {
		System.out.println("Enter the Department:");
		department=sc.nextLine();
	}
	public void printdetails() {
	 System.out.println("Name is "+name);
	 System.out.println("Department is "+department);
	 System.out.println("College is "+collegeName);
	}
}
