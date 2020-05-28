package learning;


class AA

{
	
	public void show() 
	{
		
		System.out.println("In A");
	}
}

class BB extends AA 

{
	@Override    // This is an annotation in java and this is used to avoid the logical errors 
	
	public void show()              // this is method overriding because we are overriding the method of class A. 
	
	// so in method overriding parent class method is override by child class method. 
	{
		super.show();  // with the help of super key work we can call the parent class methods / constructors and variables.
		
		System.out.println("In B");
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		
		BB obj = new BB();
		
		obj.show();                  // this will call the method of B because it has been override. 

	}

}
