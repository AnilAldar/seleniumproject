package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample 
{
	  @BeforeMethod
	  public void openbrowser()
	   {
		   System.out.println("open browsre.....");
	   }
	  @BeforeClass
	  public void LoginToApp() {
		  System.out.println("Login to Appr....");
	  }
	  @Test
	  public void Tc2()
	  {
		  System.out.println("Running Tc2........");
	  }
	
	   @Test
       public void Tc1()
       {
    	   System.out.println("Running Tc1...");
       }
	   
	   @AfterMethod
	   public void logoutToApp()
	   {
		   System.out.println("Logout To App...");
	   }
	   
	   @AfterClass
	   public void closebrowser() {
		   
		   System.out.println("Close browser.........");
	 }
}

