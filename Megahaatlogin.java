package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Megahaatlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		 driver.get("https://www.megahaateworld.com/");
		 
		 WebElement Sign=driver.findElement(By.linkText("Sign In"));
		  Sign.click();
		 WebElement Fname=driver.findElement(By.id("fname"));
		  Fname.sendKeys("Raghib");
		   WebElement Lname=driver.findElement(By.id("lname"));
		  Lname.sendKeys("Anjum");
		 
		  WebElement Email=driver.findElement(By.id("user_login"));
		  Email.sendKeys("9717415911");
		  
		  WebElement Submit=driver.findElement(By.id("wp-submit"));
		  Submit.click();
		  
		  WebElement otp=driver.findElement(By.id("otp"));
		  otp.sendKeys("4578");
		 
		  WebElement submt=driver.findElement(By.id("submitbtn"));
		  submt.submit();
	}

}
