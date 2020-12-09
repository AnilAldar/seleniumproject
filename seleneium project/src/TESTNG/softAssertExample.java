package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertExample {
	@Test
	public void TC()
	{
		Reporter.log("Running TC");
		SoftAssert soft=new SoftAssert();
		String act="abc";
		String Exp="xyz";
		soft.assertEquals(act, Exp,"act and Exp results are mismatch");
		soft.assertEquals(act, Exp,"act and Exp results are mismatch");
	System.out.println("Executed both verifications");
	soft.assertAll();
	}

}
