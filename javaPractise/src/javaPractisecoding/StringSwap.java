package javaPractisecoding;

public class StringSwap {
	
	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		
		a=a+b;//HelloWorld
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());//Hello
		
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
