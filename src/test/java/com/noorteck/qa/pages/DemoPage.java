package com.noorteck.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPage {
	
	
	public static void main(String[] args) throws Exception {
		setUp();
		Page pageobj=new Page();
		
		pageobj.enterFirstname("john");
		pageobj.enterAddress("4721 s Leisure");
		pageobj.enterCity("Gilbert");
		pageobj.enterState("az");
		pageobj.enterZipCode("57103");
		Thread.sleep(2000);
		pageobj.selectCardType("Visa");
		Thread.sleep(2000);
		pageobj.enterCardNumber("1111111");
		pageobj.enterMonth("11");
		pageobj.enteryear("2000");
		pageobj.enternameOnCard("john");
		pageobj.checkRememberMe();
		pageobj.ClickPurchase();
		pageobj.verifyMessage("Thank you for your purchase today!");
		
		
		
	}
	
	
	public static void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver=new ChromeDriver();
		Thread.sleep(3000);
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants.driver.get("https://blazedemo.com/purchase.php");
	}

}
