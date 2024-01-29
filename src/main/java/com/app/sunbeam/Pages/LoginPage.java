package com.app.sunbeam.Pages;

import org.openqa.selenium.By;

import com.app.sunbeam.Driver.DriverManager;
import com.app.sunbeam.Reports.ExtentManager;
import com.app.sunbeam.Reports.ExtentManagerLogger;

public class LoginPage {
	
	By userName = By.xpath("//input[@type='email']");
	By nextBtn = By.xpath("//span[text()='Next']/ancestor::div[1]");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[text()=' Login ']");
	
	
	public void EnterUserName(String uname) {
		ExtentManagerLogger.info("Entering userName as "+uname);
		DriverManager.getDriver().findElement(userName).sendKeys(uname);
	}
	
	public void ClickOnNextButton() {
		ExtentManagerLogger.info("Clicking on next button");
		DriverManager.getDriver().findElement(nextBtn).click();
	}
	
	public void EnterPassword(String userPassword) {
		ExtentManagerLogger.info("Entering password as "+userPassword);
		DriverManager.getDriver().findElement(password).sendKeys(userPassword);
	}
	
	public void ClickOnSignInBtn() {
		ExtentManagerLogger.info("Clicking on sign in button ");
		DriverManager.getDriver().findElement(loginBtn).click();
	}

}
