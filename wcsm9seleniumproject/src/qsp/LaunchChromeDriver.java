package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeDriver {
	public static void main(String[] args) throws InterruptedException {
		//to launch chrome browser we need create obj of chromedriver();
		
		WebDriver	 driver=new ChromeDriver();//here we upcasting to access methods from webdriver interface
		
		System.out.println("Chrome is open");
		
		Thread.sleep(2000);//(take curser on that line and click on add throw declaration we added exception
		
		driver.close();//method from the driver class,we call it throw the driver obj.reference variable
		
		System.out.println("Chrome is close");
		
		
	}

}
