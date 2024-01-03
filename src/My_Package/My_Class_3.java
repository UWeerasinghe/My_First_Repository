package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class My_Class_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Interview\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.allure.com/story/best-of-beauty-skin-care-product-winners-2023";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		WebElement myElement = driver.findElement(By.linkText("cleansers"));
		myElement.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(myElement).click().perform();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String actualUrl = "https://www.allure.com/gallery/best-facial-cleanser";
		if (currentUrl.contentEquals(actualUrl)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//driver.close();
		driver.quit();
	}
}
