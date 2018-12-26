package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestcaseForActin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get( "https://www.flipkart.com/");

for (int i=1;i<=6;i++)
{
System.out.println(driver.findElement(By.xpath( ".//*[@id='container']/div/header/div[2]/div/ul/li["+i+"]/a/span")).getTagName());	
}
driver.findElement(By.xpath( ".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a"));
WebElement women=driver.findElement(By.xpath( ".//*[@id='container']/div/header/div[2]/div/ul/li[4]/a/span"));

Actions action=new Actions(driver);
action.moveToElement(women).perform();
driver.findElement(By.linkText( "Sarees")).click();
	}

}
