package _01_selenium_july_2026;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//Assertion			Passes When			Fails When			Common Selenium Use

//assertTrue()		Condition is true	Condition is false	Button enabled, element displayed
//assertFalse()		Condition is false	Condition is true	Element hidden, field disabled
//assertEquals()	Expected = Actual	Values differ		Verify title, URL, text
//assertNotEquals()	Expected ≠ Actual		Values are same		Verify URL/text has changed
//assertNull()		Object is null		Object is not null	Check optional object/reference
//assertNotNull()	Object is not null	Object is null		Verify driver or element reference exists
//fail()			Never passes		Always fails		Intentionally stop a test with a failure message

//1. assertTrue()	
//Assert.assertTrue(login.isEnabled(), "FAIL: Login button is not enabled");
//
////If assertion passes → login.click() executes
////If assertion fails → program stops here, login.click() will not execute
//
//login.click();	

//2. assertFalse()
//Assert.assertFalse(login.isEnabled(), "FAIL: Login button is clickable");
//
//// If assertion passes (button is disabled) → login.click() executes
//// If assertion fails (button is enabled) → program stops here, login.click() will not execute
//
//login.click();

//3. assertEquals()
//String actualTitle = driver.getTitle();
//String expectedTitle = "Facebook";
//
//Assert.assertEquals(actualTitle, expectedTitle, "FAIL: Title does not match");
//
//// If titles are equal → next line executes
//// If titles are not equal → program stops here

//4. assertNotEquals()
//String actualTitle = driver.getTitle();
//
//Assert.assertNotEquals(actualTitle, "Google", "FAIL: Unexpected title found");
//
//// If titles are different → next line executes
//// If titles are same → program stops here

//5. assertNull()
//String message = null;
//
//Assert.assertNull(message, "FAIL: Object is not null");
//
//// If object is null → next line executes
//// If object is not null → program stops here


//6. assertNotNull()
//WebElement login = driver.findElement(By.name("login"));
//
//Assert.assertNotNull(login, "FAIL: Login button not found");
//
//// If object is not null → next line executes
//// If object is null → program stops here


//7. fail()
//Assert.fail("FAIL: Test failed intentionally");
//
//// Program always stops here.
//// login.click() will never execute.



