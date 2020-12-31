package AbstractionConept;

public abstract class Bank {
	//Partial Abstraction
	//Hiding the implementation logic --is called abstraction
	//Abstract method can have abstract and non abstract method.
	
	
	public abstract void  loan ();//abstract method ---no method body
	 
	
	//non abstract method
	public void credit() {
		 
	System.out.println("Bank- credit");	 
		 
	 }
	
	
	public void debit() {
		System.out.println("Bank--debit");
		
	}
	

	
}
