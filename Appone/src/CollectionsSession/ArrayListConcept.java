package CollectionsSession;

import java.util.ArrayList;
import java.util.Iterator;

import variables.E;






/*ArrayList: Java Collections Framework Tutorial Part 2:

Java ArrayList class:

Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

+Java ArrayList class can contain duplicate elements.
+Java ArrayList class maintains insertion order.
+Java ArrayList class is non synchronized.
+Java ArrayList allows random access because array works at the index basis.
+In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.

Learn:
+Static Array and Dynamic Array
+How to get the size of array list
+Iterate Array List using for loop and Iterator
+Generics vs Non-Generics in ArrayList
+Add, Merge, Retain and User Defined Class Objects in Array List

===================================================*/
public class ArrayListConcept {
	
	
	public static void main(String[] args) {
		
		
		int a[] = new int[5];//static array ...size is fixed
		
		//dynamic Array-------Array list
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. Synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size()); //size of arraylist
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(12.5);
		ar.add("Sayed");
		ar.add('A');
		System.out.println(ar.size());
		  System.out.println(ar.get(4)); //to get the value from an index
		
		//to print all the values from arraylist: 
		//1. for loop'
		//2. using iterator
	
		for(int i = 0;i<ar.size();i++)  {
			System.out.println(ar.get(i));
			  }
		  
		//non generic vs generic:
		
		ArrayList <Integer> ar1=new ArrayList <Integer>() ;
		  ar1.add(100);
		  //ar1.add("see");
		  
		  ArrayList <String>ar2=new ArrayList<String>();
		  ar2.add("Selenium2");
		  
		  ArrayList<E> ar3= new ArrayList<E>();
		  
		  
		//Employee class Objects:
			Employee e1 = new Employee("Sayed", 27, "QA");
			Employee e2 = new Employee("Tom", 28, "QA");
			Employee e3 = new Employee("Zeeshan", 29, "QA");
			
			
			//create arraylist:
			ArrayList<Employee> ar4 = new ArrayList<Employee>();
			ar4.add(e1);
			ar4.add(e2);
			ar4.add(e3);
			
			//iterator to traverse the values:
			Iterator<Employee> it = ar4.iterator();
			while(it.hasNext()){
				Employee emp = it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
			}
			
			
			System.out.println("*******");
			//**********************
			
			//addAll()
			ArrayList<String> ar5 = new ArrayList<String>();
			ar5.add("test");
			ar5.add("selenium");
			ar5.add("QTP");
			
			ArrayList<String> ar6 = new ArrayList<String>();
			ar6.add("dev");
			ar6.add("Java");
			ar6.add("JavaScript");
			
			ar5.addAll(ar6);
			
			for(int i=0; i<ar5.size(); i++){
				System.out.println(ar5.get(i));
		  
	}
			
			System.out.println("*******");

			
			//removeAll:
			ar5.removeAll(ar6);
			for(int i=0; i<ar5.size(); i++){
				System.out.println(ar5.get(i));
			}
			
			
			System.out.println("*******");

			//retainAll()
			
			ArrayList<String> ar7 = new ArrayList<String>();
			ar7.add("test");
			ar7.add("selenium");
			ar7.add("QTP");
			
			ArrayList<String> ar8 = new ArrayList<String>();
			ar8.add("test");
			ar8.add("Java");

			ar7.retainAll(ar8);
			for(int i=0; i<ar7.size(); i++){
				System.out.println(ar7.get(i));

}
	}

}
