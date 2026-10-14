package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/synchronization.html");
		driver.findElement(By.cssSelector("[onclick=\"startProcess('start')\"]")).click();
		driver.findElement(By.cssSelector("[onclick=\"startProcess('stop')\"]")).click();

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[text()='Remove']")).click(); // remove
		driver.findElement(By.xpath("//button[text()='Add']")).click(); // add
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
