package learning;

public class FirstCode {

	public static void main(String[] args) {
		
		
		// concepts related to variable name. 
		
		int a = 10 ; // Allowed 
		int $abc = 20 ; // $ is also allowed for variable name we can use dollar as variable name
		int ab_ab = 30 ; // Underscore is also allowed for variable name. 
//		int 4a = 4 ; // this is not allowed we can not write the number at starting of the variable name but we can write a4 as variable name 
		int a4 = 100 ; // this is allowed 
        // int * 123 ; we can not use * in variable name.
		
		int _2 = 20 ; // this is allowed , we can write _ in the starting of variable name 
		int $23  = 90 ; // this is also allowed. 
		
		// whenever we have to create the variable name it should be logical , like number or num , sum , div etc. 
		
		
		
		System.out.println(a +" " + $abc + " "+ab_ab + " " + _2 );
		
		
		
		// Concept2 
		
		// once we defined the name of variable we can also change it's value at any phase 
		
		a = 30 ; // a was 10 at the starting so now we can change the value of a as 30 , 
		// so at any phase of programming we can change the value of variable. 
		
		
		
		// Size of varibales 
		
		int s = 20 ; // integer is of 4 byte or 32 Bit , - 2, 147,483,648 to 2 , 147, 483 , 647 
		
		// so we can assign any value between above range 
		
		// int k = 20000000000 ;  this assignment is not allowed because this is out of the range so we can not assign this number to any variable. 
		
		
		// we can not store the decimal value to integer type of variable it will show the error 
		
		//int m = 5.5 ; // this is not allowed because 5.5 is not integer
		
		
		float InterestRate1 = 4.2f  ; // 4 bytes  // we can not use 4.2 //
		
		double InterestRate= 5.5 ;   // 8 bytes
		
		short n = 3 ; // Size is 2 Bytes and 16 bits. 
		
		byte bb= 3; // size is 1 Byte or 8 bit. 
		
		long lo = 56l ; // 8 byte , supported very big number 
		
		
		
		
		

	}

}
