package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		
		
		
		Actions Act = new Actions(driver);
	
		
		 Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
	         Act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
	
	       
	}

}