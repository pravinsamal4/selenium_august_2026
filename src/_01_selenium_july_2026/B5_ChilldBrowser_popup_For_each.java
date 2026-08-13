package _01_selenium_july_2026;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup_For_each {	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		String parent=driver.getWindowHandle();
		WebElement tab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		tab.click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String all: allwindows) {
			if(!all.equals(parent)) {
				driver.switchTo().window(all);

    	        System.out.println("Title: " + driver.getTitle());
    	        System.out.println("URL: " + driver.getCurrentUrl());
    	        driver.manage().window().maximize();
			}
		}
		
		}
	
	

}
