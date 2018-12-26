package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TestTryFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni listProfile=new ProfilesIni();
		FirefoxProfile profile=listProfile.getProfile("default");
		
WebDriver driver=new FirefoxDriver(profile);
driver.get("http://www.firstcry.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("html/body/div[5]/div[1]/div/div[2]/span[6]")).click();
/*driver.switchTo().frame("btmstripfrmQuickView");
driver.findElement(By.xpath("html/body/div[22]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/form/input[1]")).sendKeys("raghib90@gmail.com");
driver.findElement(By.xpath("html/body/div[22]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/form/input[2]")).sendKeys("diplomaengg@90");
*/
List<WebElement> frames=driver.findElements(By.tagName("iframe"));
for(WebElement frame:frames)
{
	System.out.println(frame.getAttribute("id"));
}
	}

}
