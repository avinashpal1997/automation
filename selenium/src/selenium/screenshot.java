package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class screenshot {

	public static void main(String[] args) throws IOException {
		
		
		 WebDriver driver = new EdgeDriver();
		    
		    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		    
		            File src =      ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                     
		                 FileUtils.copyFile(src, new File("D:\\Python//screenshot.png"));
	
	}

}
