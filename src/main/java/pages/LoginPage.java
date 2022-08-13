package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	} 

	
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement userName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password; 
	@FindBy (how = How.XPATH, using = "//button[@name = 'login']")
	WebElement SignInButton; 
	@FindBy (how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement dashboardPage; 
	
	//Methods to interact with the elements 
	public void enteruserName(String username) {
		userName.sendKeys(username);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSignInButton( ) {
		SignInButton.click();;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void validateDashboardPage(String validationText) {
		Assert.assertEquals("Page is not found", validationText, dashboardPage.getText());
	}
	
	/*public String getPageTitle() {
		return driver.getTitle(); 
	}*/
	
	


}