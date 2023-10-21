package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {
	public static void main(String[] args) throws InterruptedException {
		//to launch edge browser we need create obj of EdgeDriver();
		
	WebDriver	 driver=new EdgeDriver();//here we upcasting to access methods from webdriver interface
	
		System.out.println("Edge is open");
		
		Thread.sleep(2000);//(take curser on that line and click on add throw declaration we added exception
		
		driver.close();//method from the driver class,we call it throw the driver obj.reference variable
		
		System.out.println("Edge is close");
		
		
	}

}
