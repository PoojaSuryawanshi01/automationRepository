package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	
	public static void main(String[] args) throws InterruptedException{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	driver.close();
	
	
	}
}
