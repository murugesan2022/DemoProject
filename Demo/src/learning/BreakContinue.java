package learning;

public class BreakContinue {

	public static void main(String[] args) {
		
		
		// ............... Continue demo.......... 
		
		
		/*
		 * for (int i = 1 ; i<= 10 ; i++) {
		 * 
		 * if( i ==6) { continue; }
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * 
		 * // in case of continue statement it will not break the look , it will only
		 * skip the statements on specific conditions , but after that // loop will
		 * continue.
		 * 
		 * }
		 * 
		 */
		
		
		//---------------Break Demo------------------------------
		
		
		
	// break will always break the loop. 
		
		for (int j =1 ; j <10 ; j++) {
			
			
			
			if( j==6) 
			
			{
				
				break;
			}
			
			
			System.out.println(j);
			
		}
		
		// here loop will break at j = 6 
		

}

}



