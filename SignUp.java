package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		WebElement Fname=driver.findElement(By.id("u_0_j"));
		Fname.sendKeys("Raghib");
		
		WebElement Lname=driver.findElement(By.id("u_0_l"));
		Lname.sendKeys("Anjum");
		
		WebElement email=driver.findElement(By.id("u_0_o"));
		email.sendKeys("ragebanjum@gmail.com");
		
		WebElement pass=driver.findElement(By.id("u_0_v"));
		pass.sendKeys("anjum@90");
		
		Select Dbrith=new Select(driver.findElement(By.id("day")));
		Dbrith.selectByIndex(23);
		
		Select DMonth=new Select(driver.findElement(By.id("month")));
		DMonth.selectByValue("2");
		
		Select DYear=new Select(driver.findElement(By.id("year")));
		DYear.selectByValue("1990");
		
		WebElement  Dsex=driver.findElement(By.id("u_0_a"));
		Dsex.click();
		
		WebElement  Dsubmit=driver.findElement(By.id("u_0_11"));
		Dsubmit.click();
		
		
		driver.close();
		
		
		
		
		
	}

}
