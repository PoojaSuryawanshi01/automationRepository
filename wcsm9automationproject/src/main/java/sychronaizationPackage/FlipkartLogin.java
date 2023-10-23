package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//how to use implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.findElement(By.xpath("//a[text()='Cart']")).click();
	
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	
	
	
	
	}

}
