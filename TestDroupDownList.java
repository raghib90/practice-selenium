package webDriverTestng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDroupDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath(" //*[@id='searchLanguage']"));
		Select select = new Select(element);
		// select.selectByVisibleText("Dansk");
		select.selectByValue("da");
		// select.getOptions();
		List<WebElement> value = driver.findElements(By.tagName("Option"));
		System.out.println(value.get(0).getAttribute("lang"));
		// driver.findElement(By.xpath(
		// ".//*[@id='search-form']/fieldset/button")).click();
		// value.size();
		/*System.out.println(value.size());
		for (int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i).getAttribute("lang"));
		}*/
		
	 
	
			System.out.println(" total number of links ");
			List<WebElement>links1=driver.findElements(By.tagName("a"));
			//List<WebElement>links1=block.findElements(By.tagName("a"));
			System.out.println(links1.size());
			
			for(WebElement Link: links1)
			{
			 System.out.println(Link.getText()+"With Href"+Link.getAttribute("href"));
			}
		}

	

}