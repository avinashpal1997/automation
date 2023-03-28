package selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingwindow {

	public static void main(String[] args) {
		
		    WebDriver driver = new EdgeDriver();
		    
		    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
           
		     driver.findElement(By.xpath("//a[@class ='blinkingText']")).click(); b
		     Set<String> window = driver.getWindowHandles();   
		     
		  	    Iterator<String> id = window.iterator();
		  	    
		  	  String parent =  id.next();
		  	  String child = id.next();
		  	  driver.switchTo().window(child);
		     
		    String email_id = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		   
                     driver.switchTo().window(parent);	    
		    driver.findElement(By.id("username")).sendKeys(email_id);
		  
	}

}
