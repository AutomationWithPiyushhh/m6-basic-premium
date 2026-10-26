package learning_jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.zomato.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//		Navigate to the given fully qualified path
		jse.executeScript("window.location='https://www.zomato.com/'");
		
//		scrolling 
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(500);		
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(500);		
		jse.executeScript("window.scrollBy(0, -500)");
//		500 1000 -500 1500
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
