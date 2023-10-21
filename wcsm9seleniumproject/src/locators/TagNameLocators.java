package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/wcsm9/Loginbutton1.html");
	Thread.sleep(2000);
	 //identify usernameTB and pass input AS admin
	driver.findElement(By.tagName("input")).sendKeys("admin");
	//identify usernameTB and pass input As manager
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}
