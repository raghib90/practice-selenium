package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreeCrmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	 driver.get("https://www.freecrm.com/register/");
	 WebElement drop=driver.findElement(By.id("payment_plan_id"));
		Select ID=new Select(drop);
		ID.selectByVisibleText("Free Edition");
		driver.findElement(By.name("first_name")).sendKeys("Raghib");
		driver.findElement(By.name("surname")).sendKeys("Anjum");
		driver.findElement(By.name("email")).sendKeys("raghib90@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("raghib90@gmail.com");
		driver.findElement(By.name("username")).sendKeys("raghib90");
		driver.findElement(By.name("password")).sendKeys("anjum@321");
		driver.findElement(By.name("passwordconfirm")).sendKeys("anjum@321");
	
	  
	 WebElement chk=driver.findElement(By.name("agreeTerms"));
	 chk.click();
	 //driver.findElement(By.id("submitButton")).submit();
	 driver.findElement(By.id("submitButton")).click();
	 
	 driver.findElement(By.id("company_name")).sendKeys("CPB");
	 driver.findElement(By.id("phone")).sendKeys("9717415911");
	 driver.findElement(By.id("fax")).sendKeys("458781258");
	 driver.findElement(By.id("website")).sendKeys("megahaat.com");
	 driver.findElement(By.id("company_email")).sendKeys("raghib.anjum@megahaat.com");
	 driver.findElement(By.id("service")).sendKeys("Its Best For Agriculture product");
	 driver.findElement(By.id("address")).sendKeys("Greater Noida");
	 WebElement city=driver.findElement(By.id("city"));
	 city.sendKeys("DELHI");
	 WebElement state=driver.findElement(By.id("state"));
	 state.sendKeys("DELHI");
	 driver.findElement(By.id("postcode")).sendKeys("201304");
		Select Country=new Select(driver.findElement(By.name("country")));
		Country.selectByVisibleText("Afghanistan");
		driver.findElement(By.name("copy_address")).click();
		driver.findElement(By.name("btnSubmit")).click(); 
	}

}
