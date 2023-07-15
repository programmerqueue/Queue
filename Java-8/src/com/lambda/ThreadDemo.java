/**
 * 
 */
package com.lambda;

/**
 * @author AR
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = null;
		Runnable thread11 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					t1.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};
		Thread t11 = new Thread(thread11);
		t11.setName("XYZ");
		t11.start();
	}

}
