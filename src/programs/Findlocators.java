package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qa-practice.netlify.app/");
		
		driver.manage().window().maximize();
		//driver.close();
		Thread.sleep(3000);
		//driver.findElement(By.id("forms")).click();
		//driver.findElement(By.id("login")).click();
		driver.findElement(By.linkText("RV - Website")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Let's connect - LinkedIn")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Learn with RV - YouTube")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
