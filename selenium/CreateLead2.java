package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLead2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.findElement (By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        driver.findElement (By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement (By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement (By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement (By.xpath("//a[text()='Leads']")).click();
        driver.findElement (By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement (By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
        driver.findElement (By.id("createLeadForm_firstName")).sendKeys("sankari");
        driver.findElement (By.id("createLeadForm_lastName")).sendKeys("siva");
        driver.findElement(By.name("firstNameLocal")).sendKeys("leaf");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Assignments sankari");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("siva11@gmail.com");
		WebElement element1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ele = new Select(element1);
		ele.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
        
        
		}
	
}
