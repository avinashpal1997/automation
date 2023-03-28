package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dynamicdropdown {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	       WebDriver driver = new EdgeDriver();
	       
	       driver.get("https://www.goibibo.com/");
	     
	       
	       driver.findElement(By.className("loginCont__input")).sendKeys("2323234455");
	      
	       driver.findElement(By.className("lgRightSection__close")).click();
	       driver.findElement(By.className("sc-jlwm9r-1 dRQhOp")).click();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
           driver.findElement(By.className("sc-bYoBSM eyNSEu fswWidgetPlaceholder")).click();
            
          
           driver.close();	
	    
	

}}
