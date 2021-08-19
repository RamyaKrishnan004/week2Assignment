package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHtml {
	public static void main(String[] args) {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("http://leafground.com/pages/Image.html"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibiling::img")).click();
		driver.navigate().back();
		
		String brokenimg = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
		System.out.println(brokenimg );
		
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
}}
