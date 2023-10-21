package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub
	     WebDriver	driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.zomato.com/india");
	     Thread.sleep(2000);
	     String title = driver.getTitle();
	     System.out.println(title);
	     String currentURL = driver.getCurrentUrl();
	      
	     System.out.println(currentURL);
	     GetPageSourceMethod returnSourceCode = new GetPageSourceMethod();
	     System.out.println(returnSourceCode);
	     driver.quit();
	     
	}

}
