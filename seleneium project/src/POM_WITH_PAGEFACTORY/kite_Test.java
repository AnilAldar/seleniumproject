package POM_WITH_PAGEFACTORY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		KiteLogin1Page login1 = new KiteLogin1Page(driver);
		login1.setKiteLogin1PageUN();
		login1.setKiteLogin1PagePWD();
		login1.clickKiteLogin1PageLoginButton();

		KiteLogin2Page login2 = new KiteLogin2Page(driver);
		login2.setKiteLogin2PagePin();
		login2.clickKiteLogin2PageContinueButton();

		KiteHomePage home = new KiteHomePage(driver);
		home.verifyKiteHomePageProfileName();

		Thread.sleep(2000);
		driver.close();
	}

	}


