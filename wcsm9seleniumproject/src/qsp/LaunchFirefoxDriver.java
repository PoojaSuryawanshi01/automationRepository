package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
	//to launch chrome browser we need create obj of chromedriver();
		
	WebDriver	 driver=new FirefoxDriver();//here we upcasting to access methods from webdriver interface
				
	System.out.println("Firefox is open");
				
	Thread.sleep(2000);//(take curser on that line and click on add throw declaration we added exception
				
	driver.close();//method from the driver class,we call it throw the driver obj.reference variable
				
	System.out.println("Firefox is close");
		
	}

}
