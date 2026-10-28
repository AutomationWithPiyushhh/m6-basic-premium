package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.zomato.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String url1 = "https://www.instagram.com/";
		String url2 = "https://www.facebook.com/";
		String url3 = "https://www.zomato.com/";
		
//		Navigate to the given fully qualified path
//		jse.executeScript("window.location=arguments[0]", url1);
//		Thread.sleep(1000);
//		jse.executeScript("window.location=arguments[0]", url2);
//		Thread.sleep(1000);
		jse.executeScript("window.location=arguments[0]", url3);
		
//		scrolling 
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(500);		
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(500);		
		jse.executeScript("window.scrollBy(0, -500)");
//		500 1000 -500 1500
		
//		scroll to element
		WebElement gold = driver.findElement(By.className("text-subHeading"));
		
		jse.executeScript("arguments[0].scrollIntoView(true)", gold);
		

		jse.executeScript("window.location=arguments[0]", "https://www.automationwithpiyush.com/locatorsSignin.html");
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement cb = driver.findElement(By.id("terms_checkbox"));
		
//		un.sendKeys("admin"); => value = 'admin'
//		cb.click();			  => click();

//		jse.executeScript("arguments[0].value='admin'", un);
		jse.executeScript("arguments[0].value=arguments[1]", un, "admin");
		jse.executeScript("arguments[0].click()", cb);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
