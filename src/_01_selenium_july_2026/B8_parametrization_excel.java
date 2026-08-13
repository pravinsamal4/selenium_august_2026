package _01_selenium_july_2026;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_parametrization_excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/login");
		
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		
		FileInputStream file=new FileInputStream("D:\\practice_selenium\\02_selenium_july_2026\\Selenium_parametrization(excel)\\data.xlsx");
		
		String a=WorkbookFactory.create(file).getSheet("sh").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(a);
		username.sendKeys(a);
	}

}
