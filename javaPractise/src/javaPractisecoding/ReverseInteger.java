package javaPractisecoding;

public class ReverseInteger {
	
	
	public static void main(String[] args) {
		
		
		long number=12345;
		long rev=0;
		while(number!=0) {
			rev=rev*10+number%10;//5
			number=number/10;//1234
			
			
		}
		System.out.println("Reverse number is::"  +rev);
	}

}
