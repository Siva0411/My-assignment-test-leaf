package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteandFindLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("6374145814");
		driver.findElement(By.xpath("//td[@class = 'x-btn-center']//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(1000);
		WebElement firstLead = driver.findElement(By.xpath("//td[contains(@class, 'x-grid3-cell-first')]//a"));
		String firstResult = firstLead.getText();
		System.out.println(firstResult);
		firstLead.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(firstResult);
		driver.findElement(By.xpath("//td[@class = 'x-btn-center']//button[contains(text(), 'Find Leads')]")).click();
		String noRecord = "No records to display";
		WebElement message = driver.findElement(By.xpath("//div[@class = 'x-panel-bbar']//div[@class = 'x-paging-info']"));
		Thread.sleep(1000);
		String msg = message.getText();
		System.out.println(msg);
		boolean msgStatus = noRecord.equals(msg);
		System.out.println(msgStatus);
		driver.close();		
				

	}

}