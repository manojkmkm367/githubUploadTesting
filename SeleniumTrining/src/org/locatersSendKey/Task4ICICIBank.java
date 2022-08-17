package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task4ICICIBank {
	public static void main(String[] args) {			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUserId = driver.findElement(By.name("DUMMY1"));
					txtUserId.sendKeys("MANOJKMKM");
		WebElement txtPassword = driver.findElement(By.id("dummypwd2"));
		txtPassword.sendKeys("Pass@123");
// UNABLE TO ENTER PASSWORD Error : ***** element not interactable *******
		
		
		
		
		
		
		
		
		
	}

}
