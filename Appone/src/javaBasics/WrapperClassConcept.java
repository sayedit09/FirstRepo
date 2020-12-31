package javaBasics;

public class WrapperClassConcept {
	
	public static void main(String []args) {
		
		String i="120";
		System.out.println(i+20);
		
		//data conversion string to int
		int j=Integer.parseInt(i);
		System.out.println(j+20);
		
		
	//String to Double conversion	
	String k="120.34";
	System.out.println(k+10);
	
	double l=Double.parseDouble(k);
	System.out.println(l+10);
	
	//String to Boolean conversion	
	String m="True";
	System.out.println(m);
   Boolean n=  Boolean.parseBoolean(m);
   System.out.println(n);
   
   
   //int to String conversion	
   int o= 100;
   System.out.println(o+20);
   String s=String.valueOf(o);
		System.out.println(s);
		
		////100A is not a correct string to convert to integer.
		String u="100A";  //NumberFormatException
		Integer.parseInt(u);
	}

}
