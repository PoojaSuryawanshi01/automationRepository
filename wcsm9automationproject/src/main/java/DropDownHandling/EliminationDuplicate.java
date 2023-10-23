package DropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminationDuplicate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/wcsm9/singleselectdropdown.html");
		//identify dropdown and store it in ref variable
		
		WebElement menuDropdown = driver.findElement(By.id("idddd"));
		//get all the options 
		
		Select sel = new Select(menuDropdown);
		 List<WebElement> allops = sel.getOptions();
		 //to eliminate duplicate we use hashset
		  HashSet<String> hs = new HashSet<String>();
		 //read the list by using for lop and elimante duplicate
		 for(int i=0;i<allops.size();i++)
		 {
			 WebElement op = allops.get(i);
			 // get the text of webelement
			 
			 String dropDownOption = op.getText();
			 System.out.println(dropDownOption);
			 Thread.sleep(2000);
			 hs.add(dropDownOption);
		 }
		 Thread.sleep(2000);
		 for(String opt:hs)
		 {
			 Thread.sleep(2000);
			 System.out.println(opt);
		 }
		 
		 
	}

}
