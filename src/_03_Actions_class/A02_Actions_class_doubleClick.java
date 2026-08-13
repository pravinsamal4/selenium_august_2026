package _03_Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A02_Actions_class_doubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick);
		act.perform();
		
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
