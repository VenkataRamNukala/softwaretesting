package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.id("forms")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("raam.nukala@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("Ram@226226");
		Thread.sleep(4000);
		driver.findElement(By.id("submitLoginBtn")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
