package sychronaizationPackage;


import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
	WebDriver	driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch the webapplication
	
	driver.get("https://www.flipkart.com");
	//handle the pop up
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//serach for laptops in search box
	driver.findElement(By.name("q")).sendKeys("laptops");
    driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]")).click();
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[@class='_3879cV'and text()='HP']")).click();
	Thread.sleep(2000);
	//click on core processor
	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	//select 4 and above ratings from customer ratings
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);
	List<WebElement> allLaptop = driver.findElements(By.xpath("//div[@class='_4rR01T')][5]"));
	Thread.sleep(2000);
	List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1'][2]"));
	Thread.sleep(2000);
	for(int i=0;i<allLaptop.size();i++)
	{
		String laptop = allLaptop.get(i).getText();
		for(int j=i;j<=1;j++)
		{
			String Price = allPrice.get(j).getText();
			System.out.println(laptop+":"+Price);
			Thread.sleep(2000);
	
		}
		System.out.println();
	}
	Thread.sleep(2000);
	
    
	
    
    	
    	
    
     
 
    		 	
	
	
	
	}

}
