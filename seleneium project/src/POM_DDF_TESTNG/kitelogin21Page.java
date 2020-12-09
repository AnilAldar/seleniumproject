package POM_DDF_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin21Page {
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement cnt;
	
	kitelogin21Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		 
	public void setkitelogin2pagepin(String PIN) {
		pin.sendKeys(PIN);
		
		}
	public void clickkitelogin2pageContinueButton() {
		cnt.click();
	}

}
