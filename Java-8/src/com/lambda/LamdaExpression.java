/**
 * 
 */
package com.lambda;

/**
 * @author AR
 *
 */
public class LamdaExpression {
	public static void main(String[] args) {
		System.out.println("Hii");
		
//		implementation using anonymous class 
		MyInter interImpl = new MyInter() {

			@Override
			public void m1() {
				System.out.println("this is first anonymous class");

			}
 
		};
		interImpl.m1();

		MyInter interImpl2 = new MyInter() {

			@Override
			public void m1() {
				System.out.println("this is second anonymous class");

			}

		};
		interImpl2.m1();
 
		
//		implementation using lambda expression
		MyInter interImpl3 = () -> {
			System.out.println("this is lamba expression");
		};

		interImpl3.m1();
		
//		SumInter sumInter1 = (a,b)-> a+b;
//			 
//		System.out.println(sumInter1.sum(10, 20));
//		
//		SubInter inter = (c,d)-> c-d;
//			 
//		System.out.println(inter.m2(12, 10));
//		
//		LengthInter lInter = str ->  str.length();  
//		System.out.println(lInter.getLength("abc"));
		
	}
}
