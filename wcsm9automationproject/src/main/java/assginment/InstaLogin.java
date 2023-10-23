package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	public static void main(String[] args) throws InterruptedException {
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
//identify usernameTextBox and pass inputs
driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");

//identify passwordTextBox and pass input
driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin@123");

//identify loginbutton and click
driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();

Thread.sleep(2000);

driver.quit();


	}

}
