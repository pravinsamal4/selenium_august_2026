package _04_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//WebElement user=driver.findElement(By.xpath("//button[@type="submit"]"));
//Every POM contains 3 section
//constructor
//locator
//action method
public class loginpage {
	
	//constructor
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement txt_username;
	@FindBy(xpath = "//input[@name=\"password\"]")private WebElement txt_password;
	@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement btn_login;
	
	//action class
	public void setUsername(String user) {
		txt_username.sendKeys(user);
		
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btn_login.click();
		
	}

}
