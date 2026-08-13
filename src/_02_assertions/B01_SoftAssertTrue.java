package _02_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class B01_SoftAssertTrue {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");

        // Disable the text field
        WebElement disable = driver.findElement(By.id("disabled-button"));
        disable.click();

        // Locate disabled text field
        WebElement textField = driver.findElement(By.id("enabled-example-input"));

        SoftAssert soft = new SoftAssert();

        // This assertion fails because the text field is disabled.
        // However, execution continues.
        soft.assertTrue(textField.isEnabled(), "FAIL: Text field is not enabled");

        // This statement still executes even though the above assertion failed.
        WebElement secondText = driver.findElement(By.name("show-hide"));
        secondText.sendKeys("pravin");

        // Reports all SoftAssert failures and marks the test as failed.
        soft.assertAll();

        driver.quit();
    }
}