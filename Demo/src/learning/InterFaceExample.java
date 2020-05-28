/*
    Types of interfaces:->
    
    1) Normal Interface( More then one method deceleration we have in this type of interfaces) 
    2) SAM (Single Abstract Method) having only one Abstract method and from 1.8 known as functional interface -> Lambda Expression we can use 
    3) marker interface ( it does not have any method definition)
    4) From java 1.8 we can have methods in an interface with the help of default key word.
    5) Now we can have static methods also in interfaces.
    6) We can also create the variable inside interfaces but by default it would be final ( even if we are not using final key word for it).
     
     
     
 */



package learning;

@FunctionalInterface   // A functional interface can have only one method deceleration.
interface ABB

{
	void display();    // Functional interface can have one abstract method , it is as abstract method.
	//Void a();
	
//	default void Write()
//	
//	{
//		
//		System.out.println("Interface can have methods deceleration from java 1.8");
//	}
	
	
	static void Write()
	{
		
		
		System.out.println("Static methods can be possible in interface now");

	
	
    }


//class BBBB implements ABB
//
//{
//
//	@Override
//	public void display() 
//	
//	{
//		System.out.println("I am in display");
//		
//	}
//	
//	
//	
//}



public class InterFaceExample {

	public static void main(String[] args) 
	
	{
		
		// ABB obj = new ABB();    This is not possible because we can not create the object of an interface. ( Look at the anonymous class concept)
		
		// we can only create the reference of interface and object of class 
		
		
		//ABB obj = new  BBBB();
		
		//......................................................................
		
//		ABB obj = new ABB() {
//
//			@Override
//			public void display() 
//			
//			{
//				
//				System.out.println("I am in display ( This is an Anonymous class)");
//				
//			}
//			
//			
//		};
//		
//		obj.display();
		
  //..................................................Lambda Expression.........................................................................
		
		ABB obj = ()->System.out.println("I am in display ( This is an Anonymous class and Lambda Expression)"); // This is Lambda Expression
		
		// This is only possible with functional interfaces not possible interfaces having more then one methods. 
				
		
		
		obj.display();
	}
		

	}

}
