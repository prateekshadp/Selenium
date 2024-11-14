package OrangeHRM;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;


public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//a[@href=\'http://www.orangehrm.com\']")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for(String window1 : windowhandles)
		{
			System.out.println(window1);
		}
		
		driver.quit();		//Closes all the windows
		
		//driver.close();   Closes the window which WebDriver is currently focusing
		
	}

}
