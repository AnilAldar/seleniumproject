package TESTNG;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutedOnlyFailedTC1 {
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4");
	}
    @Test
    public void TC5()
    {
    	Reporter.log("Running TC5");
    }
    @Test
    public void TC6()
    {
    	Assert.fail();
    	Reporter.log("Running TC6");
    }

}
