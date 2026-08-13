package _02_assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Assertion			Passes When			Fails When			Common Selenium Use

//assertEquals()	Expected = Actual	Values differ		Verify title, URL, text

//3. assertEquals()
//String actualTitle = driver.getTitle();
//String expectedTitle = "Facebook";
//
//Assert.assertEquals(actualTitle, expectedTitle, "FAIL: Title does not match");
//
////If titles are equal → next line executes
////If titles are not equal → program stops here

public class A03_hardAssertEquals {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		String ActualTitle=driver.getTitle();
		String execptedTitle="Practice Page";
		
		Assert.assertEquals(ActualTitle, execptedTitle, "FAIL: Unexpected title found");
		
	}

}
