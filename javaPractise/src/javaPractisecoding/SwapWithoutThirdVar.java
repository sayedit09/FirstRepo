package javaPractisecoding;

public class SwapWithoutThirdVar {
	
	
	
	public static void main(String[] args) {
		
		int x=5;//0101
		int y=10;//1010      //note :8421 decimal representation
		
		//1.with using 3rd variable
		/*int t;
		t=x;
		x=y;
		y=t;*/
		
		//2.without using 3rd variable:using + operator
		
		/*x=x+y;
		y=x-y;
		x=x-y;*/
		
		//3.without using 3rd variable:using * operator
		
	/*	x=x*y;
		y=x/y;
		x=x/y;*/
		
		//4.using XOR operator
		
		x=x^y;//15...1111
		y=x^y;//10...1010
		x=x^y;//5...0101
				
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
