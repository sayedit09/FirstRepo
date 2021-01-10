package javaPractisecoding;

public class WrapperClass {
	
	
	public static void main(String[] args) {
		
		String s="100";
		System.out.println(s+10);
		 //data conversion string to int
		 int i=Integer.parseInt(s);
		 System.out.println(i+100);
		 
		 
		 //string to double
		 String y="12.13";
		 System.out.println(y);
		 
		 double d=Double.parseDouble(y);
		 System.out.println(d+10);
		 
		 
		 //string to boolean
		 String k="true";
		        boolean bt= Boolean.parseBoolean(k);
		        System.out.println(bt);
		         
		       //int to string 
		        int j=200;
		        System.out.println(j+10);
		       String std= String.valueOf(j);
		       System.out.println(std+10);
		       
		       String sg="Asa123";//number format exception..bcz it contain alha numeric..
		       Integer.parseInt(sg);
		       
		        
		        
		
	}

}
