package learning_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/"); // fully qualified path => InvalidArgumentException
		
		String title = driver.getTitle(); // Get the title of the current page.
		System.out.println(title);
		
		String url = driver.getCurrentUrl(); // get the url of the current page
		System.out.println(url);
		
//		String sourceCode = driver.getPageSource(); // get the source code of the current page
//		System.out.println(sourceCode); 
		
		Thread.sleep(1000);

		Navigation nav = driver.navigate();
		
		nav.to("https://www.facebook.com/");
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
//		driver.close();
		driver.quit();
		
//		driver.navigate().refresh(); NoSuchSessionException

		
		
	}
}
