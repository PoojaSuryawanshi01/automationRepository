package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstoption {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/User/Desktop/wcsm9/singleselectdropdown.html");
	//single select dropdown
	WebElement dropdown1 = driver.findElement(By.id("idddd"));
	//handle the dropdown
	Select sel = new Select(dropdown1);
	//select the option from dropdown
	Thread.sleep(2000);
	sel.selectByValue("v7");
	
	//multi select dropdown
	
	driver.navigate().to("");
	
	//identify dropdwon
	WebElement dropdown2 = driver.findElement(By.id(""));
	//handle the multi select dropdown
	Select sel2 = new Select(dropdown2);
	//select multiple option from multi select option
	
	for(int i=5;i<8;i++)
	{
		sel2.selectByIndex(i);
	}
	//get option which is selected first
	
	System.out.println(sel2.getFirstSelectedOption().getText());
	
	
	
	
	

	
	
	}

}
