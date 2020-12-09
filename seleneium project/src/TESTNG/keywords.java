package TESTNG;

import org.testng.annotations.Test;

public class keywords {
	
	//Incovations count
	//@Test(invocationCount=10)
	//public void TC()
	//{
	//	System.out.println("Running TC..............");
	//}
    //Priority
	//@Test(priority=2)
	//public void TC1()
	//{
	//	System.out.println("Running TC1......");
//	}
//	@Test
//	public void TC2()
//	{
	//	System.out.println("Running TC2......");
	//}
	//Enabled=false
	//   @Test
	//   public void TC1()
	 //  {
		// System.out.println("Running TC1......");  
	  // }
	//   @Test(enabled=false)
	 //  public void TC2()
	  // {
		 // System.out.println("Running TC2...."); 
         //}
	//Timmeout
	//@Test(timeOut=8000)
	//public void TC1() throws InterruptedException
	//{
		//Thread.sleep(6000);
		//System.out.println("Running Tc1............ ");
	//}
	//DependsOnMethod
	@Test(timeOut=5000)
	public void loginToApp() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("Running to loginToApp...");
		
	}
	  @Test(dependsOnMethods= {"loginToApp"})
	  public void verifyPN()
	  {
		System.out.println("Verify PN.............");  
	  }
	  
	   }
	   

