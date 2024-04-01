package redBusAuto;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redBusAuto {
	
//	private static void explicitWait(WebDriver driver, WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        }
	 public static void showNotification(String title, String message) {
	        // Show a pop-up dialog 
	        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	    }
	 public static void testBusSearchFlow(WebDriver driver) throws InterruptedException {
	        // Test cases related to bus search flow
		 	//Enter journey start location
		 WebElement srcInput = driver.findElement(By.id("src"));
		 srcInput.sendKeys("Mumbai");
//	     explicitWait(driver, srcInput); // Wait for suggestions to load
		 Thread.sleep(2000);
		 srcInput.sendKeys(Keys.ENTER);
		 	//Enter journey destination location
		 WebElement destInput = driver.findElement(By.id("dest"));
		 destInput.sendKeys("Pune");
//         explicitWait(driver, destInput); // Wait for suggestions to load
		 Thread.sleep(2000);
         destInput.sendKeys(Keys.ENTER);
         try {
             Thread.sleep(5000); // Wait for 5 seconds
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
       }


	    public static void testCheapestPricingFilter(WebDriver driver) {
	        // Test cases related to sorting for the cheapest pricing

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


	    public static void testSeatAvailability(WebDriver driver) {
	    	
	    	 try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	        // Test cases related to checking for seat availability
	    	List<WebElement> busList = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color'][1]"));
	        if (!busList.isEmpty()) {
//	            busList.get(0).click();
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
                showNotification("Automation Complete", "You cannot book ticket");//notification if no seat available
            }
	        }
	        }
	   
	    public static void testPickupDropPoints(WebDriver driver) throws InterruptedException {
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


	    public static void testSelectedBusDetails(WebDriver driver) throws InterruptedException {
	        // Test cases related to verifying selected bus/seat details & proceeding to checkout
	    	System.out.println("Please Verify the Bus and Seat");
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//button[normalize-space()='Proceed to book']")).click();
	    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patni\\Downloads\\selenium-java-4.19.0\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		testBusSearchFlow(driver);
		
		testCheapestPricingFilter(driver);
		
        testSeatAvailability(driver);
        
        testPickupDropPoints(driver);
        
        testSelectedBusDetails(driver);
        
        driver.close();
        
        


	}

}
