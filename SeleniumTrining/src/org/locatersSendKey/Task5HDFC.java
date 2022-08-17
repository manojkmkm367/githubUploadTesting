package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5HDFC {
	public static void main(String[] args) {		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement txtCustomerId = driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input"));
					txtCustomerId.sendKeys("MANOJKMKM");

// UNABLE TO SEND KEY TO CUSTOMERID
					
					
					
					
					
					
					
					
					
	}

}
