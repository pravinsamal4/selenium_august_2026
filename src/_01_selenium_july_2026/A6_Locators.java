package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\practice_selenium\\\\exes\\\\july_2026\\\\chrome\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		


		//Locator by tagname
//		How to search tagName in HTML (Chrome Inspect):
//
//			Open the page → Right-click → Inspect.
//			Press Ctrl + F in the Elements panel.
//			Type the tag directly in search filed , for example:
//			(//input) → highlights all <input> elements.
//			(//button) → highlights all <button> elements.
//			(//a) → highlights all links (<a> tags).
//			👉 The search will show (1 of X) → meaning there are X total elements with that tag.
		
		WebElement tagname=driver.findElement(By.tagName("button"));
		System.out.println(tagname.isDisplayed());
		
		//Locator by id (in html page just type #value(example- #email) 
		//“If the id shows 1/1, it’s unique and the best locator. If it appears first in the results, it’s still fine to use, but unique IDs are always preferred.”
		WebElement id=driver.findElement(By.id("input-firstname"));
		id.sendKeys("pravin");
		
		//Locator by name
		//to search in html write in search box value of name(attribute) 
		WebElement name=driver.findElement(By.name("lastname"));
		name.sendKeys("samal");
		
		//locator by class name
		WebElement classname=driver.findElement(By.className("hidden-xs"));
		System.out.println(classname.isDisplayed());
		
		//css by attribute
		//to search in html write in search box --> tagname[attribute='value']  or [attribute='value']
		WebElement cssAtr=driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
				// OR //
		//WebElement cssAtr=driver.findElement(By.cssSelector("[name=\"firstname\"]"));

		cssAtr.sendKeys("pravin");
		
		//css by class

		//to search in html write in search box --> tagname.classvalue  or .classvalue
		//if 1 of x then tagname.classvalue:nth-of-type(2)
		
		WebElement cssClass=driver.findElement(By.cssSelector(".list-group-item"));
		System.out.println(cssClass.isDisplayed());
		
		//css by id
		//to search in html write in search box --> tagname#idvalue  or #idvalue
		WebElement cssId=driver.findElement(By.cssSelector("#input-email"));
		cssId.sendKeys("saa@gmail.com");
		
		//linked text
//		By.linkText() and By.partialLinkText() are only for <a> elements.
		// tagname should ---> a 
		WebElement linktext=driver.findElement(By.linkText("Qafox.com"));
		System.out.println(linktext.isDisplayed());
		
		//partial linked text
		WebElement partial=driver.findElement(By.partialLinkText("Qafox"));
		System.out.println(partial.isDisplayed());
		
	}
}
