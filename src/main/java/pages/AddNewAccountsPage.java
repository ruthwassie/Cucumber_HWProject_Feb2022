package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountsPage {
	
	WebDriver driver; 
	
	public void AddNewAccountPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id = 'description']")
	WebElement Description;
	@FindBy(how =How.XPATH, using = "//input[@id = 'balance']")
	WebElement InitialBalance; 
	@FindBy(how =How.XPATH, using = "//input[@id = 'account_number']")
	WebElement AccountNumber; 
	@FindBy(how =How.XPATH, using = "//input[@id = 'contact_person']")
	WebElement ContactPerson; 
	@FindBy(how =How.XPATH, using = "//input[@id = 'contact_phone']")
	WebElement PhoneNumber; 
	@FindBy(how =How.XPATH, using = "//input[@id = 'ib_url']")
	WebElement InternetBankingURL; 
	@FindBy(how =How.XPATH, using = "//button[@class = 'btn btn-primary']")
	WebElement SubmitButton; 
	
	public void insertAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertDescription(String description) {
		Description.sendKeys(description);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void insertInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void insertAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void insertContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void insertPhoneNumber(String phoneNumber) {
		PhoneNumber.sendKeys(phoneNumber);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void insertinternetBankingURl(String url) {
		InternetBankingURL.sendKeys(url);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickSumbitButton() {
		SubmitButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	}


