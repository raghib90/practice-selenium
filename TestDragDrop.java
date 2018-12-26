package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get( "https://jqueryui.com/resources/demos/droppable/default.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
WebElement dragable=driver.findElement(By.xpath( ".//*[@id='draggable']"));
 WebElement dropable=driver.findElement(By.xpath( ".//*[@id='droppable']"));
 Actions action=new Actions(driver);
 action.dragAndDrop(dragable, dropable).perform();

}

}
