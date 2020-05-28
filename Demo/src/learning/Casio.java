package learning;


// Programming basics 

// loops , if and else , Break and continue . 
// Java basics and concepts ( OOPS) , Interface , Abstraction , polymorphism , Constructors and encapsulation , exception handling , File handling 
// MAPA , SET , collections. 
// Programs ( even number and odd number , leap year , prime number concept , sorting of array 

// array concept  , string handling related programs 

// Selenium

// Basics : - X path , locators , handling different web elements , window switching , mouse hover, 
// Frame work designing. 

// for loospa , if and else conditions and break and continue , switch cases.

 class demo12 {
	
	 int a ;    // instance variable because these are inside the class 
	int b ;   // by default variable are non static and we have to the object 
	int num1 ;  // we have to use this key word to refer instance variables
	int num2 ; 
	
	
	
	// no return type for constructors and name should be same of class.
	
	public demo12( int num1 , int num2 ) {
		
		
		this.num1 = num1 ; 
		this.num2 = num2 ; 
		
		
	}
	 public demo12()
	 
	 
	 
	 {
		 
		 System.out.println(" we are inside constructor demo12");
		 
	 }
	 
	 public demo12( int i )
	 {
		 System.out.println(" we are in second constructor");
		 
	 }
	 
	 public demo12 ( double i , int j ) {
		 
		 System.out.println(i+j);
	 }
	 // Constructor overloading concept
	 
	 

	
}



 public class Casio {

	public static void main(String[] args) {
		
		// we have to new key word 
		demo12 obj = new demo12(); // this will call the default constructor
	   //demo12 obj1 = new demo12(1); 
	   // this will call second constructor 
	   demo12 obj2 = new demo12(11,22);
	 
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		
		//System.out.println("shivam gulati");

	}

}
 
 
 
 
 
 
 
 
 
 
 
