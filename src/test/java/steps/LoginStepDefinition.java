package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddNewAccountsPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	
	LoginPage loginPage;
	DashboardPage dashboardPage; 
	AddNewAccountsPage addNewAccount; 
	
	@Before
	public void beforeEachMethod() {
		
		initDriver(); 
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		addNewAccount = PageFactory.initElements(driver, AddNewAccountsPage.class);
		
	}
	
	@Given("^User is on the TechFios login page$")
	public void user_is_on_the_TechFios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");

		 
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) {
		loginPage.enteruserName(userName);
		
	    
	}

	@When("^User  enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	    
	}

	@When("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() {
		loginPage.clickSignInButton();
	    
	}

	@When("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		loginPage.validateDashboardPage("Dashboard");
	    
	}

	@When("^User clicks on Bank and Cash Button$")
	public void user_clicks_on_Bank_and_Cash_Button() {
		dashboardPage.clickBankandCash();
		
	}

	@When("^User Clicks on New Account Button$")
	public void user_Clicks_on_New_Account_Button() {
		dashboardPage.clickNewAccount();
		
	    
	}

	@Then("^User Should Land on Accounts Page$")
	public void user_Should_Land_on_Accounts_Page() {
		dashboardPage.validateAccountPage("Accounts");
		
	   
	}

	@When("^User enters AccountTitle as \"([^\"]*)\" in account page$")
	public void user_enters_AccountTitle_as_in_account_page(String accountTitle) {
		int randomNum=generateRandomNumber();
		addNewAccount.insertAccountTitle(accountTitle + randomNum);
	    
	}

	@When("^User enters Description as \"([^\"]*)\"$")
	public void user_enters_Description_as(String description) {
		int randomNum=generateRandomNumber();
		addNewAccount.insertDescription(description + randomNum);
	    
	}

	@When("^User enters InitialBalance as \"([^\"]*)\"$")
	public void user_enters_InitialBalance_as(String intialBalance) {
		int randomNum=generateRandomNumber();
		addNewAccount.insertInitialBalance(intialBalance + randomNum);
	    
	}

	@When("^User enters AccountNumber as \"([^\"]*)\"$")
	public void user_enters_AccountNumber_as(String accountNumber) {
		int randomNum=generateRandomNumber();
	    addNewAccount.insertAccountNumber(accountNumber + randomNum);
	}

	@When("^User enters ContactPerson as \"([^\"]*)\"$")
	public void user_enters_ContactPerson_as(String contactPerson) {
		int randomNum=generateRandomNumber();
		addNewAccount.insertContactPerson(contactPerson + randomNum);
	    
	}

	@When("^User enters PhoneNumber as \"([^\"]*)\"$")
	public void user_enters_PhoneNumber_as(String phoneNumber) {
		int randomNum=generateRandomNumber();
		addNewAccount.insertPhoneNumber(phoneNumber + randomNum);
	    
	}

	@When("^User enters InternetBanking url as \"([^\"]*)\"$")
	public void user_enters_InternetBanking_url_as(String internetBankingurl) {
		addNewAccount.insertinternetBankingURl(internetBankingurl);
	    
	}

	@Then("^User clicks on SubmitButton$")
	public void user_clicks_on_SubmitButton() {
		addNewAccount.clickSumbitButton();
		
	    
	}
	
	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	
	
	
	
	
	
//	@Given("^User is on the techfios login page$")
//	public void user_is_on_the_techfios_login_page() {
//		initDriver();
//		driver.get("https://techfios.com/billing/?ng=login/");
//		
//	}
//	@When("^User enters the username as \"([^\"]*)\"$")
//	public void user_enter_the_username_as(String username) {
//		loginPage.enterUserName(username);
//		
//	}
//	@When("^User enters the password as \"([^\"]*)\"$")
//	public void user_enter_the_password_as(String password) {
//		loginPage.enterPassword(password);
//		
//	}
//	@And("^User clicks on \"([^\"]*)\"$")
//	public void user_clicks_on_login() {
//		loginPage.clickSignInButton();
//	}
//	
//	@Then("^User should land on Dashboard page$")
//	public void user_should_land_on_Dashboard_page() {
//		loginPage.validateDashboardPage("Dashboard");
//		
//	}
//	@And("^User clicks on\"([^\"]*)\"$")
//	public void user_clicks_on_BankandCash() {
//		dashboardPage.clickBankandCash();
//		dashboardPage.clickNewAccount();
//		
//	}
//	@Then("^User should land on Accounts page$")
//	public void user_should_land_on_accounts_page() {
//		dashboardPage.validateAccountPage("Accounts- iBilling");
//		
//	}
//	
//	@And("^User enters\"([^\"]*)\"in accounts page$")
//	public void user_enters_accountTitle_in_accounts_page(String data) {
//		int randomNum = generateRandomNumber(); 
//		addNewAccount.insertAccountTitle(data+randomNum);
//		addNewAccount.insertDescription(data+randomNum);
//		addNewAccount.insertInitialBalance(data);
//		addNewAccount.insertAccountNumber(data+randomNum);
//		addNewAccount.insertContactPerson(data+randomNum);
//		addNewAccount.insertPhoneNumber(data+randomNum);
//		addNewAccount.insertinternetBankingURl(data);
//			
//	}
//	@And("^User Clicks on SubmitButton$")
//	public void user_clicks_on_submitButton() {
//		addNewAccount.clickSumbitButton();
//		
//	}
//	@Then("^User should be able to validate account created successfully$")
//	public void user_should_be_able_to_validate_account_created_successfully() {
//		
//	}
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
//	
	
	
	
	
	
	
	//@And("^User enters\"([^\"]*)\"in accounts page$")
