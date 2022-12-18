package steps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public ChromeDriver driver;

	@Given("Launch the Chrome Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	

	@And("Load the URL and Maximize")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter the Username as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)$")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@And("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	@And("Click on the Crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And ("Click on Leads")
	public void ClickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("Click on Create Lead")
	public void CreateLeadButton() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And ("Enter the Company Name")
	public void EnterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}
	@And ("Enter the First Name")
	public void EnterFname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("siva");
	}
	@And ("Enter the Last Name")
	public void EnterLname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	}
	@When ("Click on Create Lead button")
	public void ClickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
}
