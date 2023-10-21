package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/wcsm9/Loginbutton1.html");
	Thread.sleep(2000);
	//identify usernameTB and pass input AS id
	driver.findElement(By.id("i1")).sendKeys("admin");
	//identify passwordTB and pass input Asid
	driver.findElement(By.id("i2")).sendKeys("manager");
	}

}

