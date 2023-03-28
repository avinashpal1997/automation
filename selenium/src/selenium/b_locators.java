package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class b_locators {
	
	public static void main(String[] args) throws InterruptedException 
	{
		String name = "RAHUL";
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));        // implicit wait     
	        driver.get("https://rahulshettyacademy.com/locatorspractice/");
	        driver.findElement(By.id("inputUsername")).sendKeys(name);                // name declared
	        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	        driver.findElement(By.id("chkboxTwo")).click();
	        driver.findElement(By.className("submit")).click();	
	       Thread.sleep(1000);
	        
            System.out.println(driver.findElement(By.tagName("p")).getText());	
            
          Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in." );
          Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+"," );
          
          driver.findElement(By.className("logout-btn")).click();
	      
	      
	     
	}
	public static String getpassword(WebDriver driver) throws InterruptedException 
	
	{

		
		
	      
    	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	   driver.findElement(By.linkText("Forgot your password?")).click();
    	   Thread.sleep(1000);
    	   
    	  // Please use temporary password '           rahulshettyacademy  ' to Login.
    	   
    	   driver.findElement(By.className("reset-pwd-btn")).click();
    	   String passwordText =  driver.findElement(By.cssSelector("form p")).getText();    	   
    	    String[]  passwordArray = passwordText.split("'");
    	                    String[] passwordArray2 =  passwordArray[1].split("'");
    	                String passwordis =  passwordArray2[0];
    	                return passwordis;
	}
}
    	 
       



