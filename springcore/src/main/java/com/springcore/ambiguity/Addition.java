/**
 * 
 */
package com.springcore.ambiguity;

/**
 * @author Abdul Razzaque M
 *
 */
public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("Constructor : int , int");
}
public Addition(double a, double b) {
	super();
	this.a = (int) a;
	this.b = (int) b;
	System.out.println("Constructor : double , double");
}
public Addition(String a, String b) {
	super();
this.a=Integer.parseInt(a);
this.a=Integer.parseInt(b);
	System.out.println("Constructor : String , String");
}
public void doSum() {
	System.out.println(this.a+" "+this.b);
	System.out.println("value of a: "+this.a);
	System.out.println("value of b: "+this.b);
}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}

}
