package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://deluxe-menu.com/popup-mode-sample.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

WebElement click=driver.findElement(By.xpath(" //p[2]/img"));

Actions action=new Actions(driver);

//action.contextClick(click).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
//action.contextClick(click).sendKeys(Keys.ENTER).perform();
action.moveToElement(click).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
/*WebElement prod=click.findElement(By.linkText("Product Info"));
action.contextClick(prod).perform();*/
	}

}
