package com.springcore.standalone.collections;
// this is standdlone colleections
interface K {
	void a();
}

interface L {
	void a();
}

class B implements K, L {

	public void a() {
		System.out.println("sddfdfbgf");

	}

}

public class A {
	public static void main(String[] args) {

		L obj = new B();
		obj.a();
	}
}
