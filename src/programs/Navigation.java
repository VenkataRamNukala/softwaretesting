package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwaretesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://epaper.eenadu.net/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//driver.navigate().to("https://epaper.sakshi.com/");
		//System.out.println(driver.getTitle());
		driver.close();


	}

}
