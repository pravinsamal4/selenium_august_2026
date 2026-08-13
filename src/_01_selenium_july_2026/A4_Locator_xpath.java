package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_xpath {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		a.sendKeys("pravin");
		
		WebElement b=driver.findElement(By.xpath("//legend[text()='Auto Suggest Example']"));
		System.out.println((b.isDisplayed()));

		////legend[text()='Switch Window Example']
		WebElement c=driver.findElement(By.xpath("//legend[contains(text(), 'Switch Window')]"));
		System.out.println(c.isDisplayed());
		
		WebElement d=driver.findElement(By.xpath("(//a[text()='Sign In'])[1]"));
		d.click();
	}
	
}
