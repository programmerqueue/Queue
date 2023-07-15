package com.pro.execute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.pro.pojo.Employee;

public class MainEmployee {

	public static void main(String[] args) {
//		Collection<Employee> c = new ArrayList<Employee>();
		List<Employee> c = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		boolean bn = true;
		while(bn) {

			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println("6. EXIT");
			System.out.println("Enter your Choice : ");
			ch = s.nextInt();
			try {
			switch (ch) {
			case 1:
				System.out.println("Enter a employee No:");
				int eno = s.nextInt();
				System.out.println("Enter employee name");
				String ename = s1.nextLine();
				System.out.println("Enter employee salary");
				double esalary = s.nextDouble();
				c.add(new Employee(eno, ename, esalary));
				break;
			case 2:
				System.out.println("*****************************************************");
				Iterator<Employee> i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("*****************************************************");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter empNo to Search");
				eno = s.nextInt();
				System.out.println("*****************************************************");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.geteId() == eno) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not Found");
				}
				System.out.println("*****************************************************");

				break;
			case 4:
				found = false;
				System.out.println("Enter empNo to Delete");
				eno = s.nextInt();
				System.out.println("*****************************************************");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.geteId() == eno) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not Found");
				} else {
					System.out.println("Record is Deleted Successfully......!");
				}
				System.out.println("*****************************************************");
				break;
			case 5:
				found = false;
				System.out.println("Enter empNo to Update");
				eno = s.nextInt();
				System.out.println("*****************************************************");
				ListIterator<Employee> li = c.listIterator();
				while (li.hasNext()) {
					Employee e = li.next();
					if (e.geteId() == eno) {
						System.out.println("Enter a new Name");
						ename = s1.nextLine();
						System.out.println("Enter a new Salary");
						esalary = s.nextDouble();
						li.set(new Employee(eno, ename, esalary));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not Found");
				} else {
					System.out.println("Record is Updated Successfully...!");
				}
				System.out.println("*****************************************************");
				break;
			case 6:
				System.out.println("Exit is Successfully...!");
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		} 

	}

}
