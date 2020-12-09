package TESTNG;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertExample {
	//Hard Assert by using Assert class
	@Test
	public void TC()
	{
	Reporter.log("running TC");
	String str="abc";

Assert.assertNotNull(str,"component is null");
Assert.assertNull(str,"component is null");
Assert.assertNotNull(str,"component is null");

	}

}
