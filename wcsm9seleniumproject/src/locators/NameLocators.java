package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/wcsm9/Loginbutton1.html");
	driver.manage().window().maximize();
	driver.findElement(By.name("n1")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("n2")).sendKeys("manager");
	}

}
