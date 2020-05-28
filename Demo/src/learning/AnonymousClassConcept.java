
// If we do not want to reuse the class then we can go for the Anonymous class this is the class without name and created at the time of 
// object creation. and with the help of anonymous class concept we can create the object the interface and abstract classes.



package learning;

class X 
{
	
	public void show()
	
	{
		
		System.out.println("Hello Java in X");
	}
	
}



//class Y extends X
//
//{
//	
//	
//public void show() 
//
//{
//		
//		System.out.println("Hello Java in Y");
//	}
//	
//}



public class AnonymousClassConcept 



{

	public static void main(String[] args) 
	
	
	
	{
		
		
		X obj = new X()           // This is the concept of Anonymous class we can do the method overriding in Anonymous class as below.
		
		{
			
			public void show() 
			{
				
				System.out.println("Hello Java in Y");
			}
			
		};
		
		obj.show();   // This will call the overridden method of show " Hello Java in Y"
		
	// This class is created at the time of object creation and this class does not have any name. this is used we have override the method only once. 
		
		
		

	}
	
	
	
	

}
