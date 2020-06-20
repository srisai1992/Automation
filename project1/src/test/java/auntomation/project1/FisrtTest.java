package auntomation.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import auntomation.project1.pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FisrtTest {
	
	@Test
	public void browserintialization(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railwayspensions.co.uk/");
		LandingPage lp=new LandingPage(driver);
		lp.clickSignIn();
		
	
	}

	@Test
	public void logIn() {
		
	}
	@Test
	public void logout() {
	}
}
