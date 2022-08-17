package org.xpath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Task6RedBus {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		TakesScreenshot  scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("C:\\Users\\dell\\Pictures\\Screenshots\\eclip\\src.jpg");
		//Copy file at destination
		

		FileUtils.copyFile(SrcFile, DestFile);
		
		WebElement btnsignUp = driver.findElement(By.xpath("//*[@id='sign-in-icon-down']"));
		btnsignUp.clear();	


	}

}
