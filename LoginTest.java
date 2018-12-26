package webDriverTestng;

import org.testng.annotations.Test;

public class LoginTest {
@Test(priority=2)
	void logTest()
	{
		System.out.println("login successfully done");
	}
@Test(priority=1)
	void regestrationTest()
	{
		System.out.println("user regestered successfully");
	}
}
