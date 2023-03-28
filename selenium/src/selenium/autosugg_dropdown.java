package selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class autosugg_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.edge.driver",
		// "C:\Users\singh\Downloads\edgedriver_win643.exe")

		WebDriver\ driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2))
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id = 'autosuggest']")).sendKeys("IND");

		// DRIVER.FINDELEMENT(BY.ID("CTL00_MAINCONTENT_CHK_STUDENTDiscount")).click();

		Thread.sleep(8000);
		List<WebElement> option = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a ")); // xpath("ui-corner-all"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click()
				break;
			}
		}

	}
}
