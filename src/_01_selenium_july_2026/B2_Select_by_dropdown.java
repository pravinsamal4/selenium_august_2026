package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B2_Select_by_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement car=driver.findElement(By.xpath("//select[@id=\"carselect\"]"));
		Select s=new Select(car);
		
		 //select by index
		s.selectByIndex(1);
		
		//select by visible Text
		s.selectByVisibleText("Honda");
		
		//select by value
		s.selectByValue("bmw");
	}

}
