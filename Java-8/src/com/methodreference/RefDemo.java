/**
 * 
 */
package com.methodreference;

/**
 * @author AR
 *
 */
public class RefDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting Method References:");
		WorkInter inter = () -> {
			System.out.println("this is doStuff method");
		};
		inter.doTask();
    
		// provide the implementation of WorkInter
		WorkInter inter2 = Stuff::doStuff;
		inter2.doTask();

		// provide the implementation of Runnable
		Runnable runnable = Stuff::doThread;
		Thread thread = new Thread(runnable);
		thread.start();

		Stuff stuff = new Stuff();
		Runnable runnable2 = stuff::doNumber;
		Thread thread1 = new Thread(runnable2);
		thread1.start();
	}

}
