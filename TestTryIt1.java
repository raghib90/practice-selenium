package webDriverTestng;



import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTryIt1 {
	
	
	public static WebDriver driver;
	
	public static void captureScreenshot() throws IOException{
		
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(System.getProperty("user.dir")+"\\screenshot"+fileName));

		
		
	}

	public static void main(String[] args) throws IOException {


		 driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.switchTo().frame("iframeResult");
		
		((JavascriptExecutor) driver).executeScript("myFunction()");

		WebElement btn = driver.findElement(By.xpath(".//*[@id='mySubmit']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", btn);

		captureScreenshot();
		
		}

}



	

