
/*
    A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

     A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
     
     
     Class	                                    Description
     
HashMap	HashMap            is the implementation of Map, but it doesn't maintain any order.
LinkedHashMap	           LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
TreeMap	                   TreeMap is the implementation of Map and SortedMap. It maintains ascending order.



//................................................Methods 
 
 
 
 Method	                                                                Description
 
 
V put(Object key, Object value)	                                    It is used to insert an entry in the map.

void putAll(Map map)	                                            It is used to insert the specified map in the map.

V putIfAbsent(K key, V value)	                                    It inserts the specified value with the specified key in the map only if it is not already specified.
V remove(Object key)	                                            It is used to delete an entry for the specified key.
boolean remove(Object key, Object value)	                        It removes the specified values with the associated specified keys from the map.
Set keySet()	                                                    It returns the Set view containing all the keys.
Set<Map.Entry<K,V>> entrySet()	                                    It returns the Set view containing all the keys and values.
void clear()	                                                    It is used to reset the map.
V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.
V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
boolean containsValue(Object value)	This method returns true if some value equal to the value exists within the map, else return false.
boolean containsKey(Object key)	This method returns true if some key equal to the key exists within the map, else return false.
boolean equals(Object o)	It is used to compare the specified Object with the Map.
void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
V get(Object key)	This method returns the object that contains the value associated with the key.
V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
int hashCode()	It returns the hash code value for the Map
boolean isEmpty()	This method returns true if the map is empty; returns false if it contains at least one key.
V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
V replace(K key, V value)	It replaces the specified value for a specified key.
boolean replace(K key, V oldValue, V newValue)	It replaces the old value with the new value for a specified key.
void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.


Collection values()	It returns a collection view of the values contained in the map.


int size()	  This method returns the number of entries in the map.


   //..........................................................................
    
    Java HashMap class implements the map interface by using a hash table. It inherits AbstractMap class and implements Map interface.

Points to remember

Java HashMap class contains values based on the key.
Java HashMap class contains only unique keys.
Java HashMap class may have one null key and multiple null values.
Java HashMap class is non synchronized.
Java HashMap class maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
    
    
    

 */



package learning_CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



class Book1 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book1(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
} 

public class MapDemo 



{

	public static void main(String[] args)

	{
		
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put( 1 ,  "Amit");
//		map.put( 2 ,  "Rohit");
//		map.put( 3 ,  "Sahit");
//		
//		// Adding duplicate value to this map 
//		
//		map.put(4, "Rohit");
//		
//		System.out.println(map);   //{1=Amit, 2=Rohit, 3=Sahit, 4=Rohit}  
//		
//		//Traversing Map  
//		
//	    Set set=map.entrySet();//Converting to Set so that we can traverse  
//		
//	    System.out.println("Set view");
//		System.out.println(set);
//		
//		Iterator itr = set.iterator();
//		
//		System.out.println("Iteration of map");
//		while(itr.hasNext()) {
//			
//			
//			Map.Entry entry = (Map.Entry)itr.next();
//			
//			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
			
			// .....................................Example2......................................................
			
//			Map<Integer , String>  mapExp2 = new HashMap<Integer, String>();
//			
//			mapExp2.put(101, "Shivam");
//			mapExp2.put(102, "Rohit");
//			mapExp2.put(103, "Rohit");
//			mapExp2.put(103, "Mohit");
//			mapExp2.put(103, "RajeshKumar");
//			
//			System.out.println(mapExp2);
//			
//			System.out.println("With the help of for each loop");
//			
//			
//			for(Map.Entry m : mapExp2.entrySet())
//			
//			{
//				System.out.println(m.getKey() +" " + m.getValue());
//				
//			}
			
	
		
		//................................Java HashMap example to remove() elements...............................
		
		
//		HashMap<Integer,String> map=new HashMap<Integer,String>();          
//	      map.put(100,"Amit");    
//	      map.put(101,"Vijay");    
//	      map.put(102,"Rahul");  
//	      map.put(103, "Gaurav");  
//	    System.out.println("Initial list of elements: "+map);  
//	    //key-based removal  
//	    map.remove(100);  
//	    System.out.println("Updated list of elements: "+map);  
//	    //value-based removal  
//	    map.remove(101);  
//	    System.out.println("Updated list of elements: "+map);  
//	    //key-value pair based removal  
//	    map.remove(102, "Rahul");  
//	    System.out.println("Updated list of elements: "+map); 
		
		
		
		//.................................................Java HashMap example to replace() elements
		
//		   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
//		      hm.put(100,"Amit");    
//		      hm.put(101,"Vijay");    
//		      hm.put(102,"Rahul");   
//		      System.out.println("Initial list of elements:");  
//		     for(Map.Entry m:hm.entrySet())  
//		     {  
//		        System.out.println(m.getKey()+" "+m.getValue());   
//		     }  
//		     System.out.println("Updated list of elements:");  
//		     hm.replace(102, "Gaurav");  
//		     for(Map.Entry m:hm.entrySet())  
//		     {  
//		        System.out.println(m.getKey()+" "+m.getValue());   
//		     }  
//		     System.out.println("Updated list of elements:");  
//		     hm.replace(101, "Vijay", "Ravi");  
//		     for(Map.Entry m:hm.entrySet())  
//		     {  
//		        System.out.println(m.getKey()+" "+m.getValue());   
//		     }   
//		     System.out.println("Updated list of elements:");  
//		     hm.replaceAll((k,v) -> "Ajay");  
//		     for(Map.Entry m:hm.entrySet())  
//		     {  
//		        System.out.println(m.getKey()+" "+m.getValue());   
//		     }  
		
		
		//..................Java HashMap Example: Book..........................
		
		
		
	    //Creating map of Books    
	    Map<Integer,Book1> map=new HashMap<Integer,Book1>();    
	    //Creating Books    
	    Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Book1> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book1 b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    } 
		
		
			
			
		}
	}


