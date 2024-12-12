package LetCode_AlertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("confirm")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("prompt")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		alert.sendKeys("Prateeksha");
		Thread.sleep(3000);
		alert.accept();
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("modern")).click();
		WebElement sweetalert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='title']")));
		System.out.println(sweetalert.getText());
		driver.findElement(By.xpath("//button[@class=\"modal-close is-large\"]")).click();
		
		driver.quit();
	
	}

}
