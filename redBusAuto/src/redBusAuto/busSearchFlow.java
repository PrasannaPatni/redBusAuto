package redBusAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class busSearchFlow {
	private WebDriver driver;

    public busSearchFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void execute() throws InterruptedException {
	WebElement srcInput = driver.findElement(By.id("src"));
	 srcInput.sendKeys("Mumbai");
//    explicitWait(driver, srcInput); // Wait for suggestions to load
	 Thread.sleep(2000);
	 srcInput.sendKeys(Keys.ENTER);
	 	//Enter journey destination location
	 WebElement destInput = driver.findElement(By.id("dest"));
	 destInput.sendKeys("Pune");
//    explicitWait(driver, destInput); // Wait for suggestions to load
	 Thread.sleep(2000);
    destInput.sendKeys(Keys.ENTER);
    try {
        Thread.sleep(5000); // Wait for 5 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
}
