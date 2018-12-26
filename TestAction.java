package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement menue=driver.findElement(By.xpath("html/body/div[1]/div/header/div[3]/div/ul/li[4]/a/span"));
Actions action =new Actions(driver);
action.moveToElement(menue).perform();
driver.findElement(By.linkText("Sport Shoes")).click();



	}

}
