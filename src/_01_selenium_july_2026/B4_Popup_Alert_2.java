package _01_selenium_july_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4_Popup_Alert_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement alert=driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		alert.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement alertB=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		alertB.click();
		
		Alert b=driver.switchTo().alert();
		b.dismiss();
		
		WebElement alertC=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		alertC.click();
		
		Alert c=driver.switchTo().alert();
		c.sendKeys("sa");
		c.accept();
		
	}

}
