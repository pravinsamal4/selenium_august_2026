package _01_selenium_july_2026;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B4_Popup_alert {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vinothqaacademy.com/alert-and-popup/");
			
			WebElement prompttext= driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]"));
			prompttext.click();
			

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.sendKeys("yes");
			System.out.println("Alert text: " + alert.getText());
			alert.accept();   // click OK

			
	}
}
