package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class DashboardPage {
	
	WebDriver driver; 
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankandCash; 
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	WebElement NewAccount; 
	@FindBy(how = How.XPATH, using = "//h2[text()=' Accounts ']")
	WebElement AccountsPage; 
	
	public void clickBankandCash() {
		BankandCash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickNewAccount() {
		NewAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
	
	public void validateAccountPage(String validationText) {
		Assert.assertEquals("page is not found", validationText, AccountsPage.getText()); ;
		
	}
	

}
	