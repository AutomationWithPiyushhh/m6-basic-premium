package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLineOfCode {
	public static void main(String[] args) {
//		ChromeDriver driver1 = new ChromeDriver(); // 80+ methods
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();
	
//		RemoteWebDriver driver1 = new ChromeDriver(); // 50+ methods
//		RemoteWebDriver driver2 = new EdgeDriver();
//		RemoteWebDriver driver3 = new FirefoxDriver();
	
//		WebDriver driver1 = new ChromeDriver(); // 50+ methods
//		WebDriver driver2 = new EdgeDriver();
//		WebDriver driver3 = new FirefoxDriver();
	
		WebDriver driver = new ChromeDriver(); // 13 methods
		/* webdriver is the type
		 * driver is the ref var 
		 * new is a keyword which will create random memory space
		 * in heap area
		 * CD() will do 3 jobs
		 * 1> it will launch the empty chrome browser
		 * 2> it will start the server
		 * 3> it will load, reg. and re-initialize the ns members
		*/		
				  driver = new EdgeDriver();
				  driver = new FirefoxDriver();
	
//		String str ; 
//		String str ; // re-declaration is not possible
//		str = "abc";
//		str = "xyz"; // re-init is possible
		
	}
}
