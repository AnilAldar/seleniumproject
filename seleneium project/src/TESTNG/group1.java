package TESTNG;

import org.testng.annotations.Test;

public class group1 {
	
	
	@Test(groups= {"module1"})
	public void TC1()
	{
		System.out.println("Running TC1");
	}
	@Test(groups= {"module2"})
	public void TC2()
	{
		System.out.println("Running TC2");
	}
	@Test(groups= {"module1"})
	public void TC3()
	{
		System.out.println("Running TC3");
	}
	@Test(groups= {"module1"})
	public void TC4()
	{
		System.out.println("Running TC4");
	}
	
}
