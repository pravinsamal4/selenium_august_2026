package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_xpath_01 {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//xpath by attribute
		WebElement attribute=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		attribute.sendKeys("pravin");
		
		//xpath by text
		WebElement text=driver.findElement(By.xpath("//h1[text()='Register Account']"));
		System.out.println(text.isDisplayed());
		
		//xpath by contains
		WebElement contains=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		System.out.println(contains.isDisplayed());
	}

}
