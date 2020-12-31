package CollectionsSession;

import java.util.Iterator;
import java.util.LinkedList;

/*Learn :
+What is Singly Linked List in Java
+Different Method in LinkedList
+How to iterate LinkedList using different loops and Iterator

~~~Singly Linked Lists are a type of data structure. It is a type of list. In a singly linked list each node in the list stores the contents of the node and a pointer or reference to the next node in the list.

It does not store any pointer or reference to the previous node. It is called a singly linked list because each node only has a single link to another node. To store a single linked list, you only need to store a reference or pointer to the first node in that list. 

The last node has a pointer to nothingness to indicate that it is the last node.

================================================*/

public class LinkedListsConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add:

		ll.add("QTP");
		ll.add("Selenium");
		ll.add("FTP");
		ll.add("ATM");
		ll.add("HTP");
		// print:
		System.out.println("Content of linked List:" + ll);
		// add First
		ll.addFirst("Test");

		// add List
		ll.addLast("sayed");

		System.out.println("Content of linked List:" + ll);
		// get:
		System.out.println(ll.get(6));

		// set:
		System.out.println(ll.set(0, "Test1"));

		System.out.println("Content of linked List:" + ll);

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linked List:" + ll);

		// remove from particular indexes
		ll.remove(0);

		System.out.println("Content of linked List:" + ll);

		// how to print all values of linked List

		// for loop
		System.out.println("*****using for loop");

		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		// Advance for loop
		System.out.println("*****using Advance for loop");

		for (String str : ll) {

			System.out.println(str);

		}
		// Iterator
		System.out.println("*****using Iterator");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		// while loop
		System.out.println("*****using while loop");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));

			num++;

		}

	}

}
