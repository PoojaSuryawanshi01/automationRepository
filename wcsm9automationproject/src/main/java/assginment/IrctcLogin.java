package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcLogin {
	public static void main(String[] args) throws InterruptedException {
		//handle notification pop in chrome browser
	ChromeOptions	options=new ChromeOptions();
	options.addArguments("--disable-notifications");
WebDriver	driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("pune");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("nanded");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-highlight ng-star-inserted']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).sendKeys("sleeper(SL)");




	
	}

}
