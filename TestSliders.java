package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get( "https://jqueryui.com/resources/demos/slider/default.html");
 

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait( 10, TimeUnit.MILLISECONDS);
WebElement slider=driver.findElement( By.xpath( ".//*[@id='slider']/span"));
 
int width=driver.findElement(By.xpath( ".//*[@id='slider']/span" )).getSize().width/2;
Actions action=new Actions(driver);
action.dragAndDropBy(slider, 400, 0).perform();
action.dragAndDropBy(slider, width, 0).perform();
 
//action.click();
	}

}
