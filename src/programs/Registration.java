package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

System.out.println("this is the selenium change");
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.id("forms")).click();
	
		Thread.sleep(4000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Nukala");
		Thread.sleep(4000);
		driver.findElement(By.id("lastName")).sendKeys("VenkataRam");
		Thread.sleep(4000);
		driver.findElement(By.id("phone")).sendKeys("9963226226");
		Thread.sleep(4000);
		WebElement QA_dropdown=driver.findElement(By.id("countries_dropdown_menu"));
		Thread.sleep(4000);
		Select select =new Select(QA_dropdown);
		select.selectByVisibleText("India");
		Thread.sleep(4000);
		driver.findElement(By.id("emailAddress")).sendKeys("raam.nukala@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("Ram@226226");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("registerBtn")).click();
		Thread.sleep(4000);
		driver.close();
		//Tagname[@attribute='value']

	}

}

