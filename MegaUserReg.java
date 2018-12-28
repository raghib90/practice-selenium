package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MegaUserReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	 driver.get("https://www.megahaateworld.com/");
	 WebElement Join=driver.findElement(By.xpath("//*[@id=\"user-benefits\"]/div[1]/div[3]/span[1]/a"));
	 Join.click();
	 Select sel=new Select(driver.findElement(By.id("myselect")));
	 sel.selectByValue("megahaatvillage");
	 Thread.sleep(3000);
	// WebElement FirstName =driver.findElement(By.xpath("//*[@id=\"password\"]"));
		/*FirstName.sendKeys("Mohd");
		
		WebElement LastName =driver.findElement(By.xpath("//*[@id=\"Password Confirmation\"]"));
		FirstName.sendKeys("Aman");
		
		WebElement Email =driver.findElement(By.className("form-control"));
		FirstName.sendKeys("anjum@gmail.com");*/
		
		Select state=new Select(driver.findElement(By.id("state")));
		state.selectByValue("2_Bihar_BI");
		
		Thread.sleep(3000);
		Select dist=new Select(driver.findElement(By.id("district")));
		dist.selectByVisibleText("CHAMPARAN");
		
		Thread.sleep(3000);
		Select block=new Select(driver.findElement(By.id("block")));
		block.selectByValue("152_CHAKIA_CK");
           Thread.sleep(3000);
		 WebElement pincode =driver.findElement(By.xpath("//*[@id=\"wp_signup_form\"]/div[5]/div[2]/div/input"));
			pincode.sendKeys("451268");
			
			WebElement Address=driver.findElement(By.id("village_address"));
			Address.sendKeys("I-59, U.P.S.I.D.C. Surajpur Site V, Kasna, Gautam Buddh Nagar, Greater      Noida, U.P. – 201308,India");
			
			WebElement Bcode=driver.findElement(By.id("franchise_id"));
			Bcode.sendKeys("BICPCK1030");
			
			Select ID=new Select(driver.findElement(By.id("identity_id")));
			ID.selectByVisibleText("Voter Card");
			
			WebElement proofid=driver.findElement(By.id("proof_id"));
			proofid.sendKeys("C:\\Users\\Raghib\\Desktop\\logo.jpg");
			Thread.sleep(3000);
			
			WebElement Terms=driver.findElement(By.xpath("//input[@name='terms']"));
			Terms.submit();
			
			WebElement Submit=driver.findElement(By.id("submitbtn"));
			Submit.submit();
			
        //driver.quit();
	}

}
