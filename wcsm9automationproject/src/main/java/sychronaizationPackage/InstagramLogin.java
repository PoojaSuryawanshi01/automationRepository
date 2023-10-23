package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//how to use implict wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.instagram.com/");
	
	
	
	
	
	}

}
