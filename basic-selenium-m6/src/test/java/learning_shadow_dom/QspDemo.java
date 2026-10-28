package learning_shadow_dom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
//		get the shadow host
		WebElement host = driver.findElement(By.xpath("//div[@class='my-3']/preceding-sibling::div"));
		
//		make it shadow root
		SearchContext shadowRoot = host.getShadowRoot();
		
//		perform the task	
//		WebElement un = driver.findElement(By.cssSelector("[placeholder='Enter your username']"));
		WebElement un = shadowRoot.findElement(By.cssSelector("[placeholder='Enter your username']"));
		un.sendKeys("admin");
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
