package javaBasics;

public class FinalizeConcept {
	
	
	public void finalize() {  //finalize  is used for cleanup processing before garbage collector
		//finalize is a method
		System.out.println("finalize method");
		
		
	}
	
	public static void main(String[] args) {
		
		FinalizeConcept f1= new FinalizeConcept();
		
		FinalizeConcept f2= new FinalizeConcept();
		
		f1=null;
		//f2=null;
		
		System.gc();
		
	}

}
