package org.WaitTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiffWaitOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	// implicit wait
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//-----------------------------------------------------------------------------------------------------------------------	
	// Explicit Wiait
	
//	WebDriverWait driverWait= new WebDriverWait(driver, Duration.ofSeconds(3));
//	WebElement txtfrom = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//	txtfrom.sendKeys("CBE");
//	
//	WebDriverWait wait= new WebDriverWait(driver , Duration.ofSeconds(10));
//	WebElement elementTEXT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//	elementTEXT.click();
//--------------------------------------------------------------------------------------------------------------
	
	//FluentWait 
	
	FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2))
			.ignoring(Exception.class);
	
	Object tempObj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	WebElement serchBox = (WebElement) tempObj;
	
// 	WebElement tempObj = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))); 
	
	serchBox.sendKeys("CBE");
	
	//---------------------------------------------------------------------------------------------------------	
	
	Thread.sleep(1000);
	driver.quit();		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
