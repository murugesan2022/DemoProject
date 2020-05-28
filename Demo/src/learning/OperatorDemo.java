package learning;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/*
		 1) Arithmetic Operator  + , - , *, / , % 
		 2) Bitwise 
		 3) Relational 
		 4) Logical 
		 */
		
		
		
		/*
		 * int a = 4 , b = 6 ; int k1 = a+ b ; int k2 = a-b ; int k3 = a*b; int k4 =
		 * b/a; double k5 = (double)b/a;
		 */
		  
		  
		  // If we will use double k5 = b/a ;
		  
		  
		//  then it will show the int value by default. so to get the proper value // we
		 //have to cast it.
		 
		//int k6 = b%a ; 
		
		
		// this will give me only reminder part. 
		
		
		/*
		 * System.out.println(k1); System.out.println(k2); System.out.println(k3);
		 * System.out.println(k4); System.out.println(k5); System.out.println(k6); // 2
		 */		 		
		//  ........................................................................................................
		
		int i = 7 ; 
		int j = 11; 
		
		/* i = i + j ; */
		
		i +=j;   // This short hand operator can also be used instead of i = i + j 
		
		System.out.println("the value of i is" +" " + i );
		
		j++ ; // j = j+1 , or j=+1 ; these all are same  , j ++ is also known as increment operator or in the same way we can use the decrement operator 
		// also.
		
		System.out.println(j);
		
		
		// Decrement operator 
		
		int l = 13; 
		l-- ;   // this is decrement operator , post decrement operator
		
		System.out.println(" l is " + " " + l);
		
		
		// Pre increment and post increment concepts
		
		int m = 5  ; 
		int n = 6; 
		
	   //   it is pre increment , so first n would become 6+1 = 7 and then it will assign to m 
		//	m = ++n;
		/*
		 * System.out.println(m); // 7 System.out.println(n); // 7
		 */		
		
		m=n++; // n++ is post increment first assign the value and then increase the value
		System.out.println(m);  //  6  because in post increment first it will assign the value to m.
		System.out.println(n);  //  7 after assigning the value it will increase the values of n. 
		
		
	}
	
	
}
