package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpdwnHtml {
	public static void main(String[] args) {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select//option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown3\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		WebElement options = driver.findElement(By.className("dropdown"));
		Select value2 = new Select(options);
		System.out.println(value2.getOptions().size());
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[3]")).click();
}}
