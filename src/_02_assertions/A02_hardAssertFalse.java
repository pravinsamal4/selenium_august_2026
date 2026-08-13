package _02_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Assertion			Passes When			Fails When			Common Selenium Use

//assertFalse()		Condition is false	Condition is true	Element hidden, field disabled

//2. assertFalse()
//Assert.assertFalse(login.isEnabled(), "FAIL: Login button is clickable");
//
////If assertion passes (button is disabled) → login.click() executes
////If assertion fails (button is enabled) → program stops here, login.click() will not execute
//
//login.click();

public class A02_hardAssertFalse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		
		WebElement disable=driver.findElement(By.xpath("//input[@value=\"Disable\"]"));
		disable.click();
		
		WebElement textFiled=driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]"));
		Assert.assertFalse(textFiled.isEnabled(), "FAIL : text filed  available");
	}

}
