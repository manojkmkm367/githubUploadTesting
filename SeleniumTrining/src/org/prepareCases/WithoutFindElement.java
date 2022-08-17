package org.prepareCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WithoutFindElement {
	public static WebElement q;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
				
//*************** ACCESS THE ACTIVE ELEMNT WHENEVER PAGE LOAD OR REFRESH********
		
//		driver.switchTo().activeElement().sendKeys("CSK \n");
//----------------------------------------------------------------------------------------------------		
		
		driver.navigate().to("https://www.flipkart.com/");
		PageFactory.initElements(driver,WithoutFindElement.class);
		q.sendKeys("csk \n");
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
