package learning;


interface InterestRate1


    {
	
	//   public abstract void IR();  
	
	
	void IR();    // by default all methods of an interface are public and abstract so no need to write for interfaces. 
	
	
	
	
    }

class PnbBank1 implements InterestRate1

    // so in this case we can extend ABC ( another class ) 



{

	@Override
	public void IR() 
	
	{

            System.out.println("PNB IR");
		
	}
	
	
}

class HdfcBank1 implements InterestRate1

{

	@Override
	public void IR()
	
	{

          System.out.println("HDFC IR");
		
	}
	
	
	
}


               // we can create any class like bank..



class Bank1 


       {
	              
	           public void bank1_IR(InterestRate1 r)        
	           
	           
	           {
	        	   
	        	   r.IR();   
	        	   
	        	   
	           }
	           
	           
       }




public class InterfaceConcept

{

	public static void main(String[] args) 
	
	
	{
	
		
		

	}

}


/*
     
     some important points about an interface 
     
     1) In Interface we can not define any method other wise it will show error.
     2) by default all the methods of an interfaces are public and Abstract. 
     3) We can not create the object of an interface we can only create the reference of an interface. 
     4) We can implements multiple interfaces but not classes. 
     
     
     
 */
























