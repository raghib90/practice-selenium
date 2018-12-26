package webDriverTestng;

import javax.annotation.Priority;

import org.testng.annotations.Test;

public class TestNg {
 @Test(priority=2)
	void display()
	{
		System.out.println("Its first java program");
	}
 @Test(priority=1)
  void getdisplay()
  {
	 System.out.println("Execute first"); 
  }
}

