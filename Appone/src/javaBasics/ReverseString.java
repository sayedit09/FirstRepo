package javaBasics;

public class ReverseString {

	public static void main(String[] args) {
  //String is a immutable class
		String str = "selenium";
		
		//using for loop
		int len = str.length();// 8
         String revStr = "";

		for (int i = len - 1; i >= 0; i--) {
             revStr = revStr + str.charAt(i);// muineles
		}

		System.out.println(revStr);
		//using StringBuffer Class
         // StringBuffer is mutable class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
