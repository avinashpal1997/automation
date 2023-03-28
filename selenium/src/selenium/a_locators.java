package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));        // implicit wait     
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();    
        driver.findElement(By.id("inputUsername")).sendKeys("Avinash");
        driver.findElement(By.name("inputPassword")).sendKeys("ApsKhalsa@123");
	    driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("submit")).click();	
	   System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	 //timeout issue error        
	        
	  driver.findElement(By.linkText("Forgot your password?")).click();  // link text locator
	    Thread.sleep(1000);
	                    // forgot password page
	
	  driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Avinashpal");
	  
	  driver.findElement(By.xpath("//input[@placeholder= 'Email']")).sendKeys("Avinash@gmail.com");
	  driver.findElement(By.xpath("//form/input[3]")).sendKeys("7006836918");    // parent to child
	
	driver.findElement(By.xpath("//div/button[2]")).click();
	System.out.println(driver.findElement(By.xpath("//form/p")).getText());
	
	}
       
	  
	
}
