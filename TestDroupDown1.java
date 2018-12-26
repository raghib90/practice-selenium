package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDroupDown1 {
	public static void main(String[]args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		//driver.get("https://www.wikipedia.org/");
		
	 WebElement droupdown=	driver.findElement(By.xpath( ".//*[@id='searchLanguage']"));
	 
	 Select select=new Select(droupdown);
	 
	 select.selectByValue("ru");
List<WebElement>values= droupdown.findElements(By.tagName("option"));

System.out.println(values.get(0).getAttribute("value"));

for(int i=0;i<values.size();i++)
{
	System.out.println(values.get(i).getAttribute("value"));
	
	
}
	 
System.out.println(values.size());

WebElement block=driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]/div[3]"));
 List<WebElement>link= block.findElements(By.tagName("a"));
 System.out.println(link.size());
 for(WebElement links:link)
 {
	 System.out.println(links.getAttribute("href"));
 }
	}

}
