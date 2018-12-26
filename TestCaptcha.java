import com.thoughtworks.selenium.DefaultSelenium;

public class TestCaptcha {

	public static void main(String[] args) {

		//2.53.1 - FF 47.0.1


		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://timesofindia.indiatimes.com");
		selenium.start();
		selenium.open("/poll.cms");
		selenium.windowMaximize();
		
		String text = selenium.getText("//*[@id='mathq2']");
		System.out.println(text);

		System.out.println(text.substring(0, 1));
		System.out.println(text.substring(4, 5));
		
		int num1 = Integer.parseInt(text.substring(0, 1));
		int num2 = Integer.parseInt(text.substring(4, 5));
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		selenium.type("//*[@id='mathuserans2']", Integer.toString(sum));
		
	}

}
