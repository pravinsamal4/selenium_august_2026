package _01_selenium_july_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B7_iframe_Index_ID {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\practice_selenium\\exes\\july_2026\\chrome\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        // Click on "Iframe with in an Iframe"
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

        // Switch to outer frame
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[@src='MultipleFrames.html']")));

        // Switch to inner frame
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[@src='SingleFrame.html']")));

        // Enter text
        WebElement txt = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@type='text']")));

        txt.sendKeys("Samal");

        System.out.println("Text entered successfully.");

//        driver.quit();
    }
}