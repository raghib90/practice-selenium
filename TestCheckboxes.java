import com.thoughtworks.selenium.DefaultSelenium;

public class TestCheckboxes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		//http://www.espncricinfo.com/series/8048/scorecard/980909/Kolkata-Knight-Riders-vs-Mumbai-Indians-5th-match

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://odyniec.net/");
		selenium.start();
		selenium.open("/articles/multiple-select-fields/");
		selenium.windowMaximize();
		
		/*
		for(int i=1; i<=4; i++){
			
			selenium.click("//html/body/div[1]/div[2]/div[1]/input["+i+"]");
			
		}
		*/
		int i=1;
		int count=0;
		
		while(selenium.isElementPresent("//html/body/div[1]/div[2]/div[1]/input["+i+"]")){
			
			selenium.click("//html/body/div[1]/div[2]/div[1]/input["+i+"]");
			i++;
			count++;
			
		}
		
		System.out.println("Total checkboxes are : "+count);
		
		

	}

}
