package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch a browser
        WebDriver	  driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //stop the execution of 2 sec
        Thread.sleep(2000);
        //launch the web application
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(2000);
        //click on open a pop  window link
        driver.findElement(By.partialLinkText("Open a popup window")).click();
        //stop the execution of 2 sec
        Thread.sleep(2000);
        //close the browser....it close the all the window are open/all the parent  and child broswer close
        driver.quit();

	}

}
