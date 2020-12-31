package javaBasics;

public class RemoveJunk {
	
	public static void main(String args[]) {
		
		String s= "&&&&&&#@#@#$#@ Testing &&&&***Selenium";
		//Regular expression [a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		
	}

}
