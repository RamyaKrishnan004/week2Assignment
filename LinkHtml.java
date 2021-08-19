package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHtml {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Link.html"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.navigate().back();
	
	String lt = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
	System.out.println(lt);
	
	driver.findElement(By.linkText("Verify am I broken?")).click();
	String broken = driver.getTitle();
	System.out.println(broken);
	
	driver.findElement(By.linkText("Go to Home Page")).click();
	
	
	
}}
