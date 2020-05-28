package learning;



/*
 * Inner Class 
 *   Member class 
 *   Static class 
 *   Anonymous class  
 * 
 * 
 */
class Outer   // Outer.Class file be created when we compile this code

{
	
	int a ;    // a class can have member variable
	
	public void show()   // a class can have member function.
	
	    {
		
		
	    }
	
	
	// so we can create class inside a class there would not be issue in this case. 
	
	class Inner     // a class can have member class     // Outer$Inner.class  This is the name of . class file for Inner class. 
	
	{
		public void display() 
		{
			
			System.out.println("in display");
		}
		
	}
	
}

public class InnerDemo 


{
	
	// Variable , method , class. So a class can have variables , methods and class
	
	

	public static void main(String[] args)
	
	
	
	{
		
		Outer obj =new Outer();
         obj.show();

         Outer.Inner obj1 = obj.new Inner();  
         
         // We can access the Inner class with the help of outer class. and to create the object we 
         // have to use obj.newInner(); , so only with the help of Outer class object we can access the Inner class object. 
         
         obj1.display();   // we can access the methods of inner class with the help of Inner class object. 
         
         
	}
	
	
	
	

}
