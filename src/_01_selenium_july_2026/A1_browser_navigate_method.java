package _01_selenium_july_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_browser_navigate_method {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
