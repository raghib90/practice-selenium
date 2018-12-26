package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String Locator)
	{
		/*try {
			driver.findElement(By.xpath(Locator));
			
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./screenshot/"+"raghib"+".png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}*/
	int size1=	driver.findElements(By.xpath(Locator)).size();
	
	if(size1==0){
		return false;
	}
	else {
		return true;
	}
		//return false;
		
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
	System.out.println(isElementPresent(".//*[@id='identifierId1']"));

	}

}
