package javalab;

import java.util.Scanner;
class InvalidAmountException extends Exception{
 InvalidAmountException(String str) {
		super(str);
	}
}
class InsufficentException extends Exception{
	 InsufficentException(String str) {
			super(str);
		}
	 class Customer{
			int accountNumber , accountBalance;
			String accountType, name ;
			public void setCustomerDetails() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the account number:");
				accountNumber = sc.nextInt();
				System.out.println("Enter the account type:");
				accountType = sc.next();
				System.out.println("Enter the customer name:");
				name = sc.next();
				System.out.println("Enter the account opening balance:");
				accountBalance = sc.nextInt();
			}
			public void getCustomerDetails() {
				System.out.println("-------------------------");
				System.out.println("Customer details are:");
				System.out.println(" Account Number:"+accountNumber);
				System.out.println(" Account Type:"+accountType);
				System.out.println(" Customer Name:"+name);
				System.out.println(" Account Balance:"+accountBalance);
				System.out.println("-------------------------");
				
			}}
			
public class Banking {
		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			int choice=0;
			InvalidAmountException amountException = new InvalidAmountException("Invalid amount");
			InsufficentException fundsException = new InsufficentException("insufficent amount");
			System.out.print("Enter the number of customers:");
			int noOfCustomers = sc.nextInt(); 			
			Customer [] customer = new Customer [noOfCustomers];
			for(int i=0;i<noOfCustomers;i++) {
				customer[i]= new Customer();
				customer[i].setCustomerDetails();
			}
			
			do {
				System.out.println("1.Display all account details ");
				System.out.println("2.Search by Account number ");
				System.out.println("3.Deposit the amount  ");
				System.out.println("4.Withdraw the amount  ");
				System.out.println("5.Exit");
				System.out.print("Enter your choice:");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					for(int i=0;i<noOfCustomers;i++) {
						customer[i].getCustomerDetails();
					}
				   break;
				case 2:
					System.out.println("Enter the account number:");
					int searchAccount = sc.nextInt();
					for(int i=0;i<noOfCustomers;i++) {
						if(customer[i].accountNumber==searchAccount) {
							customer[i].getCustomerDetails();	
						}
					}
				case 3:
					System.out.println("Enter the account number:");
					searchAccount = sc.nextInt();
					try {
						System.out.println("Enter the amount to deposit:");
						int depositAmount= sc.nextInt();
						if(depositAmount>0) {
							throw amountException;
						}
						else {
							for(int i=0;i<noOfCustomers;i++) {
								if(customer[i].accountNumber==searchAccount) {
									customer[i].accountBalance=customer[i].accountBalance+depositAmount;
									customer[i].getCustomerDetails();
						}
						
					}
					
						}
					
					}
					catch(InvalidAmountException e) {
						System.out.println(e.getMessage());
					}
				case 4:
							System.out.println("Enter the account number:");
							searchAccount = sc.nextInt();
							try {
								System.out.println("Enter the amount to withdraw:");
								int withdrawAmount= sc.nextInt();
								if(withdrawAmount<=0) {
									throw amountException;
								}
								else {
									for(int i=0;i<noOfCustomers;i++) {
										if(customer[i].accountNumber==searchAccount) {
											if(withdrawAmount>customer[i].accountBalanace) {
												throw fundsException;
											}
											else {
												customer[i].accountBalance=customer[i].accountBalance-withdrawAmount;
												customer[i].getCustomerDetails();
											}
										}
									}
								}}
								catch(InsufficentException o) {
									System.out.println(o.getMessage());
								}
					
				  default: 
				}
			}
			while(choice<5);
	}


  

