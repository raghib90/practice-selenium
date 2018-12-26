package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionClassDay4 {
	public static WebDriver driver;

	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable t) {
			return false;
		}
	}

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath(".//*[@id='identifierId']")).isDisplayed());
		System.out.println(isElementPresent(".//*[@id='identifierId']"));
		//driver.findElement(By.xpath( ".//*[@id='identifierId']"));
	}
}
