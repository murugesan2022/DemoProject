package learning;


class AAA{
	
	public void show() {
		
		System.out.println(" in AAA");
	}
	
}

class BBB  extends AAA

{
	
public void show()


  {
		
		System.out.println(" in BBB");
	

  }


public void display () {
	
	System.out.println(" In display");  // this is own method of class BBB not present in AAA
}


}


class CCC extends AAA 

{
	
	public void show()


	  {
			
			System.out.println(" in CCC");
		

	  }
	
}

public class RunTimePolyMorphism {

	public static void main(String[] args)
	
	
	{
		
		// Reference of AAA and object of BBB is possible in this case. 
		
		AAA obj = new BBB();   // in run time we are binding the AAA reference with object of BBB, this is also called the dynamic polymorphism. 
		
		obj.show();  // so this will call the BBB class method 
		
		// obj.display() is not possible because display() method is present only in BBB 
		
		
		// to call the display() method we have to create the BBB class reference and BBB class object 
		
		
		BBB obj1 = new BBB();
		
		obj1.display();
		
		
		AAA obj2 = new CCC();
		
		obj2.show(); //  this is CCC 
		
		
		
	}

}
