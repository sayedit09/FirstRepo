package javaPractisecoding;

public class StringManipulation {
	
	
	
	public static void main(String[] args) {
		
		
		String str="The rains have started here";
		String str1="The rains Have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', 9));//9 hardcoded
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//we do like that
		
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		
		//string comparision
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(0, 9));
		
		//trim
		String s= "  Hello world   ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		String date="10-04-2019";
		 System.out.println(date.replace("-", "/"));
		 
		 //split
		 String test="Hello_world_test_selenium";
		  String testval[] =test.split("_");
		  for(int i=0;i<testval.length;i++) {
			  System.out.println(testval[i]);
			  
		}
		  String s9="care";
		System.out.println(s9.concat("s"));
		
		  String s1="Hello";
		  String s2="World";
		  int a=10;
		  int b=20;
		  System.out.println(a+b);
		  System.out.println(a+b+s1+s2);
		  System.out.println(s1+b+s1+s2);
		  System.out.println(s1+s2+a+b);
		  System.out.println(a+b+(s1+s2));
		  
		
		
		
		
	}

}
