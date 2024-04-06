package redBusAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// Test cases related to sorting for the cheapest pricing
public class sortCheapestBus {
	private WebDriver driver;

    public sortCheapestBus(WebDriver driver) {
        this.driver = driver;
    }

    public void execute() {

		// Wait for a brief moment for the page to refresh
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Locate the sorting element
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement sortingButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Fare']")));
        // Click on the sorting element to trigger sorting
        sortingButton.click();
    }

}
