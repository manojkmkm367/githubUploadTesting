package org.Day3XpathGetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		WebElement topicOverview = driver.findElement(By.xpath("//span[text()='Overview']"));
		topicOverview.click();
		
Thread.sleep(500);
		WebElement overviewFirstTopic = driver.findElement(By.xpath("//div[@class='card-body']/p[1]"));
		System.out.println(overviewFirstTopic.getText());
		driver.quit();
	}

}
