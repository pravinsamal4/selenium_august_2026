package _01_selenium_july_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class B9_Drag_And_Drop {
	public static void main(String[] args) {
		WebDriver driver=A_openbrowser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		WebElement src =driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle')])[1]"));
		WebElement des=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des);
		act.perform();
	}

}
