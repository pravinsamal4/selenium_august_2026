package _01_selenium_july_2026;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup_ArrayList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement signup=driver.findElement(By.xpath("//a[@class=\"text-light\"]"));
		signup.click();
		signup.click();
		signup.click();
		
		Set<String> add=driver.getWindowHandles();
		ArrayList<String > list=new ArrayList(add);
		
		 System.out.println(list.get(0));
		    System.out.println(list.get(1));
		    System.out.println(list.get(2));
		    System.out.println(list.get(3));
		    driver.switchTo().window(list.get(3));
		    WebElement mobile = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
	        mobile.sendKeys("4566");
	}

}
