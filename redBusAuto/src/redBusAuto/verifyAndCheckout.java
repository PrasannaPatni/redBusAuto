package redBusAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Test cases related to verifying selected bus/seat details & proceeding to checkout
public class verifyAndCheckout {
	private WebDriver driver;

    public verifyAndCheckout(WebDriver driver) {
        this.driver = driver;
    }

    public void execute() throws InterruptedException {
    	System.out.println("Please Verify the Bus and Seat");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Proceed to book']")).click();
    }

}
