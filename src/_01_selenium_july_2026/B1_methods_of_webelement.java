package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_methods_of_webelement {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		//WebElement methods
		//isSelected --Returns true if the checkbox/radio is ticked/selected, otherwise false.
		WebElement op1 =driver.findElement(By.xpath("//input[@id=\"bmwradio\"]"));
		op1.click();
		System.out.println(op1.isSelected());
	
	
		//2. isDisplayed()
        //Checks if the element is enabled for interaction (not disabled).
		//Returns true if you can type/click on it, false if it has disabled attribute.
		WebElement op2=driver.findElement(By.xpath("//input[@value=\"Hide\"]"));
		op2.click();
		WebElement hide=driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
		System.out.println(hide.isDisplayed());
		
		// 3. isDisplayed()
				// Returns true if the element is visible on the webpage; otherwise false.
		
		WebElement op3=driver.findElement(By.xpath("//input[@id=\"disabled-button\"]"));
		op3.click();
		WebElement textfild=driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]"));
		System.out.println((textfild.isDisplayed()));
	}
}
