package Maven.PhoneWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneWebsite {

	
	
		
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\System 1\\Documents\\Selenium_Traning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(1000);
		List<WebElement> a=driver.findElements(By.cssSelector("a"));
		System.out.println(a.size());
		
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("h4[class="card-title"] a")).click();
			Thread.sleep(1000);
		  driver.findElement(By.xpath("a[class="btn btn-success btn-lg"]")).click();
		 // driver.switchTo().alert().accept();
			  
			 
		
		
	}

}
