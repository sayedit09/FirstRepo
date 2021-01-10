package javaPractisecoding;

public class SmallestAndLargestNumber {
	
	
	public static void main(String[] args) {
		int numbers[]= {-10,24,50,-88,987658};
		int largest= numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				
				largest=numbers[i];
				}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
				
			}
			
		
			
		}
		System.out.println("Smallest number::" +smallest);
		System.out.println("Largest number::"+largest);
	}

}
