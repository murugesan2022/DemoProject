package learning;



 class Emp {
	
	 
	 int eid ; 
	// int i = 0 ;
	 int salary; 
	 static String ceo;  // we can make it as static variable then see the output this program. 
	 
	 // Remember to initialize the static variables in java we can use the static blocks 
	 
	 static {
		          ceo = "Rajeev";
		          System.out.println("In static");
	          }
	 
	 // Static blocks only execute once at the time loading of class. because ceo is same for all the employees so we have to mention this inside the static block.
	 
	 // here we can also create the constructor the class 
	 // we can not use the static reference to non static block
	 
	 
	 public Emp()   // to initialize the non static variables we can use the constructor because it is executed when we create the object. 
	 
	 {
         eid = 1 ; 
		 salary = 3000;
		 System.out.println("In Constructor");
		 
		 // ceo = "Mohit" -> we need not to write this line here because constructor will be called for all the objects
	 }
	 
	 
	 public void show() {
		 
		 System.out.println(eid + " " + salary +" "+ ceo );
	 }
		 
}

public class StaticDemo {

	int i ;   // this i here is non static variable.
	
	public static void main(String[] args) {

          Emp naveen = new Emp();
         // naveen.eid = 8 ; 
          //naveen.salary = 5000;
        // naveen.ceo = "Rohit" ;
          //naveen.show();
          
          
        //  i = 8;     This not possible because we are trying to access non static variable in static block.
        		
          Emp Rahul = new Emp();
         // Rahul.eid = 9;
         // Rahul.salary = 6000;
         // Emp.ceo = "Rohit" ;
          
          //Rahul.ceo= "Mohit"; // we can also use the class name to access the static variable.
          
          //Emp.ceo = "Rajeev" ;  // so here with the help of class name we can access the static variables in java. 
          Rahul.show();
          naveen.show();
         
          
          
   // ..........................................Static variables point to be remember-------------------------
          
          /*
           
           1) Static variables are same for all the objects.
           2) Non Static variables are different for all the objects. 
           3) Can not use non static variable in static block we have to make these are static variable.
           4) We can only access the static variable inside static block. 
           
           
         
           */
          
          
          
          
          
          
          
          

	}

}
