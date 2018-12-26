package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get( " https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement resize=driver.findElement(By.xpath( ".//*[@id='resizable']/div[3]"));
		Actions action=new Actions(driver);
		//action.dragAndDropBy(resize, 400,400).perform();
		action.clickAndHold(resize).moveByOffset(200, 100).release(resize).build().perform();
		
	}

}
