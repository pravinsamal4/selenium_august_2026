package _02_assertions;

public class B01_SoftAssertTheory {
	
	
//	| **SoftAssert Method**          | **Passes When**          | **Fails When**           | **Common Selenium Use**                                     |
//	| ------------------------------ | ------------------------ | ------------------------ | ----------------------------------------------------------- |
//	| `softAssert.assertTrue()`      | Condition is `true`      | Condition is `false`     | Verify button enabled, element displayed                    |
//	| `softAssert.assertFalse()`     | Condition is `false`     | Condition is `true`      | Verify element hidden, button disabled                      |
//	| `softAssert.assertEquals()`    | Expected = Actual        | Values are different     | Verify title, URL, text                                     |
//	| `softAssert.assertNotEquals()` | Expected ≠ Actual        | Values are the same      | Verify URL/title/text has changed                           |
//	| `softAssert.assertNull()`      | Object is `null`         | Object is **not** `null` | Verify optional object/reference is null                    |
//	| `softAssert.assertNotNull()`   | Object is **not** `null` | Object is `null`         | Verify driver or element reference exists                   |
//	| `softAssert.fail()`            | Never passes             | Always fails             | Record a failure but continue execution until `assertAll()` |

	// Create SoftAssert object
	//	SoftAssert softAssert = new SoftAssert();

	//1. assertTrue()
	//
	//softAssert.assertTrue(login.isEnabled(), "FAIL: Login button is not enabled");
	//
	//// If assertion passes → login.click() executes
	//// If assertion fails → login.click() still executes
	//// Failure is reported only at assertAll()
	//
	//login.click();


	//2. assertFalse()
	//
	//softAssert.assertFalse(login.isEnabled(), "FAIL: Login button is clickable");
	//
	//// If assertion passes (button is disabled) → login.click() executes
	//// If assertion fails (button is enabled) → login.click() still executes
	//// Failure is reported only at assertAll()
	//
	//login.click();


	//3. assertEquals()
	//
	//String actualTitle = driver.getTitle();
	//String expectedTitle = "Facebook";
	//
	//softAssert.assertEquals(actualTitle, expectedTitle, "FAIL: Title does not match");
	//
	//// If titles are equal → next line executes
	//// If titles are not equal → next line still executes
	//// Failure is reported only at assertAll()


	//4. assertNotEquals()
	//
	//String actualTitle = driver.getTitle();
	//
	//softAssert.assertNotEquals(actualTitle, "Google", "FAIL: Unexpected title found");
	//
	//// If titles are different → next line executes
	//// If titles are same → next line still executes
	//// Failure is reported only at assertAll()


	//5. assertNull()
	//
	//String message = null;
	//
	//softAssert.assertNull(message, "FAIL: Object is not null");
	//
	//// If object is null → next line executes
	//// If object is not null → next line still executes
	//// Failure is reported only at assertAll()


	//6. assertNotNull()
	//
	//WebElement login = driver.findElement(By.name("login"));
	//
	//softAssert.assertNotNull(login, "FAIL: Login button not found");
	//
	//// If object is not null → next line executes
	//// If object is null → next line still executes
	//// Failure is reported only at assertAll()


	//7. fail()
	//
	//softAssert.fail("FAIL: Test failed intentionally");
	//
	//// Failure is recorded
	//// Program continues executing
	//// Test is marked as failed only after assertAll()


	// Mandatory for SoftAssert
	//softAssert.assertAll();
}
