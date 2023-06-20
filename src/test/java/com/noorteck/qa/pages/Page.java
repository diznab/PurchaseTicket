package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;




public class Page {
	
	@FindBy(id= "inputName")
	WebElement firstNameField;
	
	@FindBy(id= "address")
	WebElement addressField;
	
	@FindBy(id= "city")
	WebElement cityField;
	
	@FindBy(id= "state")
	WebElement statesField;
	
	@FindBy(id= "zipCode")
	WebElement zipCodeField;
	
	@FindBy(id= "cardType")
	WebElement cardTypeDropdown;  //select
	
	@FindBy(id= "creditCardNumber")
	WebElement cardNumberField;
	
	@FindBy(id= "creditCardMonth")
	WebElement monthField;
	
	@FindBy(id= "creditCardYear")
	WebElement yearField;
	
	@FindBy(id= "nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy(id= "rememberMe")  //click
	WebElement remeberMeCheckBox;
	
	@FindBy(xpath="//input[@type='submit']")  //click
	WebElement purchaseFlight;
	
	@FindBy(xpath="//h1[text()='Thank you for your purchase today!']")  //getText
	WebElement messageField;
	
	public Page() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	
	//method
	public void enterFirstname(String firstName) {
		firstNameField.sendKeys(firstName);
		
	}
	
	public void enterAddress(String address) {
		addressField.sendKeys(address);
		
	}
	public void enterCity(String city) {
		cityField.sendKeys(city);
		
	}

	public void enterState(String state) {
		statesField.sendKeys(state);
		
	}
	public void enterZipCode(String zip) {
		zipCodeField.sendKeys(zip);
		
	}
	public void selectCardType(String cardType) {
		Select select=new Select(cardTypeDropdown);
		List<WebElement> options=select.getOptions();
		for(WebElement current: options) {
			String type=current.getText();
			if(type.equals(cardType)) {
				current.click();
			}
		}
		
		
	}
	public void enterCardNumber(String number) {
		cardNumberField.sendKeys(number);
		
	}
	public void enterMonth(String month) {
		monthField.sendKeys(month);
		
	}
	public void enteryear(String year) {
		yearField.sendKeys(year);
		
	}
	public void enternameOnCard(String name) {
		nameOnCardField.sendKeys(name);
		
	}
	public void checkRememberMe() {
		remeberMeCheckBox.click();
		
	}
	public void ClickPurchase() {
		purchaseFlight.click();
		
	}
	public void verifyMessage(String expMessage) throws Exception {
		String act=messageField.getText();
		if(act.equals(expMessage)) {
			System.out.println("passed");
		}else {
			throw new Exception("failed");
		}
		
	}
}
