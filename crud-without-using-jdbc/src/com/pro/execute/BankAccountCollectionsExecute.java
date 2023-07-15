package com.pro.execute;

import java.util.Scanner;

import com.pro.pojo.BankAccount;

public class BankAccountCollectionsExecute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean bn = true;
		while (bn) {
			
			System.out.println("PRESS 1 for add new student/insert");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get detail of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update students");
			System.out.println("PRESS 6 for exit");
			try {
				int ch = 0;
				switch (ch) {
				case 1:
					// add new student/insert
					// taking inputs from users
					System.out.println("Enter user id:");
                    int customerAccountNumber = s.nextInt();
					System.out.println("Enter user name:");
                    String customerName = s.nextLine();
					System.out.println("Enter user city:");
                    String accountbalance = s.nextLine();

					// creating student object and setting values
					// saving student object to database by calling insert of student dao
                    BankAccount bankAccount = new BankAccount(customerAccountNumber, customerName, customerAccountNumber);
                    
					System.out.println("student added:" +bankAccount);
					System.out.println("**************************************");
					System.out.println();
					break;
				case 2:

					// display all students
					
					break;
				case 3:
					// get detail of single student
					
					break;
				case 4:
				
				case 5:
					// update student
					
					break;

				case 6:
					// exit
					bn = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try with another one!!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("thankyou for using my application");
		System.out.println("see you soon");

	}

}
