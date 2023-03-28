package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		                   // webdriver.gecko.driver
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
           driver.get("https://rahulshettyacademy.com");   // get method to browse to web page
            
          System.out.println(driver.getTitle());      // getTitle to get title of the webpage
          
          System.out.println(driver.getCurrentUrl());   // to get the url of current website        
          
      driver.close();
}}



                  //  WebDriver driver = new FirefoxDriver();   // geckodriver
                 
                  //  WebDriver driver = new EdgeDriver();     //