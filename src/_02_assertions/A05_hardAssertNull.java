package _02_assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Assertion			Passes When			Fails When			Common Selenium Use

//assertNull()		Object is null		Object is not null	Check optional object/reference

//5. assertNull()
//String message = null;
//
//Assert.assertNull(message, "FAIL: Object is not null");
//
////If object is null → next line executes
////If object is not null → program stops here

public class A05_hardAssertNull {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement element = null;

		Assert.assertNull(element, "FAIL: Element is present");
	}
}
