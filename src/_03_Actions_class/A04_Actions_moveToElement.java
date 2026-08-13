package _03_Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A04_Actions_moveToElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		WebElement mouse=driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", mouse);
		
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		
	}

}
