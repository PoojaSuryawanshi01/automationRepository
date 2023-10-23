package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/wcsm9/Radio%20button.html");
	Thread.sleep(2000);
	//identify D radio button by using name locator
	driver.findElement(By.name("name4")).click();
	
	}

}
