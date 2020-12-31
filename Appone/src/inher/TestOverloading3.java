/**
 * 
 */
package inher;



class TestOverloading1{  


		static int add(int a,int b)
		{
			return a+b;
			}  
		static double add(int a,int b,int c)
		{
			return a+b;
			}  
		}  
		class TestOverloading3{  
		public static void main(String[] args){  
		System.out.println(TestOverloading1.add(11,11));//ambiguity  
		}}  