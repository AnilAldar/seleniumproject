package pom_pagefactory_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {
	
	@FindBy(xpath="//span[text()='KV']")
	private WebElement PN;
	
	public kiteHomePage(WebDriver driver){
	PageFactory.initElements(driver, this);
	
	}
      public void verifykiteHomePageProfileName() {
    	  
    	  boolean result = PN.isDisplayed();
    	  System.out.println(result);
    	  if(result)
    	  {
    		  System.out.println("pass");
    	  }
    	  else
    	  {
    		  System.out.println("fail");
    	  }
      }
    	  
      }

