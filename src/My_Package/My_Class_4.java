package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Class_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Interview\\\\Selenium\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*String baseUrl = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseUrl);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		
		driver.close();*/
		
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[type=\"button\" i]")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
	}

}
