package _01_selenium_july_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_xpath_and_or {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//xpath by --> and <---
		WebElement name=driver.findElement(By.xpath("//input[@class=\"form-control\" and @id=\"name\"]"));
		name.sendKeys("pravin");
				
		//xpath by --> OR <--
		WebElement alt=driver.findElement(By.xpath("//button[@id=\"alertBtn\" or text()='Simple Alert' ]"));
		alt.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}

}
