
/*
 Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.




Methods of ArrayList class
In the above example we have used methods such as add() and remove(). However there are number of methods available which can be used directly using object of ArrayList class. Let’s discuss few important methods of ArrayList class.

1) add( Object o): This method adds an object o to the arraylist.

obj.add("hello");
This statement would add a string hello in the arraylist at last position.

2) add(int index, Object o): It adds the object o to the array list at the given index.

obj.add(2, "bye");
It will add the string bye to the 2nd index (3rd position as the array list starts with index 0) of array list.

3) remove(Object o): Removes the object o from the ArrayList.

obj.remove("Chaitanya");
This statement will remove the string “Chaitanya” from the ArrayList.

4) remove(int index): Removes element from a given index.

obj.remove(3);
It would remove the element of index 3 (4th element of the list – List starts with o).

5) set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.

obj.set(2, "Tom");
It would replace the 3rd element (index =2 is 3rd element) with the value Tom.

6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.

int pos = obj.indexOf("Tom");
This would give the index (position) of the string Tom in the list.

7) Object get(int index): It returns the object of list which is present at the specified index.

String str= obj.get(2);
Function get would return the string stored at 3rd position (index 2) and would be assigned to the string “str”. We have stored the returned value in string variable because in our example we have defined the ArrayList is of String type. If you are having integer array list then the returned value should be stored in an integer variable.

8) int size(): It gives the size of the ArrayList – Number of elements of the list.

int numberofitems = obj.size();
9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.

obj.contains("Steve");
It would return true if the string “Steve” is present in the list else we would get false.

10) clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.

obj.clear();
 
 */



package learning_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;


class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}

public class ArrayListDemo 

{

	public static void main(String[] args)
	
	{

      ArrayList<String> alist = new ArrayList<String>();
      
      
      // we can use the add function to add the elements to array list please look at the below concept. 
      
      alist.add("Shivam");
      alist.add("Rohit");
      alist.add("Mohit");
      
       //System.out.println(alist);  // displaying the elements of array list. 
       
       // adding more elements to array list 
       
       alist.add("Rajeev");
       alist.add("Sanjay");
       
       // display the latest updated array list
       
      // System.out.println(alist);
       
       
       // Add duplicate element in arrayList ( We can add the duplicates in an array list)
       
       alist.add("Sanjay");
      // System.out.println(alist);   
       
       
       //.............................................Iterating ArrayList......................................................
       
       // so we can use the for each loop to Iterate an Array List
//       for(String str:alist)  
//           System.out.println(str); 
      
       
       //..........................................Iterator use for get all the elements from the list....................................
       
       
       
       // First create an object of iterator ...
       
//       Iterator<String> itr  =alist.iterator();
//       
//       
//       while (itr.hasNext()) 
//       {
//    	   
//    	  String  str = itr.next();
//    	  
//    	  System.out.println(str);
//    	  
//    	  
//    	  // if we have to remove a item from the list...
//    	  
//    	  
//    	   if (str.contains("Rohit")) 
//    	   
//    	   {
//    		   
//    		   itr.remove();
//    	   }
//    	   
//    	   
//    	   
//       }
//       
//       System.out.println("After Remove" + alist);
       
       
       //.....................................User-defined class objects in Java ArrayList......................
       
       
       // Here we will used the constructor ( Student Constructor).....
       
       Student s1=new Student(101,"Sonoo",23);
       Student S2 = new Student(102, "Shivam",30);
       Student S3 = new Student(103,"Amit",32);
       
       ArrayList<Student> list3 = new ArrayList<Student>();
       
       list3.add(s1);
       list3.add(S2);
       list3.add(S3);
       
     //Getting Iterator  
       Iterator<Student> itr=list3.iterator();  
       //traversing elements of ArrayList object  
       
       while(itr.hasNext())
       
       {  
    	    Student st=(Student)itr.next();  
    	    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    	    
    	    
    	  } 
       
       //...............................Java ArrayList example of set() and get() method........................
       
       
       
       ArrayList<String> al=new ArrayList<String>();  
       al.add("Ravi");  //0  
       al.add("Vijay");  //  
       al.add("Ajay");  //2  
       System.out.println("Before update: "+al.get(1));   
       //Updating an element at specific position  
       al.set(1,"Gaurav");  
       System.out.println("After update: "+al.get(1)); 
       
       
       
       

	}
	
	
	
	

}
