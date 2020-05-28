/*
Java LinkedHashSet class
Java HashSet class hierarchy
Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

The important points about Java LinkedHashSet class are:

Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operation and permits null elements.
Java LinkedHashSet class is non synchronized.
Java LinkedHashSet class maintains insertion order.



Hierarchy of LinkedHashSet class


Iterable 
Collection
Set
AbstractSet
HashSet
LinkedHashSet

public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable 

 
 
 
 */





package learning_CollectionFrameWork;



import java.util.Iterator;
import java.util.LinkedHashSet;

class Book 

{  
	
	
int id;  
String name,author,publisher;  
int quantity;  


public Book(int id, String name, String author, String publisher, int quantity) 

{  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
    
    
}  
}  



public class LinkedHashSetDemo

{

	public static void main(String[] args) 
	
	{
		
		
//		LinkedHashSet<String>  Lhs= new LinkedHashSet<String>();
//		
//		
//		Lhs.add("One");
//		Lhs.add("two");
//		Lhs.add("three");
//		Lhs.add("Four");
//		Lhs.add("Five");
//		
//		Iterator<String> i=Lhs.iterator();  
//        while(i.hasNext())  
//        {                                // observe the output here insertion order maintains
//        System.out.println(i.next());  
//        } 
		
	//...........................Java LinkedHashSet example ignoring duplicate Elements................
        
		
//		LinkedHashSet<String> al=new LinkedHashSet<String>();  
//		  al.add("Ravi");  
//		  al.add("Vijay");  
//		  al.add("Ravi");  
//		  al.add("Ajay");  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
		
		
		
		
	//........................Java LinkedHashSet Example: Book....................................
		
		
		LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    
	    //Adding Books to hash table  
	    
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);  
	    
	    
	    //Traversing hash table  
	    
	    
	    for(Book b:hs)
	    
	    {  
	    	
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
