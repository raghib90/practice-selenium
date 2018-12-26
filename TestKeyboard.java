package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://accounts.google.com/");
driver.findElement(By.xpath("//div[1]/div[1]/div/div[1]/div/div[1]/input")).click();
driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]")).click();

Actions action=new Actions(driver);
action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
driver.findElement(By.xpath("//div[1]/div[1]/div/div[1]/div/div[1]/input")).click();
action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	}

}
