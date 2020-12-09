package POM_DDF_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin11page {
	//WebDriver driver
	
		//Declaration
		
		@FindBy(xpath="//input[@id='userid']")
		private WebElement UN;
	    
		@FindBy(xpath="//input[@id='password']")
		private WebElement PWD;
		
		@FindBy(xpath="//button[@type='submit']")
	    private WebElement Login;
		
		//Initialization
		public kitelogin11page(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		//Usage
		public void setkitelogin1pageUN(String username) {
			UN.sendKeys(username);
		}	
				
		public void setKiteLogin1pagePWD(String password) {
			PWD.sendKeys(password);
		}
		
		public void clickkitelogin1pageLoginButton() {
			Login.click();
			
		}
		

}
