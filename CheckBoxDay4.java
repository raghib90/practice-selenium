package webDriverTestng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDay4 {
	
public static WebDriver driver;

public static boolean isElementPresent(String locator) 
{
int size=driver.findElements(By.xpath(locator)).size();
if(size==0)
	{return true;
	}
else{ return false;
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new FirefoxDriver();
		driver.get( "http://odyniec.net/articles/multiple-select-fields/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath( ".//*[@id='1_cheese']")).click();
		//driver.findElement(By.xpath( ".//*[@id='content']/div[1]/label[1]")).click();
		
		/*for(int i=1;i<=4;i++)
		{
			 driver.findElement(By.xpath( ".//*[@id='content']/div[1]/label["+i+"]")).click();
		}

	 
	*/
	WebElement boxes=	driver.findElement(By.xpath( ".//*[@id='content']/div[1]"));
	
		int i=1;
		int count=0;
		while(isElementPresent(".//*[@id='content']/div[1]/label["+i+"]"))
			
				{
			 driver.findElement(By.xpath( ".//*[@id='content']/div[1]/label["+i+"]")).click();
			 i++;
			 count++;
				}
		System.out.println("The Number of Checkbox is :=" +count);
		//List	<WebElement> checkbox= driver.findElements(By.name("ingredients[]"));
	List	<WebElement> checkbox= boxes.findElements(By.name("ingredients[]"));
	System.out.println("Total number of checkbox are" +checkbox.size());
	for(WebElement checkboxs:checkbox)
	{
		checkboxs.click();
	}
	}
}
