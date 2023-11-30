package javalab;

import java.util.Scanner;

class MultiplicationTable{
	 public synchronized void print(int num) {
		 for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+num+"="+i*num); 
		 }
		 System.out.println("-------------");
	 }
 }
class Thread1 extends Thread{
	MultiplicationTable multi;
	int num1;
	public Thread1(MultiplicationTable multi, int num1) {
		this.num1=num1;
		this.multi=multi;
	}
	public void run() {
		multi.print(num1);
	}
}
class Thread2 extends Thread{
	MultiplicationTable multi;
	int num2;
	public Thread2(MultiplicationTable multi,int num2) {
		this.multi=multi;
		this.num2=num2;
}
	public void run() {
		multi.print(num2);
	}
}
class Thread3 extends Thread{
	MultiplicationTable multi;
	int num3;
	public Thread3(MultiplicationTable m,int numb3) {
		multi=m;
		num3=numb3;
	}
	public void run() {
		multi.print(num3);
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Table you want to run by thread1:");
		 int number1=sc.nextInt();
		 System.out.print("Enter the Table you want to run by thread2:");
		 int number2=sc.nextInt();
		 System.out.print("Enter the Table you want to run by thread3:");
		 int number3=sc.nextInt();
		 MultiplicationTable m = new MultiplicationTable();
		 Thread1 t1 = new Thread1(m, number1);
		 t1.start();
		 Thread3 t3 = new Thread3(m, number3);
		 t3.start();
		 Thread2 t2 = new Thread2(m, number2);
		 t2.start();
	}

}
