package POM_WITH_PAGEFACTORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page {
//	WebDriver driver;
	
	//Declaration
	
	 @ FindBy(xpath="//input[@id='userid']")
	 private WebElement UN;
	 
	 @ FindBy(xpath="//input[@id='pasward']")
	 private WebElement PWD;
	 
	 @ FindBy(xpath="//button[text()='login']")
	 private WebElement login;
	 
	 //Initailization
	 
	 kitelogin1page(WebDriver driver){
		 PageFactory.initElements(driver,this);
		 
	 }
	 //Usage
	 public void setkite1login1pageUN(){
		 UN.sendKeys("DV1510");
	 }
	 public void setkite1login1pagePWD(){
		 PWD.sendKeys("Vijay@123");
	 }
	 public void clickkitelogin1pageLoginButton() {
		 login.click();
	 }
}