//	public void user_enters_accountTitle_in_accounts_page(String arg1) {
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//	@Given("^User is on the techfios login page$")
//	public void user_is_on_the_techfios_login_page() {
//		
//		drivers.get("https://techfios.com/billing/?ng=admin/");
//		
//
//	}
//
//	@When("^User enters the username as \"([^\"]*)\"$")
//	public void user_enters_the_username_as(String username) {
//		loginPage.enterUserName(username);
//		
//
//	}
//
//	@When("^User enters the password as \"([^\"]*)\"$")
//	public void user_enters_the_password_as(String password) {
//		loginPage.enterPassword(password);
//	}
//
//	@And("^User clicks on the Submit button$")
//	public void user_clicks_on_submit_button() {
//		loginPage.clickSignInButton();
//
//	}
//
//	@Then("^User should land on Dashboard page$")
//	public void user_should_land_on_Dashboard_page() {
//		loginPage.validateDashboardPage("Dashboard");
//
//	}
//
//	@Then("^User clicks on\"([^\"]*)\"$")
//	public void user_clicks_on() {
//
//	}
//
//	@Then("^User should land on Accounts page$")
//	public void user_should_land_on_Accounts_page() {
//
//	}
//
//	@And("^User enters\"([^\"]*)\"in accounts page$")
//	public void user_enters_accountTitle_in_accounts_page(String arg1) {
//
//	}
//	@And("^User enters\"([^\"]*)\"in accounts page$")
//	public void user_enters_description_in_accounts_page(String arg1) {
//
//	}
//
//	@Then("^User should be able to validate account created successfully$")
//	public void user_should_be_able_to_validate_account_created_successfully() {
//
//	}
//
//}
//	LoginPage loginPage; 
//	
//	public void beforeEachMethod() {
//		initDriver(); 
//		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); 
//	}
//	
//	@Given("^User is on the techfios login page$") 
//	public void user_is_on_the_techfios_login_Page() {
//		driver.get("https://techfios.com/billing/?ng=login/");
//	}
//
//	@When("^User enters the \"([^\"]*)\"$")
//	public void user_enters_the_user_name(String username) {
//		loginPage.enterUserName(username);
//	    
//	}
//
//	@When("^User enters the\"([^\"]*)\"$")
//	public void user_enters_the_password(String pasword) {
//	    loginPage.enterPassword(pasword);
//	}
//
//	@When("^User clicks on\"([^\"]*)\"$")
//	public void user_clicks_on_login() {
//		loginPage.clickSignInButton();
//	    
//	}
//
//	@Then("^User should land on Dashboard page$")
//	public void user_should_land_on_Dashboard_page() {
//	    
//	}
//}
//
////	@Then("^User clicks on\"([^\"]*)\"$")
////	public void user_clicks_on_bankCash() {
////	    
////	}
////	@Then("^User clicks on\"([^\"]*)\"$")
////	public void user_clicks_on_newAccount() {
////	    
////	}
////	@Then("^User should land on Accounts Page$") 
////	public void user_should_land_on_accounts_page() {
////		
////	}
////
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_accountTitle_in_accounts_page(String accountTitle)  {
////	    
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_description_in_accounts_page(String descritption)  {
////	 
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_intialBalance_in_accounts_page(String intialBalance) {
////	 
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_accountNumber_in_accounts_page(String accountNumber) {
////	
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_contactPerson_in_accounts_page(String contactPerson)  {
////	 
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_phoneNumber_in__accounts_page(String phoneNumber)  {
////	 
////	}
////	@Then("^User enters\"([^\"]*)\"in accounts page$")
////	public void user_enters_internetBankingURL_in_accounts_page(String internetBankingURl)  {
////	 
////	}
////
////	@Then("^User should be able to validate account created successfully$")
////	public void user_should_be_able_to_validate_account_created_successfully() {
////	    
////	}
////
////
////
////}
