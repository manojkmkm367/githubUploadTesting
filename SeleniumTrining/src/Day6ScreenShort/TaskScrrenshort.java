package Day6ScreenShort;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskScrrenshort {
	 WebDriver driver;
	
	
	public static void takesc(WebDriver driver) throws IOException {
		TakesScreenshot  scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("C:\\Users\\dell\\Pictures\\Screenshots\\eclip\\takesSrc11082.jpg");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		// Other Option
		FileHandler.copy(SrcFile, DestFile);

	}
	
	
	private static void ssUsingRobot(WebDriver driver) throws AWTException, IOException {
		
		Robot robot = new Robot();
		
		//Dimension diam = new Dimension(1300, 900);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage screenImg = robot.createScreenCapture(rectangle);
		File fileLoc = new File("C:\\\\Users\\\\dell\\\\Pictures\\\\Screenshots\\\\eclip\\\\robotsrc11082.jpg");
		ImageIO.write(screenImg, "jpg", fileLoc);
		
		

	}
	

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		takesc(driver);
		ssUsingRobot(driver);
		
		driver.quit();
		
		
		
		
		Robot robot= new Robot();
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Rectangle rectangle = new Rectangle(screenSize);
		 BufferedImage bufferImg = robot.createScreenCapture(rectangle);
		File desfile = new File("C:\\Users\\dell\\Pictures\\Screenshots\\eclip\\bufimg1.jpg");
		ImageIO.write(bufferImg,"jpg", desfile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
