package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSample {

	public static void main(String[] args) throws InterruptedException {

		//Firebug and Firepath - addons to firefox

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	/*	
		String title = driver.getTitle();
		
		
		
		title.length();*/
		
		System.out.println(driver.getTitle().length());
		
		/*WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("trainer@way2automation.com");
		
		WebElement button = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		button.click();*/
	
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdfsfds");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		
		
		
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']/div[2]/div[2]"))).getText());
		
	
	}

}
