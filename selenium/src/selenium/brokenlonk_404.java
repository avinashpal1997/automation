package selenium;

import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenlonk_404 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	  String url =  driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
	    
	  
	  URLConnection Connect = new URL().openConnection();
	  

	}

}































