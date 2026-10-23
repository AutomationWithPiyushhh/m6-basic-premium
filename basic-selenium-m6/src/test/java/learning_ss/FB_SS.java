package learning_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_SS {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.zomato.com/");
		
//		downcasting
		TakesScreenshot tks = (TakesScreenshot) driver;
		
//		take a screenshot
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("./errorShots/zom.png");
		
//		copy the source to destination
		FileHandler.copy(source, destination);
	
//		zomato, swiggy, fb, instagram
		
		Thread.sleep(2000);
		driver.quit();
	}
}
