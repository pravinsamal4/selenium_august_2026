package _02_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A08_hardAssertFail {
	
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");

        try {
            WebElement element = driver.findElement(By.id("wrongId"));
            System.out.println("Element Found");
        } catch (Exception e) {
            Assert.fail("FAIL: Login element is not found.");
        }

        driver.quit();
    }
}
