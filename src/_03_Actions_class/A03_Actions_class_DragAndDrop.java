package _03_Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A03_Actions_class_DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement des=driver.findElement(By.xpath("//ol[@id=\"amt7\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des);
		
		act.perform();
	}

}
