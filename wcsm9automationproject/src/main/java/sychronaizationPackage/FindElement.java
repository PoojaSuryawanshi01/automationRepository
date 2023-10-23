package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-cr0ui1n/login.do");
	//identify username textbox
	
    WebElement usnTB = driver.findElement(By.name("username"));
    System.out.println("admin");
    usnTB.sendKeys("admin");
	}

}
