package redBusAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectPickupDropPoints {
	    private WebDriver driver;

	    public selectPickupDropPoints(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void execute() throws InterruptedException {
	    	 try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	    	 Thread.sleep(2000);
	        // Test cases related to selecting pickup & drop points
	    	driver.findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > div:nth-child(1) > li:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > div:nth-child(1) > li:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1)")).click();
    		Thread.sleep(5000);
	    	
	    }
}
