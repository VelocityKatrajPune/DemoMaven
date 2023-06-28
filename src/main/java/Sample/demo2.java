package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo2
{
	
	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("opening facebook", true);
		Thread.sleep(2000);
		
		driver.quit();
		
		Thread.sleep(2000);
	}

}
