package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDropdowns {

	public static void main(String[] args) {


		//qa.way2automation.com
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		//select.getOptions();
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		List<WebElement> values1 = driver.findElements(By.tagName("option"));
		
System.out.println(values1.get(0).getAttribute("value"));
		
		
		System.out.println(values1.size());
		
		
		for(int i=0; i<values1.size(); i++){
			
			System.out.println(values1.get(i).getAttribute("lang"));
		}
		
		
		System.out.println(values.get(0).getAttribute("value"));
		
		
		System.out.println(values.size());
		
		
		for(int i=0; i<values.size(); i++){
			
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		
		
		System.out.println("---Printing links-----");
		
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
		
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(WebElement link: links){
			
			System.out.println(link.getText()+"---URL is---"+link.getAttribute("href"));
			
		}
		
		
	}

}
