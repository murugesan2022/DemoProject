package learning;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		// so we have eight primitive data types in java 
		
		// int , float , short , long , boolean , char , double , byte
		
		int i = 10 ;   // This is primitive data type.
		
		// So for any primitive data type there is wrapper class for example Integer , Float ..are wrapper classes
		
		
		Integer obj = new Integer(5);  // This concept is known as boxing or wrapping
		
		int j =obj.intValue();  // This is known as unBoxing concept or unwrapping concept. 
		
	//	Integer I = new Integer(10);   
		
		Integer value = i;   // this is known as Auto boxing or auto wrapping concept in java.  becuase we are directly putting primitive in Integer wrapper class. 
		
		int k = value;  // This is auto unboxing
		
		System.out.println(j);
		
		// Converting String into the Integer 
		
		String str = "123";
		
		int n = Integer.parseInt(str); // so we can use this parseInt method to convert String into the integer value. 
		
		System.out.println(n);
		
		
		
		
		
	}

}
