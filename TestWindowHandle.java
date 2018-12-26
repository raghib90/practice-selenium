package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.co.in/search?q=indianbank&ie=");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.findElement(By.linkText("INDIANBANK INTERNET BANKING")).click();
String parrent_wind=driver.getWindowHandle();
for( String subwindow:driver.getWindowHandles())
{
	driver.switchTo().window(subwindow);
	driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr/td")).click();
}

 driver.close();
 driver.switchTo().window(parrent_wind);
 driver.close();
	}

}
