package My_Package;
//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class My_Class_9 {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "C:\\Users\\weera\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		//driver.close();
		driver.switchTo().alert().accept();*/
		
		/*String baseUrl = "https://formy-project.herokuapp.com/switch-window";
		driver.get(baseUrl);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement new_tab = driver.findElement(By.id("new-tab-button"));
		new_tab.click();
		String original_window = driver.getWindowHandle();
		
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(original_window);*/
		//driver.close();
		
		String baseUrl = "https://formy-project.herokuapp.com/dragdrop";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.id("image"));
		WebElement ele2 = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(ele1, ele2).build().perform();
		//driver.close();
		}

}
