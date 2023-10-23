package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("XYZ@456");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("pooja12");
	driver.quit();
	}

}
