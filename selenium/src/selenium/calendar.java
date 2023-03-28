package selenium;

import java.util.List;                                         //END TO END TESTING ++++++++++++++++++++++++++++++++++++++++++++++++

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class calendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	       WebDriver driver = new EdgeDriver();
	       
	       driver.get("https://www.easemytrip.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.id("frmcity")).click();
	      driver.findElement(By.id("a_FromSector_show")).sendKeys("jammu");
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//li[@onchange='ChangeCabin();']")).click();
	    	driver.findElement(By.id("tocity")).click();
	    	driver.findElement(By.id("a_Editbox13_show")).sendKeys("Del");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("airportNew Delhi")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("dvfarecal")).click();
	    	
	    	driver.findElement(By.id("frth_3_22/03/2023")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("rtag")).click();
	    	driver.findElement(By.id("fiv_5_31/03/2023")).click();
	    	driver.findElement(By.xpath("//input[@id='chkStudent']")).click();
	    	driver.findElement(By.cssSelector(".srchBtnSe")).click();
	    	Thread.sleep(3000);
	    	driver.quit();
	    	
	    	
           
	}
	

}


