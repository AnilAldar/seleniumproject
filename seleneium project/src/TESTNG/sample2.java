package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void TC5()
	{
		Reporter.log("Running ...",true);
	}
	@Test
	public void TC6()
	{
		Reporter.log("Running TC6 ...",true);
	}

}
