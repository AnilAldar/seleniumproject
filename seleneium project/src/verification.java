import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class verification {
	
	//assertEquals
	//@Test
	//public void TC()
//	{
	//	Reporter.log("Running TC");
	//	String act="abc";
	//	String Exp="abc";
	//	Assert.assertEquals(act,Exp,"actual and expected results are mismatch");
	//}
	//assertNotEquals
	//@Test
	//public void TC()
	//{
		//Reporter.log("Running TC");
		//String act="abc";
		//String Exp="xyz";
	//	Assert.assertNotEquals(act,Exp,"actual and expected results are same");
		
	//}
	//assertTrue
	//@Test
	//public void TC()
	//{
		//Reporter.log("running TC");
	//	boolean result = true;
		//Assert.assertTrue(result,"result is fail");
	//}
	//assertFalse
	//@Test
	//public void TC()
	//{
	//	Reporter.log("Running TC");
	//	boolean result = true;
	//	Assert.assertFalse(result, "condition is True");
	//}
	//assertNULL
	//@Test
	//public void TC()
	//{
		//Reporter.log("Running TC");
		//String str=null;
		//Assert.assertNull(str, "component is not null");
	//}
	//assertNOTNull
	//@Test
	//public void TC()
	//{
//		Reporter.log("Running TC");
		//String str="abc";
		//Assert.assertNull(str, "component is null");
	//}
	//Fail
	@Test
	public void TC()
	{
		Reporter.log("Running TC");
		
		Assert.fail();
	}

}
