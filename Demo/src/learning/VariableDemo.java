package learning;

public class VariableDemo {

	public static void main(String[] args) {


	//	int a = 5.5 ;  this is not supported because integer can not contain the double variable we have to cast it 
		
		int a = (int)5.5;  // this is possible because it has type casted 
		
		double d = 5 ; // this is implicit casting ( Double can contain the integer value) 
		
		System.out.println(d);  // So this line will print the 5.0 because of type casting 
		
		
	System.out.println(a);
	
	
	
	// Naming convention in java 
	
	// Variable name it should be like sname , stock_price 
	
	// class name , String , Integer , Student , Worker , Engineer. 
	
	
	// Interface name , Runable , Serializable 
	
	
	// Interface : Adjective 
	// Class : Noun example Student , Person , Computer 
	// Method : Verb ( Action performed) run , print , write etc. 
	
// Variable name : stockprice , bankdetails 
	
	/*
	   1) For class and interface first letter should be capital
	   2) Java follow camel casing Rule ( MyFirstJavaClass) first word should be of Capital Letter whenever there is change 
	   of word. 
	   
	   
	   So for more understanding we have following 
	   
	   Variable: 
	   abc , Because all are in small letter 
	   
	   Constant 
	   ABC 
	   
	   Constructor 
	   Abc() // Capital A means it would be class and () means that it is constructor so we should remember this concept also 
	   
	  
	  method 
	  
	  abc() because abx all are in small and () it will indicate that this is method so we need to remember this concept. 
	  
	  
	  interface 
	  
	  Strachable  this must be an interface as this is advantage of knowing the naming convention in java 
	  and we should know all of these rules
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 * 
	 */
	
	
	}

}
