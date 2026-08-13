package _01_selenium_july_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class C08_hardAssertDemo_02 {
	public class C8_hardAssertDemo_00 {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			WebElement login=driver.findElement(By.xpath("//input[@value=\"Login\"]"));
			
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.elementToBeClickable(login));
			
			Assert.assertFalse(login.isEnabled(), "FAIL: Login button is not clickable");  //if it fall here it will not perform further click 

			login.click();
		}
		
	}

}
