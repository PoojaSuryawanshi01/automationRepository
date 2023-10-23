package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vistara {
public static void main(String[] args) throws InterruptedException{
	//handle notification pop in chrome browser
	ChromeOptions Co = new ChromeOptions();
	Co.addArguments("--disable-notification");
    WebDriver driver=new ChromeDriver(Co);
    driver.manage().window().maximize();
    driver.get("https://www.airvistara.com/in/en");
    
    driver.findElement(By.id("cookieModalCloseBtn")).click();
    driver.findElement(By.name("flightSearchFrom")).sendKeys("Pune");
    Thread.sleep(2000);	
    driver.findElement(By.name("flightSearchTo")).sendKeys("BOM");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[id='departCalendar']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[aria-current=\"true\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[data-date=\"24\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[name=\"passengers\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[id=\"adds_adult\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[value=\"business\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[class=class=\"col-xs-12 done_btn aubergine-button-dark passengerModalBtn\"]")).click();
    Thread.sleep(2000);
    Thread.sleep(2000);
    driver.quit();
    
    
    
    
   
    
    
    
    
}
}
