package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
WebDriver driver=new FirefoxDriver();

driver.get("https://www.facebook.com/");
WebElement email=driver.findElement(By.id("email"));
email.sendKeys("raghib90@gmail.com");

WebElement pass=driver.findElement(By.id("pass"));
pass.sendKeys("diplomaengg@90");
WebElement login=driver.findElement(By.xpath("//*[@id='u_0_2']"));
login.click();

	}

}
