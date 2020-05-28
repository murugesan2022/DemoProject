package learning;
//....................................................


//class Bank
//
//{
//	
//	public void InterestRate(HdfcBank h)
//	
//	{
//		
//		h.InterestRate();
//	}
//
//
//}
//
//
//class HdfcBank
//
//
//{
//	public void InterestRate()
//	
//	{
//		
//		System.out.println("HDFC IR");
//	}
//	
//}
//
//
//class PnbBank
//
//{
//	
//	
//    public void InterestRate()
//	
//	{
//		System.out.println("PNB IR");
//		
//	}
//	
//}


//..............................................



abstract class InterestRate   


   {
	
	   public abstract  void IR() ;
	   
	 
	
   }


  class PnbBank extends InterestRate 
  
  // Java does not support multiple Inheritance , means we can not write class PnbBank extends InterestRate , Abc 
  
  // here Abc is another class. 
  
  
   {

	@Override
	public void IR()
	
	{


		System.out.println(" Interest Rate of PNB Bank");
		
		
	}
	
	
	
   }
  
  
  class HdfcBank  extends InterestRate
  
  
  {

	@Override
	public void IR() 
	
	
	{
		
		
        System.out.println(" Interest rate of HDFC Bank");

		
	}
	  
	  
  }
  
  
  class Bank 
  
  {
	  
	  public void BankRateOfInterest(InterestRate i)
	  
	  {
		  i.IR();
		  
	  }
	  
	  
  }
  
  
public class AbstractConcept 

{

	public static void main(String[] args)

	{
		
  //...................................................................................................
		
//		// Now we have to create the object of Bank to call the method of InterestRate of Bank 
//		
//	//	Bank b = new Bank();
//		
//		//HdfcBank h = new HdfcBank();
//		
//		//b.InterestRate(h); // It will call only Interest Rate of HDFC bank 
//		
//	//	PnbBank p = new PnbBank();
//		
//		//p.InterestRate(p);   This is not correct because if there is no any method that accept the PnbBank object as an argument.
		
		
     //.............................................................................................................
		
		// Now we can create the reference of super class here Bank and object of sub class ( Hdfc Bank or Pnb Bank) 
		
		
//		InterestRate b = new HdfcBank();  // reference of Abstract class and object of sub class concept
//		b.IR();
//		
//		InterestRate p = new PnbBank();    // reference of Abstract class and object of sub class concept
//		p.IR();
		
		
	//..............................................................................................................................
		
		
		
		
		
		}

}
