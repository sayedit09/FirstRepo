package javaBasics;

public class FinallyConcept {

	public static void main(String[] args) {

		//test1();
		//test2();
		division();

	}

	public static void test1() {

		try {

			System.out.println("Inside the test 1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {

			System.out.println("inside catch block");
//finally is a block
		} finally {

			System.out.println("inside finally block");
		}
		
	}
		public static void test2() {
			
			
			try {
				System.out.println("Inside the test 2 method");
				
				}
			
			finally {
				
				System.out.println("Finally code  inside test 2 method");
				
			}
			
		}
		
		
		public static void division() {
			int i=10;
			try {
				System.out.println("inside try block");
				int j=i/0;
				
				
			} catch (NullPointerException e) {  //here iam giving NullPointerException ,but actually it is ArithematicException..So it will not catch exception .
				System.out.println("Inside catch block");
				System.out.println("divide by zero error");
				
           }
			finally {
				
				System.out.println("Execute this code even After any execution");
				
			}
			
			
		}
	}


