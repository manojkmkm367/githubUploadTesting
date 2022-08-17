package org.Alert;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.Division;

public class DemoAutomationTestPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		 driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement btnAlertWithText = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnAlertWithText.click();
		
		WebElement  btnAlartButton= driver.findElement(By.xpath("//div[@id='Textbox']/button"));
		btnAlartButton.click();
		
		Alert Newalert1 = driver.switchTo().alert();
	
		Newalert1.sendKeys(" Friends ");
		Newalert1.accept();
		
		WebElement txtBox= driver.findElement(By.xpath("//p[@id='demo1']"));
		String content = txtBox.getText();
		System.out.println(content);
	
		driver.quit();
		
		

	}

}
