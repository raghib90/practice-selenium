package webDriverTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesWebdrive2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
	driver.get("https://Gmail.com");
	String Actual_Title=driver.getTitle();
	
	System.out.println(Actual_Title);
	WebElement element=driver.findElement(By.id("identifierId"));
	element.sendKeys("raghib90@gmail.com");
	WebElement element1=driver.findElement(By.className("CwaK9"));
	element1.click();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	WebElement element2=driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("diplomaengg@90");
	//driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).driver.
	//element2.sendKeys("diplomaengg@90");
	
	WebElement button=driver.findElement(By.xpath("//*[@id='passwordNext']/content"));
	button.click();
	//driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText();
	Thread.sleep(3000);
	
	WebDriverWait wait=new WebDriverWait(driver,3000);
	System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='password']/div[2]/div[2]"))).getText());
	//System.out.println(driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText()) ;
	
	
	
	
	
	
	
	//element1.click();
	//driver.close();
	}

}
