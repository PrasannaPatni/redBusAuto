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
		
		new busSearchFlow(driver).execute();
		
		new sortCheapestBus(driver).execute();
		
        new checkSeatAvailability(driver).execute();
        
        new selectPickupDropPoints(driver).execute();
        
        new verifyAndCheckout(driver).execute();
        
        driver.close();
        
	}

}
