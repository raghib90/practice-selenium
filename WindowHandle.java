package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[6]/a")).click();
		driver.switchTo().frame("login-iframe.dspN");
		driver.findElement(By.xpath("html/body/div[9]/div[2]/div[2]/form/div[5]/div[2]/input")).sendKeys("raghib90@gmail.com");
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window id is="+parent);
		Set<String> allwindows=driver.getWindowHandles();
		 Iterator<String> itr=allwindows.iterator();
		 while(itr.hasNext())
		 {
			 String child=itr.next();
			 System.out.println(child);
			 
		 }
				driver.switchTo().window("");

	}

}
