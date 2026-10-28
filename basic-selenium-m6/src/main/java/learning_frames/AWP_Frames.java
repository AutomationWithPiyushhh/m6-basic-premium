package learning_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.automationwithpiyush.com/frames.html");

		driver.switchTo().frame(3);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame_j");
		
		driver.findElement(By.id("secret_code")).sendKeys("admin");
//		get out of that frame
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		
//		get in to the frame
//		driver.switchTo().frame(1);
//		driver.switchTo().frame("frame_b");
		
		WebElement frameElement = driver.findElement(By.xpath("//span[text()='Outer Frame B']/following-sibling::iframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("critical_check")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
