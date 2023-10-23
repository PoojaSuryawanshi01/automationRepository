package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://affiliate.flipkart.com/login");
	Thread.sleep(2000);
	driver.findElement(By.id("inputEmail")).sendKeys("abcdef");
	Thread.sleep(2000);
	driver.findElement(By.id("inputPassword")).sendKeys("abc123");
	}

}
