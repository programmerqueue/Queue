/**
 * 
 */
package com.methodreference;

import java.time.LocalDate;

/**
 * @author AR
 *
 */
public class Stuff {
	public static void doStuff() {
		System.out.println("this is working:");
		LocalDate date = LocalDate.now();
		System.out.println(date.toString());
	}

	public static void doThread() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	public  void doNumber() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
