package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/wcsm9/singleselectdropdown.html");
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("idddd"));
		
		//handle dropdown
		Select sel = new Select(dropdown1);
		 WebElement allops = sel.getWrappedElement();
		 
		 System.out.println(allops.getText());
		 //get all the options from dropdownn by using getoptions
		List<WebElement> options = sel.getOptions();
		
		//select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			if(opt.getText().equals("vadapav"));
			{
				opt.click();
				break;
			}
		}
		}
		
		
		
		

}
