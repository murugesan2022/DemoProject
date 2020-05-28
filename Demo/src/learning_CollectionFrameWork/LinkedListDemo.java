
/*
 
java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.


 */



package learning_CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 


{

	public static void main(String[] args) 
	
	
	{
		
//		LinkedList<String> list1 = new LinkedList<String>();
//		
//		list1.add("Ravi");
//		list1.add("Mohit");
//		list1.add("Sonia");
//		list1.add("Sonu");
//		list1.add("Sumit");
//		
//		Iterator<String> itr = list1.iterator();
//		
//		while (itr.hasNext()) 
//		
//		{
//		   String Str= itr.next();
//		   System.out.println(Str);
//			
//		}
//		
//		// adding element in list 
//		
//		list1.addFirst("Negan");
//		
//		//Adding an element to the last position
//	     list1.addLast("Rick");
//		
//	   //Adding an element to the 3rd position
//	     list1.add(2, "Glenn");
//
//		System.out.println("Second list after addition of some elements");
//	   //Iterating LinkedList
//	     Iterator<String> iterator=list1.iterator();
//	     while(iterator.hasNext()){
//	       System.out.println(iterator.next());
//	     }
//		
//	     
//	     //.................................Remove elements from list 
//	     
//	    //Removing First element
//	      //Same as list.remove(0);
//	      list1.removeFirst();
//
//		System.out.println("After Remove first element");
//		
//		System.out.println(list1);
//		
//
//	      //Removing Last element
//	      list1.removeLast();
//
//		System.out.println("After removing last element from this list");
//		
//		System.out.println(list1);
//		
//		//removing 2nd element, index starts with 0
//	      list1.remove(2);
//	      
//	      
//	      System.out.println(list1);
		
		
		
		//..........................................................Another linked list example.................................
		
	       /* Linked List Declaration */
	       LinkedList<String> linkedlist = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);

	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	       /*This is how to get and set Values*/
	       Object firstvar = linkedlist.get(0);
	       System.out.println("First element: " +firstvar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);

	       /*Remove first and last element*/
	       linkedlist.removeFirst();
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	       /* Add to a Position and remove from a position*/
	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
	       System.out.println("Final Content: " +linkedlist); 	
		
		
		
			      
	}

}
