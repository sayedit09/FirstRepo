package javaPractisecoding;

public class MissingNumber {

	
	public static void main(String[] args) {
		
		int[]number= {1,2,4,5};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			   sum=sum+number[i];
			
			
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=5;j++) {
			
			sum1=sum1+j;
			
		}
		System.out.println(sum1);
		
		System.out.println("missing number::"   +(sum1-sum));
		
	}
}
