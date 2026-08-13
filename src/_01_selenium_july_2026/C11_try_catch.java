package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_try_catch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		WebElement hide=driver.findElement(By.xpath("//input[@value=\"Hide\"]"));
		hide.click();
		
		try{
			WebElement text=driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
			text.sendKeys("sassa");
		}
		catch(Exception e) {
			System.out.println("not present");
		}
	}

}
