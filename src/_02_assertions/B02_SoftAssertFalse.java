package _02_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class B02_SoftAssertFalse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
				
		WebElement disable=driver.findElement(By.xpath("//input[@value=\"Disable\"]"));
		disable.click();

		// Clicks the Disable button
		disable.click();

		// Finds the text field
		WebElement textFiled = driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]"));

		SoftAssert soft=new SoftAssert();

		// Checks whether the text field is disabled
		soft.assertFalse(textFiled.isEnabled(), "FAIL : text field available");

		// Reports the result
		soft.assertAll();

	}

}
