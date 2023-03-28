package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class assertions {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver_win323.exe");
       WebDriver driver = new EdgeDriver();
       
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));        // implicit wait     
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();    
        driver.findElement(By.id("inputUsername")).sendKeys("Avinash");
        driver.findElement(By.name("inputPassword")).sendKeys("ApsKhalsa@123");
       
      
        
        driver.findElement(By.id("chkboxTwo")).click();
        Assert.assertTrue(driver.findElement(By.id("chkboxTwo")).isSelected());
	    
        driver.findElement(By.className("submit")).click();	
	   System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	 //timeout issue error        

	   int a = 2;
	   int b= 3;
	   while(a<b)
	   {
		   System.out.println("  Arshi gandi hai ,, ignore krti hai            ");
	   }
}}
