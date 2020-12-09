package multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_No_of_links_from_webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		      List<WebElement> links = driver.findElements(By.xpath("//a"));
		      
		      System.out.println(" no of links present in webpage is:"+links.size());

	}

}
