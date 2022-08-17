package org.frameWork;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement txtSearchTextbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearchTextbox.sendKeys("samsung galaxy z flip",Keys.ENTER);	
		
		String mainWindow = driver.getWindowHandle();
		
			WebElement phone1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
			phone1.click();
			Thread.sleep(100);
						Set<String> allWindowsCtrlOne = driver.getWindowHandles();
						LinkedList<String> allWindowsListOne = new LinkedList<String>();
						allWindowsListOne.addAll(allWindowsCtrlOne);
		driver.switchTo().window(allWindowsListOne.get(1));
		
		WebElement btnAddToCart = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
		btnAddToCart.click();
		driver.switchTo().window(mainWindow);
		
//Phone 2		
		WebElement phone2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		phone2.click();
		Thread.sleep(100);
					Set<String> allWindowsCtrlTwo = driver.getWindowHandles();
					LinkedList<String> allWindowsListTwo = new LinkedList<String>();
					allWindowsListTwo.addAll(allWindowsCtrlTwo);
	driver.switchTo().window(allWindowsListTwo.get(2));
	
	WebElement btnAddToCartTwo = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
	btnAddToCartTwo.click();
	driver.switchTo().window(mainWindow);
	
//Phone 3
			
	WebElement phone3 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
	phone3.click();
	Thread.sleep(100);
				Set<String> allWindowsCtrl3 = driver.getWindowHandles();
				LinkedList<String> allWindowsList3 = new LinkedList<String>();
				allWindowsList3.addAll(allWindowsCtrl3);
driver.switchTo().window(allWindowsList3.get(3));
WebElement btnAddToCart3 = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
btnAddToCart3.click();
Thread.sleep(2000);
driver.switchTo().window(mainWindow);
driver.navigate().refresh();
WebElement totCard = driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
System.out.println( "Tot Product in Shopping Cart :"+ totCard.getText() );

driver.quit();
			
			
			
	}

}
