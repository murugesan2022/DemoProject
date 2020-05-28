package learning;

// Is A and has A Relation. // Is A means inhabitance 

class Calculator{    // Super , Parent , Base
	
	public int add(int i , int j) {
		
		return i+j;
		
	}
	
}


// If we do not have the source code of above class , we have only . class file. and we want to add another function in this 

class CalAdv extends Calculator    // Sub , Child , Derived
{
	
//	public int add(int i , int j)
//	{
//		                                                 // we should not write the code again because this would be code redundancy
//		return i+j;                                      // This method will be inhabited by parent class
//		
//	}
	
	public int sub(int i , int j) {
		
		return i-j;
		
	}
	
	
}



public class InheritanceDemo {

	public static void main(String[] args) {
		
		
		//Calculator c1 = new Calculator();
		//System.out.println(c1.add(2, 3));
		
		CalAdv c2 = new CalAdv();
		int result1 = c2.add(3, 5);
		int result2 =c2.add(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
	}

		
	
}
