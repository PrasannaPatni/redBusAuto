package redBusAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// Test cases related to checking for seat availability
public class checkSeatAvailability {
	private WebDriver driver;

    public checkSeatAvailability(WebDriver driver) {
        this.driver = driver;
    }

    public void execute() {
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

   	List<WebElement> busList = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color'][1]"));
       if (!busList.isEmpty()) {
//           busList.get(0).click();
       	WebElement seatAvailability = driver.findElement(By.xpath("(//div[@class='seat-left m-top-16'])[1]"));
           System.out.println("Seat Availability: " + seatAvailability.getText());
	        // Test cases related to booking the seat
   	int firstDigit = Integer.parseInt(seatAvailability.getText().substring(0, 1));
       	System.out.println(firstDigit);
       	if(firstDigit>0) {
       		try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       		driver.findElement(By.xpath("(//div[@class='button view-seats fr'][normalize-space()='View Seats'])[1]")).click();
       }else
       {
           showNotification d = new showNotification();
    	   d.showNotification("Automation Complete", "You cannot book ticket");//notification if no seat available
       }
       }
    }

}
