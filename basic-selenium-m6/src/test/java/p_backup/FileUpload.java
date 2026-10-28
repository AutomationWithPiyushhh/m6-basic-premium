package p_backup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[data-val='exp']")).click();
		
		String path  = "C:\\Users\\User\\OneDrive\\Desktop\\WindowHandle.pdf";
		
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		resume.sendKeys(path);
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
