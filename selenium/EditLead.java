package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.findElement (By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement (By.id("password")).sendKeys("crmsfa");
        driver.findElement (By.className("decorativeSubmit")).click();
        driver.findElement (By.linkText("CRM/SFA")).click();
        driver.findElement (By.linkText("Leads")).click();
        driver.findElement (By.linkText("Create Lead")).click();
        driver.findElement (By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
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
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("see my Assingments");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
        
        
		}
	
}
