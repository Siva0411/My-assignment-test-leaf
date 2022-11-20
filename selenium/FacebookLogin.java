package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class = '_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@id = 'fullname_field']//input[@name = 'firstname']")).sendKeys("siva");
        driver.findElement(By.xpath("//div[@id = 'fullname_field']//input[@name = 'lastname']")).sendKeys("Sankari");
		driver.findElement(By.name("reg_email__")).sendKeys("6374145814");
		driver.findElement(By.xpath("//div[@id = 'password_field']//input")).sendKeys("Sankari9@");
		Select date = new Select (driver.findElement(By.id("day")));
		date.selectByIndex(3);
		Select month = new Select (driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		Select year = new Select (driver.findElement(By.id("year")));
		year.selectByValue("1993");
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();

	}

}
