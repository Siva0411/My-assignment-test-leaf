package steps;

	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Baseclass extends AbstractTestNGCucumberTests{
		public static ChromeDriver driver;
		
		
	@BeforeMethod
	public void Precondition()
	{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
	}
		@AfterMethod
		public void Postcondition()
		{
			driver.close();
		}
		
	}

