package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRightClk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get( "http://deluxe-menu.com/popup-mode-sample.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
WebElement Click=driver.findElement(By.xpath( "//table[1]/tbody/tr/td[3]/p[2]/img"));
Actions action=new Actions(driver);
action.contextClick(Click).perform();
	}

}
