package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCheckbox {
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
		TestIsElementPresent par=new TestIsElementPresent();
		// TODO Auto-generated method stub
		 driver = new FirefoxDriver();
			driver.get( "http://odyniec.net/articles/multiple-select-fields/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();
			/*for(int i=1;i<=4;i++)
			{
				
			
			WebElement chk=driver.findElement(By.xpath(".//*[@id='content']/div[1]/input["+  i +"]"));
			chk.click();
			}
			*/
			/*int i=1;
			int count=0;
			while(isElementPresent(".//*[@id='content']/div[1]/input["+  i +"]"))
			{
				driver.findElement(By.xpath(".//*[@id='content']/div[1]/input["+  i +"]")).click();
				i++;
				count++;
			}
			System.out.println("Total number of element"+ count);*/
			
			List<WebElement> checkbox=driver.findElements(By.name("ingredients[]"));
			System.out.println("Total check box"+ checkbox.size());
			for(WebElement Checkbox1:checkbox)
			{ Checkbox1.click();
				System.out.println("Total check box"+ Checkbox1);
			}
	}

}
