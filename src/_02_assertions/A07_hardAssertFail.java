package _02_assertions;

import org.testng.Assert;
//Assertion			Passes When			Fails When			Common Selenium Use

//fail()			Never passes		Always fails		Intentionally stop a test with a failure message

//7. fail()
//Assert.fail("FAIL: Test failed intentionally");
//
////Program always stops here.
public class A07_hardAssertFail {
	  public static void main(String[] args) {

	        System.out.println("Test Started");

	        Assert.fail("FAIL: This test is intentionally failed");

	        System.out.println("Test Ended");
	    }

}
