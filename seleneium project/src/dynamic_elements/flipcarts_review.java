package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcarts_review {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	   WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	   Thread.sleep(3000);
	   if(closebutton.isDisplayed())
	   {
		   closebutton.click();
	   }
	   driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
		.sendKeys("red mi note 6 pro");

driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
Thread.sleep(3000);

String reviews = driver.findElement(By.xpath("((//span[@class='_38sUEc'])[1]/span/span)[3]"))
		.getText();

System.out.println(reviews);

	}

}
