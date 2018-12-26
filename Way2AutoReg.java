package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Way2AutoReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();

driver.get("http://way2automation.com/way2auto_jquery/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("//div/div/form/fieldset[1]/input")).sendKeys("Raghib");
driver.findElement(By.xpath("//div/div/form/fieldset[2]/input")).sendKeys("9717415911");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ragebanjum@gmail.com");
WebElement option=driver.findElement(By.xpath("//div/form/fieldset[4]/select"));
Select select=new Select(option);
select.selectByValue("Iraq");
driver.findElement(By.name("city")).sendKeys("bagdad");
driver.findElement(By.xpath("//div/form/fieldset[6]/input")).sendKeys("raghib31");
driver.findElement(By.xpath("//div/form/fieldset[7]/input")).sendKeys("sana@901");
driver.findElement(By.xpath(" //div/div/form/div/div[2]/input")).click();

  


	}

}
