package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// currency dropdown
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); // static
																											// dropdown
		Select dropdown = new Select(staticdropdown); // static dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("AED");
		// currency dropdown
		// passenger dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("divpaxinfo")).click();

		int i = 1;
		while (i < 5) // for(int i=0;i<3;i++) // for loop is for single click statement
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			driver.findElement(By.id("btnclosepaxoption")).click();
		} // passenger dropdown

		// dynamic dropdown from - to

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).click();
		WebElement dynamicdrop = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		Select dynamicdropdown = new Select(dynamicdrop);
		dynamicdropdown.selectByVisibleText("MAA");
		dynamicdropdown.selectByValue("MAA");

	}

}
