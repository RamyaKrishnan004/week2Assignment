package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditHtml {
	public static void main(String[] args) {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("http://leafground.com/pages/Edit.html"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("ramyanavaneethan004@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ramya");
		String text= driver.findElement(By.xpath("username")).getText();
		System.out.println(text);
		
	}}