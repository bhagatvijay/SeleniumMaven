package WebDriver.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test
	public void firstMavenTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
