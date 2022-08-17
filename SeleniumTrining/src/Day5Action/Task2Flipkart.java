package Day5Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		Actions actions = new Actions(driver);	
			
		//WebElement cls = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));	
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cls.click();			
				
		WebElement listElectronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));		
		actions.moveToElement(listElectronics).perform();
	
		WebElement listLaptopAndDesktop = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		actions.moveToElement(listLaptopAndDesktop).perform();
		
		WebElement listMoreLaptops= driver.findElement(By.xpath("//a[text()='Laptops']"));
		actions.moveToElement(listMoreLaptops).perform();
		actions.click().perform();
		
		WebElement pageContent = driver.findElement(By.xpath("//div[@class='_2uz0vJ']/div[1]/a/span"));
		System.out.println(pageContent.getText());  
		driver.quit();

	}

}
