package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class My_Class_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Interview\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.facebook.com/";
		String tagName;
		driver.get(baseUrl);
		
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		WebElement myElement1 = driver.findElement(By.id("email"));
		WebElement myElement2 = driver.findElement(By.id("pass"));
		WebElement myElement3 = driver.findElement(By.name("login"));
		
		myElement1.sendKeys("snehaabhimani@gmail.com");
		myElement2.sendKeys("Sneha@99");
		myElement3.click();
		
		//driver.close();
		System.exit(0);
	}
}
