package learning;


 class cal1 {
	
	int num1 ;   // these blue color are instance variable directly after the class.
	int num2 ; // this number 2 is also instance variable directly after the class. 
	
	
	// now we have to create the constructor of the class cal1 
	
	public cal1() {   // this is constructor because name starts with the same name as of class.
		
		System.out.println("this is default constructor of java");
		
	}
	
	
	
}

public class Cal {

	public static void main(String[] args) {
		
		// Now we have to create the object of class cal1 
		
		cal1 obj = new cal1();
		
		
		 
		int a = 10 ; 
		int b = 20 ; 
		int c = a + b ;
		//System.out.println("Shivam Gulati");
		//System.out.println(c);

	}

}
