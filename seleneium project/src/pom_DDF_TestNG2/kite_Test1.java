package pom_DDF_TestNG2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kite_Test1 {
	WebDriver driver;
	Sheet sh;
	kitelogin11page login11;
	kitelogin21Page login21;
	kiteHome1page home1;
	
	@BeforeClass
	public void openbrowser()throws EncryptedDocumentException, IOException, InterruptedException {
			
			FileInputStream file=new FileInputStream("D:\\Program\\DDF.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("ddf");
			
	        System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
			driver.manage().window().maximize();
			
			login11=new kitelogin11page(driver);
			login21=new kitelogin21Page(driver);
			home1=new kiteHome1page(driver);

	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		login11.setkitelogin1pageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login11.setKiteLogin1pagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		login11.clickkitelogin1pageLoginButton();
		
		login21.setkitelogin2pagepin(sh.getRow(1).getCell(0).getStringCellValue());
		login21.clickkitelogin2pageContinueButton();

	}

	
	@Test
	public void verifyPN()
	{
		home1.verifykiteHomePageProfileName();
	}
	@AfterMethod
	public void logoutFromApp()
	{
		
	}
	@AfterClass
	public void closebrowser()
	{
	login11=null;
	login21=null;
	home1=null;
	driver.close();

	}

}   
