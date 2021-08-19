package week2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHtml {
	public static void main(String[] args) {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" http://leafground.com/pages/checkbox.html"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		boolean sel = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).isSelected();
		System.out.println(sel);
		WebElement uncheck = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
        uncheck.click();
        
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
        
        
}}
