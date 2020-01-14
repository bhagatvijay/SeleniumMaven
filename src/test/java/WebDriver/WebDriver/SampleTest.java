package WebDriver.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
	public void firstMavenTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void secondMavenTest() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.yahoo.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
