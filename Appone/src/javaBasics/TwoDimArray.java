package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
	
		String st[][]=new String[3][5];
		
		System.out.println(st.length);//3 ....Total no. of rows.
		System.out.println(st[0].length);//5....Total no. of columns.
		//1st row
		st[0][0]="A";
		st[0][1]="B";
		st[0][2]="C";
		st[0][3]="D";
		st[0][4]="E";
		
		//2nd row
		st[1][0]="F";
		st[1][1]="G";
		st[1][2]="H";
		st[1][3]="I";
		st[1][4]="J";
		
		//3rd row
		st[2][0]="K";
		st[2][1]="L";
		st[2][2]="M";
		st[2][3]="N";
		st[2][4]="O";
		
		System.out.println(st[0][3]);
		System.out.println(st[2][3]);
		
		System.out.println("*************");
		
		//print all values of 2d arrays ..using for loop
		//row =0 ,colm =0 to 4
		//row =1 ,colm =0 to 4
		//row =2 ,colm =0 to 4
		
		for(int row=0;row <st.length;row++) {
		 for(int colm=0;colm<st[0].length;colm++)
		System.out.println(st[row][colm]);
		}
	}

}
