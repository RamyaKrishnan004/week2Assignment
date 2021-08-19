package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.id("ext-gen270")).sendKeys("456321");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("linktext")).click();
		Thread.sleep(2000);
		driver.close();
		}}

		
		
	
	

