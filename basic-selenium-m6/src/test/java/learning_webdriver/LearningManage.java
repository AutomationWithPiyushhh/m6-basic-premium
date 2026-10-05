package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/");

		Window win = driver.manage().window();

		Thread.sleep(1000);
		win.minimize();

		Thread.sleep(1000);
		win.fullscreen();

		Dimension dim1 = win.getSize();
		System.out.println(dim1);
		System.out.println(dim1.getWidth());
		System.out.println(dim1.getHeight());

		win.setSize(new Dimension(700, 400));

		Point pt1 = win.getPosition();
		System.out.println(pt1);
		System.out.println(pt1.getX());
		System.out.println(pt1.getY());

		Thread.sleep(2000);

		win.setPosition(new Point(500, 500));

		Thread.sleep(3000);
		driver.quit();
	}
}
