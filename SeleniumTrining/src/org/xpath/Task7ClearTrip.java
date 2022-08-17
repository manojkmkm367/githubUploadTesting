package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7ClearTrip {

	public static void main(String[] args) {		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFromLocation = driver.findElement(By.xpath("//*[@title='From station']"));
		txtFromLocation.sendKeys("coimbatore");
		
		WebElement txtToLocation = driver.findElement(By.xpath("//*[@title='To station']"));
		txtToLocation.sendKeys("chennai");
		
		WebElement btnSearch = driver.findElement(By.xpath("//*[@type='submit']"));
		btnSearch.click();
		
// Key send sucessfully - Unable to choose dropDown

	}

}
