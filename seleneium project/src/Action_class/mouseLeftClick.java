package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseLeftClick {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Thread.sleep(3000);

		if (closeButton.isDisplayed()) {
			closeButton.click();
		}

		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("\"//a[@class='_3Ep39l']"));

		Actions act = new Actions(driver);
//approach-1
		//act.moveToElement(login).click().build().perform();
		//Thread.sleep(3000);
		
		//act.click().perform();
		
		
//approach-2
		//act.moveToElement(login).click().build().perform();
		
		
//approach-3
		act.click(login).perform();
		
		
	}

}
