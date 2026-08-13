package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_isEnabled {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("disabled-button")).click();
		
		WebElement enable=driver.findElement(By.xpath("(//input[@class=\"inputs\"])[1]"));
		boolean show=enable.isEnabled();
		System.out.println(show);
	}

}
