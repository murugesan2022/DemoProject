package learning;

class ABC {
	
	public int add(int ...n) {    // so with the help of this we can add any number of variables here is n is array of variable of any numbers.
		
		int sum = 0;
		for (int i :n) {
			
			sum = sum+i;
		}
		
		return sum;
	}
}


public class VarragsDemo {

	public static void main(String[] args) {
		
		
		ABC obj = new ABC();
		
		System.out.println(obj.add(5, 4 , 7 ));    // so here we can add any number of variables.
		

	}

}
