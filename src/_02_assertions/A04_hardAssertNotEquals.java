package _02_assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//assertNotEquals()	Expected ≠ Actual		Values are same		Verify URL/text has changed

//4. assertNotEquals()
//String actualTitle = driver.getTitle();
//
//Assert.assertNotEquals(actualTitle, "Google", "FAIL: Unexpected title found");
//
////If titles are different → next line executes
////If titles are same → program stops here

public class A04_hardAssertNotEquals {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		String Actual=driver.getTitle();
		String Expected="Practice Page";
		
		Assert.assertNotEquals(Actual, Expected, "FAIL: Matching title found");

	}

}
