package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//go to website
		driver.get("https://www.google.com//");
		//maximize
		driver.manage().window().maximize();
		//identify element and insert text
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		//identify eement and click
		driver.findElement(By.className("MV3Tnb")).click();
		driver.close();
		
		
		
		
		
	}
	
	
	
	
	
}
