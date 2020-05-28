package learning;

public class IterationDemo {

	public static void main(String[] args) {
		
		// while , do while , for , for-each
		
		/*
		 * while( true) {
		 * 
		 * System.out.println("Hello"); }        
		 * 
		 *  this is infinite loop because there is not any condition is mention to stop the loop execution.
		 *  
		 */
		
		//............................................................................................
		
		/*
		 * int i = 4 ;
		 * 
		 * while ( i<6) {
		 * 
		 * System.out.println(i); i++; }
		 */
		
		
		
		// ............................................do while loop..................
		
		
		/*
		 * int i = 13 ; do { System.out.println(i); i++;
		 * 
		 * } while ( i<12);          // do while loop would be executed at least once even our condition is false. 
		 */
		
		
	//.................................for loop.................................................
		
		// when we know the starting point and ending point in that case we can use the for loop. 
		
		/*
		 * for ( int j = 1 ;j<=5 ; j++) {
		 * 
		 * System.out.println(j); }
		 */
		
			// for each loop is special type of loop made for array , once we will be doing array or collection then we can discuss this loop.
		
		
		
//  ...................................Nested loop............................................................
		
		/*
		 
		 # # # # #      1 2 3 4 5 
		  
		 # # # # #      1 2 3 4 5       (this is second pattern we can also try for this pattern.) 
		  
		 # # # # #      1 2 3 4 5 
		 
		 
       we have to print above pattern with the help of for loop ( or Nested for loop) 
		 */
		
		
		/*
		 * for ( int i =1 ; i<=3; i++) {
		 * 
		 * for( int j = 1 ; j<=5;j++) { System.out.print(" #"); }
		 * 
		 * System.out.println(); }
		 */
		
		
		
//.........................Assignments......................................................................................
		
		
		/*
		 first pattern                          second pattern                              Third pattern 
		                                                                                  
		 
		 1                                        A                                          # # # # 
		 1 2                                      A B                                        #     #
		 1 2 3 4                                  A B C                                      #     #
		 1 2 3 4 5                                                                           # # # #
		 
		 
		 */
			
		
	}

}
