package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath(" html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[2]/input")).sendKeys("raghib.anjum");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[4]/input")).sendKeys("diplomaengg");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	}

}
