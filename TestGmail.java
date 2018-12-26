import com.thoughtworks.selenium.DefaultSelenium;

public class TestGmail {

	public static void main(String[] args) throws InterruptedException  {

		/*
		 * host
		 * port
		 * browser
		 * 
		 * 
		 * 
		 */

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://gmail.com");
		selenium.start();
		
		selenium.open("/");
		selenium.windowMaximize();
		String actual_title = selenium.getTitle();
		String expected_title = "gmail";
		
		
		
		
		
		if(actual_title.equalsIgnoreCase(expected_title)){
			
			System.out.println("Test case pass");
			
		}else{
			
			System.out.println("Test case fail");
			selenium.captureScreenshot("f:/screenshot/error.jpg");
		}
	
		selenium.type("//*[@id='identifierId']", "java@way2automation.com");
		selenium.click("//*[@id='identifierNext']/content/span");
		
		
		Thread.sleep(3000);
		selenium.type("//*[@id='password']/div[1]/div/div[1]/input", "sdfsfdsf");
		selenium.click("//*[@id='passwordNext']/content/span");
		Thread.sleep(3000);
		System.out.println(selenium.getText("//*[@id='password']/div[2]/div[2]"));
	
		System.out.println(selenium.getText("//title"));
	
	}

}
