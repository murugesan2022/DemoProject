
// A set refer to collection that can not contain duplicate elements. 
/*
 

Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.


some constructors of hash set:->


1)	HashSet()It is used to construct a default HashSet.
2)	HashSet(int capacity)	It is used to initialize the capacity of the hash set to the given integer value capacity. The capacity grows automatically as elements are added to the HashSet.
3)	HashSet(int capacity, float loadFactor)	It is used to initialize the capacity of the hash set to the given integer value capacity and the specified load factor.
4)	HashSet(Collection<? extends E> c)	It is used to initialize the hash set by using the elements of the collection c.

HashSet Methods:

1)boolean add(Element  e): It adds the element e to the list.
2)void clear(): It removes all the elements from the list.
3)Object clone(): This method returns a shallow copy of the HashSet.
4)boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has been found it returns true else false.
5)boolean isEmpty(): Returns true if there is no element present in the Set.
6)int size(): It gives the number of elements of a Set.
7)boolean(Object o): It removes the specified Object o from the Set.





 */

package learning_CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo

{

	public static void main(String[] args) 
	
	{

//     HashSet<String> hset = new HashSet<String>();
//     
//     
//  // Adding elements to the HashSet
//     
//     hset.add("Apple");
//     hset.add("Mango");
//     hset.add("Grapes");
//     hset.add("Orange");
//     hset.add("Fig");
//     
//     
//     System.out.println(hset); // [Apple, Grapes, Fig, Mango, Orange] this is output , observe that order is not maintained in set. 
//     
//   //Addition of duplicate elements
//     hset.add("Apple");
//     hset.add("Mango");
//     
//     System.out.println("After adding duplicate values");
//     System.out.println(hset);  //[Apple, Grapes, Fig, Mango, Orange]  same output , duplicates are not allowed in set
//     
//   //Addition of null values
//     hset.add(null);
//     hset.add(null);
//     
//     System.out.println("After adding null values");
//     
//     System.out.println(hset); //[null, Apple, Grapes, Fig, Mango, Orange], only one time null has been added in set. 
//
//     
//     // Iteration if hash set:
//     
//     Iterator itr = hset.iterator();
//     
//     System.out.println("Iteration of hasset.....");
//     
//     
//     while(itr.hasNext())
//     
//     {
//    	 
//    	 
//    	 Object str = itr.next();
//    	 
//    	 System.out.println(str);
//     }
     
     //...............................................Java HashSet example to remove elements-------------------
     
//     HashSet<String> set=new HashSet<String>();  
//     
//     set.add("Ravi");  
//     set.add("Vijay");  
//     set.add("Arun");  
//     set.add("Sumit");  
//     
//     System.out.println("An initial list of elements: "+set);  
//     //Removing specific element from HashSet  
//     
//     set.remove("Ravi");  
//     System.out.println("After invoking remove(object) method: "+set);  
//     
//     HashSet<String> set1=new HashSet<String>();  
//     set1.add("Ajay");  
//     set1.add("Gaurav");  
//     set.addAll(set1);  
//     System.out.println("Updated List: "+set); 
//     
//     //Removing all the new elements from HashSet  
//     set.removeAll(set1);  
//     System.out.println("After invoking removeAll() method: "+set);  
//     
//     //Removing elements on the basis of specified condition  
//     
//     set.removeIf(str->str.contains("Vijay"));   
//     System.out.println("After invoking removeIf() method: "+set);  
//     
//     //Removing all the elements available in the set  
//     set.clear();  
//     System.out.println("After invoking clear() method: "+set);  
     
     
     //......................................Java HashSet from another Collection...................................
     
     
     ArrayList<String> list=new ArrayList<String>();  
     
     list.add("Ravi");  
     list.add("Vijay");  
     list.add("Ajay");  
       
     HashSet<String> set2=new HashSet<String>(list);   // so we can convert list to hash set. 
     set2.add("Gaurav");  
     Iterator<String> i=set2.iterator();  
     while(i.hasNext())  
     {  
     System.out.println(i.next());  
     }  

	}

}
