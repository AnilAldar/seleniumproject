package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();  
         driver.get("https://www.facebook.com");
	}

}
