package p_backup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/frames.html");
		
		// Patient Admission
		driver.switchTo().frame("frame_a");
		driver.findElement(By.id("name_input")).sendKeys("admin");
		
		driver.switchTo().parentFrame();
		
		// Triage Checklist
		driver.switchTo().frame(1);
		WebElement elmt1 = driver.findElement(By.cssSelector("input[type='checkbox']"));
		elmt1.click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		WebElement elmt2 = driver.findElement(By.cssSelector("input[value='A+']"));
		elmt2.click();

		
		Thread.sleep(3000);
		driver.quit();
	}
}
