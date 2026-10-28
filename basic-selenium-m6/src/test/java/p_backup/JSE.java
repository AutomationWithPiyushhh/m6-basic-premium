package p_backup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String url1 = "https://www.instagram.com/";
		String url2 = "https://www.facebook.com/";
		String url3 = "https://www.zomato.com/";
		
//		String fqp = "https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html";
//		jse.executeScript("window.location='"+ fqp + "'");
		
		jse.executeScript("window.location=arguments[0]", url3);
		Thread.sleep(1000);
//		jse.executeScript("window.location=arguments[0]", url1);
//		Thread.sleep(1000);
//		jse.executeScript("window.location=arguments[0]", url2);

//		jse.executeScript("window.scrollBy(0, 500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollBy(0, 500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollBy(0, 500)");
//		Thread.sleep(500);
		
		WebElement blinkit = driver.findElement(By.cssSelector("[href='https://www.blinkit.com']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", blinkit);
		
//		WebElement element = driver.findElement(By.id("abc"));
////		element.click();
//		jse.executeScript("arguments[0].click()", element);
//		
////		element.sendKeys("admin");
//		jse.executeScript("arguments[0].value='admin'", element);
		
		jse.executeScript("window.location=arguments[0]", "https://www.automationwithpiyush.com/locatorsSignin.html");
		
		WebElement un = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].value='admin'",un);
		
		WebElement cb = driver.findElement(By.id("terms_checkbox"));
		jse.executeScript("arguments[0].click()",cb);
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
