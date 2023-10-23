package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetLocationMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch the application
	driver.get("demoapps.qspiders.com");
	WebElement emailTextBox = driver.findElement(By.cssSelector("input email"));
	//identify location of emailTextBox
	Point loc = emailTextBox.getLocation();
	int Xaxis = loc.getX();
	int yaxis = loc.getY();
	System.out.println("location of email text box : "+Xaxis+":"+yaxis);
	
	
	
	
	
			
	
	}

}
