package javaPractisecoding;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	
	public static void main(String[]args) {
		
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		//to store any value ,use put
		hm.put(1, "Selenium");
		hm.put(2,"QTP");
		hm.put(3,"UFT");
		hm.put(4,"TFT");
		// fetch the value from specific key we use:
		
           System.out.println(hm.get(1));
           System.out.println(hm.get(2));
           System.out.println(hm.get(4));
           
  //print the all values from hashmap we use:
           
           for(Entry m:hm.entrySet()) {
        	   
        	   System.out.println(m.getKey()+ "  "+m.getValue());
        	   
           }
           //To remove values
           hm.remove(3);
           System.out.println(hm);
           
           ///baki copy me likha he ..putha wala copy me
		
		
	}
}
