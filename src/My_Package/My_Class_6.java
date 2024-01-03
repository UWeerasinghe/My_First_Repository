package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.*;

public class My_Class_6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Interview\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*String baseUrl = "https://demo.guru99.com/test/facebook.html";
		driver.get(baseUrl);
		driver.manage().window().maximize();*/
		
		/*try {
			WebElement myElement = driver.findElement(By.cssSelector("input#email"));
			myElement.sendKeys("snehaabhimani@gmail.com");
		}
		catch (NoSuchElementException nse){
			System.out.println(nse);
		}
		finally {
			System.out.println("Final block executed regardless of exception handled or not");
		}
		System.out.println("End of the code");*/
		
		
		
		/*try {
		driver.findElement(By.cssSelector("font:contains['Password:']")).sendKeys("abc");
		}
		catch (NoSuchElementException nse){
			System.out.println(nse);
		}
		driver.findElement(By.cssSelector("input.inputtext[tabindex='2']")).sendKeys("pqrs");*/
		
		
		
		//driver.close();
		
		//int i=0;
		/*for (int i=0;i<10;i++){
		System.out.println(i);
		}*/
		
		Set<String> hash_Set = new HashSet<String>();
		
		hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
		
		for(String i:hash_Set) {
			System.out.println(hash_Set);
			
		}
	}

}
