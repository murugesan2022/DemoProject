package learning;

public class ArrayDemo 

{

	public static void main(String[] args)
	
	
	{
		/*
		 * int nums[] = new int[4]; // this line will create an array of size 4
		 * 
		 * // int nums[] = { 1 , 12 , 34 , 45 } ; this is second way of declaring and
		 * initializing the array.
		 * 
		 * nums[0] = 1 ; nums[1] = 12; nums[2]=34; nums[3] = 45 ; // nums[4] = 45; when
		 * we include this line and then run our program then it will give run time
		 * exception , index out of bound exception.
		 * 
		 * // System.out.println(nums[3]);
		 * 
		 * // nums[2] = 36 ; so we can change any value at any time because all these
		 * are variables.
		 * 
		 * 
		 * // to print all the values in array we can use loop for ( int i = 0 ; i<4 ;
		 * i++) {
		 * 
		 * System.out.println(nums[i]); }
		 */
	    
	    
//...................Two dimensional array........................................	    
		
		
//		int a[] = { 1 , 2, 3 , 4 };
//		int b[] = { 2 , 4, 6, 8  }; 
//		int c[] = {5 , 6, 7, 8 };
//		
//		// these are three different arrays 
//		
//		int d[][] = {
//				
//				
//				{ 1 , 2, 3 , 4 },
//				
//				{ 2 , 4, 6 },          // These type of array are called the bagged array where size of each element is vary. 
//				
//				{5 , 6, 7, 8 }
//				
//		};
//		
	
		//System.out.println(d[0][1]);
		
		
		
		// ...............to print all the elements we can use the inner and outer for loops ...................
		
		
		
		
//		for ( int i = 0 ; i<d.length ; i++) 
//		
//		{
//			
//			for ( int j =0 ; j<d[i].length ; j++)  
//			
//			{
//				
//				System.out.print(" " +d[i][j]);
//			}
//			
//			System.out.println();
//			
//		}
		
		
	// ...............Two dimension array with the help of enhance for loop...............
		
		
//		for (int k[] : d) {      // so this d is itself array of array so we can put it into k[]
//			
//			
//			for(int l : k) {
//				
//				System.out.print(" "+ l);
//			}
//			 
//			System.out.println();
//		}
//		
	
		
	// .........................Enhanced for loop-----------------------------------------
		
		
	int e[] = { 1 , 2,  3 ,4 };
	
	
		
//		for ( int i =0 ; i <4 ; i++) {
//			
//			System.out.println(a[i]);
//		}
//		
		
		// with the help of for each loop 
		
//		for (int k:e) {
//			
//			System.out.println(k);
//			
//		}
		
		
		
		
		
		
		
		
		

	}

}
