package Typs_of_framework;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF {

	public static void main(String[] args) {
		

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Sept20.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		// use to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		options.addArguments("--disable notifications--");
		System.setProperty("webdriver.chrome.driver","D:\\Program\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);

		// enter PWD
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);

		// click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();

		// enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);

		// click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();

		boolean result = driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		System.out.println(result);

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.close();

	}

}
