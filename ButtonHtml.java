package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonHtml {
	public static void main(String[] args) {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" http://leafground.com/pages/Button.html"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[text()='Get Position']")).click();
		
		driver.findElement(By.xpath("//button[text()='What color am I?']")).getAttribute("background-color:lightgreen");
		
		
}
}