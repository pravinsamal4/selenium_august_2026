package _02_assertions;

import org.testng.Assert;
//Assertion			Passes When			Fails When			Common Selenium Use
//assertNotNull()	Object is not null	Object is null		Verify driver or element reference exists

//6. assertNotNull()
//WebElement login = driver.findElement(By.name("login"));
//
//Assert.assertNotNull(login, "FAIL: Login button not found");
//
////If object is not null → next line executes
////If object is null → program stops here

public class A06_hardAssertNotNull {
	   public static void main(String[] args) {

	        String name = "Pravin";
	        String city = null;

	        // Passes because 'name' is not null
	        Assert.assertNotNull(name, "FAIL: Name is null");
	        System.out.println("assertNotNull() Passed");

	        // Passes because 'city' is null
	        Assert.assertNull(city, "FAIL: City is not null");
	        System.out.println("assertNull() Passed");
	    }
}
