package org.Day4DebugErrors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement btnCreateAccount=driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		btnCreateAccount.click();
		Thread.sleep(2000);
		WebElement txtFirstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		txtFirstname.sendKeys("ManojFirstName");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
