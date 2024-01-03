package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class My_Class_8 {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*String MTours = "https://demo.guru99.com/test/newtours/register.php";
		driver.get(MTours);
		driver.manage().window().maximize();
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		drpCountry.selectByVisibleText("ANTARCTICA");
		
		String fruitUrl = "http://jsbin.com/osebed/2";
		driver.get(fruitUrl);
		
		Select drpFruit = new Select(driver.findElement(By.id("fruits")));
		drpFruit.selectByVisibleText("Banana");
		drpFruit.selectByIndex(2);
		drpFruit.selectByValue("apple");
		
		//driver.close();*/
		
		
		
		/*String baseUrl = "https://demo.guru99.com/test/upload/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\Interview\\Selenium\\Selenium Web Driver\\TEST Document.docx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();*/
		
		
		
		/*String baseUrl = "https://demo.guru99.com/test/yahoo.html";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("messenger-download")).click();
		System.out.println("Done");*/
		
		
		String baseUrl = "https://demo.guru99.com/test/yahoo.html";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		WebElement btnDownload = driver.findElement(By.id("messenger-download"));
		//String link = btnDownload.getAttribute("href");
		//String []execString = {"cmd", "c/", "wget", "-P", "D:", link};
		//String execString = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate" +link;
		
		try {
			//@SuppressWarnings("deprecation")
			Process exec = Runtime.getRuntime().exec("cmd /c C:\\\\Wget\\\\wget.exe -P D: --no-check-certificate https://demo.guru99.com/selenium/msgr11us.exe");
			//System.out.println("Test 1");
			int exitVal = exec.waitFor();
			//int exitVal = exec.exitValue();
			System.out.println("Exit Value: "+exitVal);
		}
		catch (InterruptedException | IOException ioe){
			System.out.println(ioe.toString());
		}
	}

}
