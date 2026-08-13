package _01_selenium_july_2026;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup_iterator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		WebElement signup=driver.findElement(By.xpath("//a[@class=\"text-light\"]"));
		signup.click();
		
		Set<String > add=driver.getWindowHandles();
		Iterator<String> i=add.iterator();
	
		while(i.hasNext()) {
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
			String e=driver.getTitle();
			String a="Open a free demat and trading account online at Zerodha";
			
			if(e.equals(a)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("1235");
			}
		}
	}

}
