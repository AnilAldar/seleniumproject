package pom_ddf_TestNG_baseclass_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHome1Page {
	@FindBy(xpath = "//span[text()='KV']")
	private WebElement PN;

	public kiteHome1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getKiteHomePageProfileName() {
		String act = PN.getText();
		return act;
	}

}


