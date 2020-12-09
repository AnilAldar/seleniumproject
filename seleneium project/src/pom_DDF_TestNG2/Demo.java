package pom_DDF_TestNG2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@BeforeClass
	public void openBrowser() {
		System.out.println("testing broser open");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("testing before class");
	} 
	
	@Test
	public void TC1() {
		System.out.println("testing");
	}

}
