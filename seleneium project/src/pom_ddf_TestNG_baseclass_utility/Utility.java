package pom_ddf_TestNG_baseclass_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	

		public static String getTestData(int row, int col) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Sept20.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("ddf");
			String value = sh.getRow(row).getCell(col).getStringCellValue();
			return value;
		}

		public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\sanjay\\eclipse-workspace\\jan20_Selenium\\Screenshots\\image_"+TCID+".jpg");
			FileHandler.copy(source, dest);
		}

	}


