package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class C08_hardAssertDemo_01 {
	public static void main (String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement filed= driver.findElement(By.xpath("//input[@id=\"disabled-button\"]"));
		filed.click();
		WebElement textTab=driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]"));
//		Assert.assertTrue(textTab.isEnabled());
		Assert.assertTrue(textTab.isEnabled(), "FAIL: textTab button is not clickable");

		}

}
