package _01_selenium_july_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _0_first {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// System.out.println("pravin");
		
	}

}
