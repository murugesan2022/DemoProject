package learning;



class A

{
	
	
    public A() 
    
    {
	 
    	System.out.println("in A");
	
    }
    
    public A(int i ) 
    
    {
    	
    	System.out.println("in A int");
    }
  
	
}

class B extends A 

{
	
	             public B() 
	             
	             {
	            	 super();
	            	 System.out.println("In B");
	             }
	             
	             public B(int i ) 
	             
	             { 
	            	 super(i);     // this will call the parameterized constructor of parent class
	             	System.out.println("in B int");
	             }
	
	
}

public class SuperDemo

{

	public static void main(String[] args) 
	
	{
		
		//A obj = new A();
		
		B obj2 = new B(5);
		
		

	}

}


// java does not support the multiple inhabitance concept. It only supports multilevel inheritance. 










