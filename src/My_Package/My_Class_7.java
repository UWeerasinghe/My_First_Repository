package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.List;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class My_Class_7 {

	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/ajax.html";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id=\"no\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
		
		List<WebElement> myList = driver.findElements(By.name("name"));
		
		
		int size = myList.size();
		for(int i=0;i<size;i++) {
		System.out.println(myList.get(i).getAttribute("value"));
		}
		driver.close();*/
	
	
	
	
	/*public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		WebElement homeColor = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(homeLink).build();
		
		String beforeColor = homeColor.getCssValue("background-color");
		System.out.println("Before hover: "+beforeColor);
		
		mouseOverHome.perform();
		
		String afterColor = homeColor.getCssValue("background-color");
		System.out.println("After hover: "+afterColor);
		
		//driver.close();*/
	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		WebElement myElement = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action action = builder.moveToElement(myElement).click().keyDown(Keys.SHIFT).sendKeys("myemail").keyUp(Keys.SHIFT).doubleClick(myElement).contextClick().build();
		
		action.perform();
	}

}
