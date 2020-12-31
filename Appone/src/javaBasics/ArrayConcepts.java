package javaBasics;

public class ArrayConcepts {
	
	
	public static void main(String ars[]) {
		//array: to store similar data type values in a array variable
		
		
		
		//1.int array
		//lowest bound /index=0
		//uper bound/index= n-1 (n is size of array)
		//one dimensional array
		
		//dis.advantages of array 
		//1.size is fixed==static array------To overcome this problem we use Collections---ArrayList,HashTable---use dynamic array.
		//2.store only similar data types---- To overcome this problem we use Object array.
		
		int i[]= new int[4];
		
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 //i[4]=50; (array indexOUt Of bound exception)
		 System.out.println(i[1]);
		 
		 
		 System.out.println(i.length);//size//length of array
		 
		 //print all the values of array ..use for loop
		 for(int j=0;j<i.length;j++) {
			 
			 System.out.println(i[j]);
			 
		 }
		 //2.char array 
		 char k[]= new char [3];
		 k[0]='a';
		 k[1]=2;
		 k[2]='q';
		 
		 System.out.println(k[2]);
		 System.out.println(k.length);
		 
		 //3.boolean array
		 
		 boolean l[]=new boolean[2];
		 
		 l[0]=true;
		 l[1]=false;
		 
		 System.out.println(l[1]);
		 
		 // Similarly for double array and String array.
		 
		 //4.Object array :Object is a class-- is used to store different data types values.
		 
		 Object ob[]=new Object[4];
		 ob[0]= 21;
		 ob[1]='A';
		 ob[2]="sayed";
		 ob[3]=23.45;
		 
		 System.out.println(ob[2]);
		 System.out.println(ob.length);
		 
		 for(int m=0;m<ob.length;m++) {
			 
			 System.out.println(ob[m]);
			 
		 }
		 
		
				
		
		
		
	}

}
