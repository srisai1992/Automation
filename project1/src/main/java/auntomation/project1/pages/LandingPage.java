package auntomation.project1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		
	}
@FindBy(xpath="//*[@id='MainHeader_T404780FA008_Col04']/div/span/a") WebElement signin;
@FindBy(xpath="//*[@id='MainHeader_TF8AE1FD8008_Col03']/div/a")WebElement contactus;

public void clickSignIn() {
	signin.click();
}

public void clickContactUs() {
	contactus.click();
}


}

