package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify__data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:\\Program\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\anuuuu.html");
		
		String exp = "Sql";
		
	   List<WebElement> row = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
	   
	  int rowsize = row.size();
	  
	  for(int i=2;i<=rowsize;i++)
	  {
		     List<WebElement> col = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td"));
		     
		   int colsize = col.size();
		   
		  System.out.println(col);
		  
		  for(int j=1;j<=colsize;j++)
		  {
			 String act = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td[" + j +" ]")).getText();
			 
			System.out.println(act);
			
			if(act.equals(exp))
			{
				System.out.println("given element " +exp+"found at index");
			}
		  }
	  }
		
		              

	}

}
