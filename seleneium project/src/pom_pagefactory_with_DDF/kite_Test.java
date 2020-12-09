package pom_pagefactory_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("\\D:\\Program\\DDF.xlsx\\");
		Sheet sh = WorkbookFactory.create(file).getSheet("ddf");
		
        System.setProperty("webdriver.chrome.driver","D:\\Anil\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		kitelogin1page login1=new kitelogin1page(driver);
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		
		login1.setkitelogin1pageUN(UN);
		String PWD=sh.getRow(0).getCell(1).getStringCellValue();
		login1.setKiteLogin1pagePWD(PWD);
        login1.clickkitelogin1pageLoginButton();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
        
        
        kitelogin2page login2=new kitelogin2page(driver);
        String pin=sh.getRow(1).getCell(0).getStringCellValue(); 
        login2.setkitelogin2pagepin(pin);
        login2.clickkitelogin2pageContinueButton();
        
        
        kiteHomePage home=new kiteHomePage(driver);
        home.verifykiteHomePageProfileName();
        
        Thread.sleep(2000);
	}

}
