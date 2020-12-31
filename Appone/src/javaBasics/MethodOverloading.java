package javaBasics;

public class MethodOverloading {
	
	public static void main(String[]args) {
		
		MethodOverloading a= new MethodOverloading();
		a.sum();
		a.sum(10, 20);
		//a.sum(a, b);
		
}
	
	
	public void sum() {
		
	System.out.println("Sum method");
	}
	public void sum(int a) {
		
		System.out.println("Sum method");
		}
		
	public void sum(int a,int b) {
		
		System.out.println("Sum method");
		System.out.println(a+b);
		
	}


}
