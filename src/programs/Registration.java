package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
        
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("forms")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("firstName")).sendKeys("Nukala");
		driver.findElement(By.id("lastName")).sendKeys("VenkataRam");
		driver.findElement(By.id("phone")).sendKeys("9963226226");
		WebElement QA_dropdown=driver.findElement(By.id("countries_dropdown_menu"));
		Select select =new Select(QA_dropdown);
		select.selectByVisibleText("India");
		driver.findElement(By.id("emailAddress")).sendKeys("raam.nukala@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ram@226226");
		driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
		driver.findElement(By.id("registerBtn")).click();
		driver.close();
		

	}

}

