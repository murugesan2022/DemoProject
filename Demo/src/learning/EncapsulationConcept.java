package learning;



// Encapsulation is basically binding the data with methods.
class Emp1

     {
	     private int Eid ;
	     private String Name ;
	      
	      // Only way to access the method should with the help of getter and setter methods 
	      
	      public void Set(int e) 
	      
	      {
	    	  Eid = e;
	    	  
	      }
	      
	      
	      public int getEid() {
	    	  
	    	  return Eid;
	      }


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}
	
     }

public class EncapsulationConcept 

{

	public static void main(String[] args) 
	
	{
		
		Emp1 obj1 = new Emp1();
		
		obj1.Set(3);
		System.out.println(obj1.getEid());
		obj1.setName("Shivam");
		
		System.out.println(obj1.getName());

	}

}
