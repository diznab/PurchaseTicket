package com.noorteck.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.Page;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketStep {
	
	Page obj;
	@Given("user navigates to login page {string}")
	public void navigation(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver=new ChromeDriver();
		Thread.sleep(3000);
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants.driver.get(url);
		Thread.sleep(3000);
	    obj=new Page();
	}

	@When("User enters Full Name {string}")
	public void userEntersFullName(String firstName) {
	    
		obj.enterFirstname(firstName);
	  
	}

	@When("User enters Address {string}")
	public void userEntersAddress(String address) {
	    
	    obj.enterAddress(address);
	}

	@When("User enters City {string}")
	public void userEntersCity(String city) {
	    
	    obj.enterCity(city);
	}

	@When("User etners Zip Code {string}")
	public void userEtnersZipCode(String zipcode) {
	   obj.enterZipCode(zipcode); 
	    
	}

	@When("User selects Card type {string}")
	public void userSelectsCardType(String cardType) {
	    obj.selectCardType(cardType);
	    
	}

	@When("User enters Credit card number {string}")
	public void userEntersCreditCardNumber(String creditCardNumber) {
	    
	    obj.enterCardNumber(creditCardNumber);
	}

	@When("User enters month {string}")
	public void userEntersMonth(String month) {
	    
	    obj.enterMonth(month);
	}

	@When("User enters year {string}")
	public void userEntersYear(String year) {
	    obj.enteryear(year);
	    
	}

	@When("enters Name on card {string}")
	public void entersNameOnCard(String nameOnCard) {
	    obj.enternameOnCard(nameOnCard);
	    
	}
	@When("User Clicks on remember me")
	public void userClicksOnRememberMe() {
	   obj.checkRememberMe();
	}

	@When("User clicks on purchase flight")
	public void userClicksOnPurchaseFlight() {
	   
		obj.ClickPurchase();
	}

	@Then("User verifies success message {string}")
	public void userVerifiesSuccessMessage(String message) throws Exception {
	    
	    obj.verifyMessage(message);
	    Constants.driver.quit();
	}


}
