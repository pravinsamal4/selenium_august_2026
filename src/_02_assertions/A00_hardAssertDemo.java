package _02_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A00_hardAssertDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
	
		//1. assertTrue()	
		//Assert.assertTrue(login.isEnabled(), "FAIL: Login button is not enabled");
		////If assertion passes → login.click() executes
		////If assertion fails → program stops here, login.click() will not execute
		//login.click();
		WebElement input=driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]"));
		Assert.assertTrue(input.isEnabled(), "Fail : input filed is disabled");
		input.sendKeys("pravin");
	}
	
}
