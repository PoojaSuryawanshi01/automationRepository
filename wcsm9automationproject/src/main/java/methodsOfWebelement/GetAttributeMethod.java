package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//get the attribute value of login button
	WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
	String attributeValue = loginButton.getAttribute("class");
	System.out.println(attributeValue);
	
	
	
	}

}

