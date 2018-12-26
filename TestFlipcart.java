package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestFlipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get( "https://www.flipkart.com/");
WebElement menue=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
//menue.click();
Actions action=new Actions(driver);
 action.moveToElement(menue).perform();
 driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[2]/a/span")).click();

	}

}
