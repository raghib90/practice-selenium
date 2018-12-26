import com.thoughtworks.selenium.DefaultSelenium;

public class TestDropdown {

	public static void main(String[] args) {


		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "https://www.wikipedia.org/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
		selenium.select("//*[@id='searchLanguage']", "value=hi");
		
		String[] values = selenium.getSelectOptions("//*[@id='searchLanguage']");
	
		System.out.println(values.length);

		System.out.println(values[7]);
		
		
		for(int i=0; i<values.length; i++){
			
			System.out.println(values[i]);
			
		}
		
	}

}
