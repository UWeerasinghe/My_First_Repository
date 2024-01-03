package My_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;

public class My_Class_5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Interview\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("snehaabhimani@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sneha@99");
		
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		
		driver.findElement(By.name("login")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		WebElement element = myWait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		
		driver.close();
	}

}
