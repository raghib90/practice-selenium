package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationway2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
 
//WebDriver driver = new ChromeDriver();

		 System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();

driver.get("http://way2automation.com/way2auto_jquery/index.php");

WebElement Name= driver.findElement(By.name("name"));
Name.sendKeys("Mohd Sarfaraz");

WebElement Phone= driver.findElement(By.name("phone"));
Phone.sendKeys("9871078058");

WebElement Email= driver.findElement(By.name("email"));
Email.sendKeys("mohd.sarfaraz@megahaat.com");
	//try {	

Select Country= new Select(driver.findElement(By.name("country")));
Country.selectByVisibleText("Iceland");

WebElement City= driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[5]/input"));
City.sendKeys("Noida");
	//}
	//catch(Exception e)
	//{
		//System.out.println(e.getStackTrace()); 
	//}
//WebElement UserName= driver.findElement(By.name("username"));
//UserName.sendKeys("Sarfaraz");
WebElement Username= driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"));
Username.sendKeys("Sarfaraz");

WebElement Password= driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"));
Password.sendKeys("sarfaraz123@");

WebElement Submit= driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input"));
Submit.submit();

//WebElement Submit= driver.findElement(By.className("button"));
//Submit.submit();
//WebElement Submit = driver.findElement(By.cssSelector("#load_form > div > div.span_1_of_4 > input")); // By CSS Selector
//Submit.submit();	

	}

}


