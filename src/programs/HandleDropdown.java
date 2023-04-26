package programs;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dropdowns")).click();
		WebElement QA_dropdown=driver.findElement(By.id("dropdown-menu"));
		Select select =new Select(QA_dropdown);
		Thread.sleep(4000);
		select.selectByVisibleText("India");
		Thread.sleep(4000);
		select.selectByVisibleText("Angola");
		//Thread.sleep(4000);
		//driver.findElement(By.id("multi-level-dropdown-btn")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		
		

	}
}
