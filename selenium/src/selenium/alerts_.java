package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class alerts_ {          

	public static void main(String[] args) throws InterruptedException {
		{
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\chrome_driver\\chromedriver.exe");
			WebDriver driver = new EdgeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys("TEXT");
			driver.findElement(By.cssSelector("[id='name'")).click();
			driver.findElement(By.id("alertbtn")).click();

			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());

			driver.switchTo().alert().dismiss();

			driver.quit();

		}

	}
}
