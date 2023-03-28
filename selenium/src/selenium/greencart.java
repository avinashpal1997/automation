package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class greencart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// WebDriverWait w = new WebDriverWait(driver,5);
		// w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy("LOCATOR VALUE"));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();
		
		 String[] Veggies = {"Cucumber", "Brocolli", "Beetroot"};
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
               String newname =  name[0].trim();           
              			
			
			List itemslist = Arrays.asList(Veggies);
			
			
			
			if (itemslist.contains(newname))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

				//break;
			}
		}

		//driver.quit();
	}

	
}
