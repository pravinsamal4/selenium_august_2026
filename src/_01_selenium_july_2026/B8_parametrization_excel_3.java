package _01_selenium_july_2026;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_parametrization_excel_3 {
	
	public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\practice_selenium\\02_selenium_july_2026\\Selenium_parametrization(excel)\\data.xlsx");
	String value=	WorkbookFactory.create(file).getSheet("sh").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		username.sendKeys(B8_parametrization_excel_3.getdata(0, 1));
		password.sendKeys(B8_parametrization_excel_3.getdata(1, 1));
		
	}

}
