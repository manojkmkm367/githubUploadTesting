package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrBranchPassing {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(500);
		String url="https://manojgmail:password@omrbranch.com/api/documentation";
		//String url2="http://rajkumar:myPassword@www.softwaretestingmaterial.com";
		driver.get(url);
		
		//Alert alert1 = driver.switchTo().alert();
	//alert1.accept();

	}

}
