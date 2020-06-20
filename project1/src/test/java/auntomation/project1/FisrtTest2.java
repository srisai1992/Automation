package auntomation.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FisrtTest2 {
	
	@Test
	public void browserintialization(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railwayspensions.co.uk/");
		
	
	}

	@Test
	public void logIn() {
		
	}
	@Test
	public void logout() {
	}
}
