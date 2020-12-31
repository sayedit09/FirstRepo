package generalpractise;

import java.io.FileInputStream;


public class B {
	
	public static void main(String[]args) {
		
		
		try {
			
			FileInputStream file=new FileInputStream("D:\\test.txt");
			for (int i=0;i<=5;i++) {
		System.out.println((char)file.read());
			
			
		}
		}
		
		catch(Exception e)
		{
			
		System.out.println(e);	
			
		}
	
	


	}
}
	
