package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	

	public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//get the title of current webpage
	 String titleOfPage = driver.getTitle();
	 System.out.println(titleOfPage);
	 System.out.println(driver.getTitle());
	driver.close();
	}

}
