package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//act.dragAndDrop(source, dest).perform();
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();

	}

}
