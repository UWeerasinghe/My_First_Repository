package My_Package;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import java.net.*;
//import java.io.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Class_10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		
		/*String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		String New_York_to_Chicago = driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();
		System.out.println(New_York_to_Chicago);
		//Thread.sleep(2000);
		driver.quit();*/
		
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		
		driver.findElement(By.id("last-name")).sendKeys("Smith");
		
		driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
		
		driver.findElement(By.id("radio-button-1")).click();
		
		driver.findElement(By.id("checkbox-1")).click();
		
		Select drpexp = new Select(driver.findElement(By.id("select-menu")));
		drpexp.selectByValue("2");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='btn btn-lg btn-primary']"))).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("12/31/2023");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("/html/body/div/form/div/div[7]/strong/label")).click();
		
		//Actions action = new Actions(driver);
		//action.moveByOffset(50, 0).build().perform();
		
		driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success']"))).getText();
		
		String expected = "The form was successfully submitted!";
		//String actual = driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
		
		if(actual.contentEquals(expected)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		//driver.close();
	}

}
