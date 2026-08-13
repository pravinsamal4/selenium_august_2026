package _01_selenium_july_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ImplicitWaitDemo_01 {
	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
        		"D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");

	  	   	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	        driver.get("https://kite.zerodha.com/");

	        long startTime = System.currentTimeMillis();
	        
	          

	        try {
	            // Element that does NOT exist
	            driver.findElement(By.id("element_not_present"));
	        } catch (NoSuchElementException e) {
	            System.out.println("Element not found (as expected)");
	        }

	        long endTime = System.currentTimeMillis();

	        System.out.println("Implicit wait time: " + (endTime - startTime) + " ms");

//	        driver.quit();
	    
	

    }

}
