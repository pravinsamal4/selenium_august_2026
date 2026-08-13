package _01_selenium_july_2026;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_parametrization_excel_2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		FileInputStream file=new FileInputStream("D:\\\\practice_selenium\\\\02_selenium_july_2026\\\\Selenium_parametrization(excel)\\\\data.xlsx");
		
		
//		✅ WorkbookFactory.create() is called only once.
//		✅ The same Workbook object is reused.
		Workbook work=WorkbookFactory.create(file);
		
		String u=work.getSheet("sh").getRow(0).getCell(1).getStringCellValue();
		String p=work.getSheet("sh").getRow(1).getCell(1).getStringCellValue();
		
		username.sendKeys(u);
		password.sendKeys(p);
		 System.out.println("success");	
			work.close();
	        file.close();
	        driver.quit();
	}

}
