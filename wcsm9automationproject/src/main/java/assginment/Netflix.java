package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("avsbyfb");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("1234");
	driver.close();
	}

}
