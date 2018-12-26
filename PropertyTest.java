package webDriverTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyTest {
	

	public static WebDriver driver;
	
	public static void captureScreenshot() throws IOException{
		
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(System.getProperty("user.dir")+"\\screenshot"+fileName));

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
Properties OR=new Properties();
FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties ");
OR.load(fin);
driver.get(OR.getProperty( "Url"));
driver.findElement(By.id(OR.getProperty( "username_id"))).sendKeys(" raghib90@gmail.com");
driver.findElement(By.className(OR.getProperty("nextBtn_xpath"))).click();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath(OR.getProperty("password_xpath"))).sendKeys("diplomaengg@90");
WebElement button=driver.findElement(By.xpath( OR.getProperty("signinBtn_xpath")));
button.click();
captureScreenshot();
//System.out.println(OR.getProperty("id"));
	}

}
