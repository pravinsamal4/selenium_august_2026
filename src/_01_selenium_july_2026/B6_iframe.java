package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_iframe {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//iframe by webelement 
//		WebElement frame=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
//		driver.switchTo().frame(frame);
//		
//		WebElement text=driver.findElement(By.xpath("//input[@type=\"text\"]"));
//		text.sendKeys("samal");
		
		//iframe by index
//		driver.switchTo().frame(0);
//		WebElement text=driver.findElement(By.xpath("//input[@type=\"text\"]"));
//		text.sendKeys("samal");
		
		
		//iframe by id value --> paste direct value of id in frame()method
		driver.switchTo().frame("singleframe");
		WebElement text=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		text.sendKeys("samal");
		
		
	}

}
