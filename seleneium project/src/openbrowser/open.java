package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Program\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				

	    
		// TODO Auto-generated method stub
		
	}

}
