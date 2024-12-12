package LetCode_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//h1[normalize-space()='Frame']"));
		System.out.println(frame.getText());
		
		driver.switchTo().frame("firstFr");
		WebElement subheading = driver.findElement(By.xpath("//h1[normalize-space()='Enter Details']"));
		System.out.println(subheading.getText());
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		firstname.sendKeys("Prateeksha");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("D P");
		WebElement message = driver.findElement(By.xpath("//p[@class='title has-text-info']"));
		System.out.println(message.getText());
		
		WebElement email = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(email);
		WebElement emailaddress = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		emailaddress.sendKeys("prati@gmail.com");
		Thread.sleep(3000);
		
		emailaddress.clear();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();

		lastname.clear();
		Thread.sleep(3000);
		
		firstname.clear();
		Thread.sleep(3000);	
		
		driver.quit();

	}

}
