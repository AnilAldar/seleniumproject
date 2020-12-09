package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class position_if_search_element {

	public static void main(String[] args, String act) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
			
        
       
        
     //   List<WebElement> allElement = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));

   //     System.out.println(allElement.size());
        

	
		
	//	for(int i=0;i<=allElement.size()-1;i++)
	//	{
     
    //
            //   String act1= allElement.get(i).getText();

      //  if(act1.equals(exp)) {
	   
	//	System.out.print("given element"+ exp +"found at position:" +(i+1));
	   // break;
//}
	}
}
