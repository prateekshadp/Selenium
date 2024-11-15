package QAfox;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		WebElement account = driver.findElement(By.xpath("//span[text()='My Account']"));
		account.click();
		WebElement register = driver.findElement(By.xpath("//a[@href=\'https://tutorialsninja.com/demo/index.php?route=account/register\']"));
		register.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@name=\'firstname\']"));
		fname.sendKeys("Sohan");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name=\'lastname\']"));
		lname.sendKeys("Gupta");
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\'email\']"));
		email.sendKeys("jkjoja@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name=\'telephone\']"));
		phone.sendKeys("08026542345");
		
		WebElement password = driver.findElement(By.xpath("//input[@name=\'password\']"));
		password.sendKeys("Sohangupta@123");
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name=\'confirm\']"));
		confirm.sendKeys("Sohangupta@123");
		
		WebElement agree = driver.findElement(By.xpath("//input[@name=\'agree\']"));
		agree.click();
		
		WebElement cont = driver.findElement(By.xpath("//input[@value=\'Continue\']"));
		cont.click();
		
		WebElement logout = driver.findElement(By.linkText("Logout"));
		if(logout.isDisplayed())
		{
			String expurl = "https://tutorialsninja.com/demo/index.php?route=account/success";
			String currenturl = driver.getCurrentUrl();
			
			if(expurl.equals(currenturl))
			{
				System.out.println("User logged in successfully");
				
				String exph1 = "Your Account Has Been Created!";
				WebElement h1 = driver.findElement(By.xpath("//div[@id=\'content\']/h1"));
				String actualh1 = h1.getText();
				//System.out.println(actualh1);
				if(exph1.equals(actualh1))
				{
					System.out.println("Proper heading displayed");
				}
				else
				{
					System.out.println("Proper heading not displayed");
				}
			}
			else
			{
				System.out.println("User not logged in");
			}
			
			
			
		}
		else
		{
			System.out.println("User did not login!");
		}
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		String ActualAcc = "My Account";
		String expAcc = driver.getTitle();
		if(ActualAcc.equals(expAcc))
		{
			System.out.println("User successfully navigated to Account page");
		}
		else
		{
			System.out.println("User could not navigate to Account page successfully");
		}
		
		driver.quit();
		
	}

}
