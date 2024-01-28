package com.app.sunbeam.WaitHelper;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

import com.app.sunbeam.Driver.DriverManager;

public class WaitHelper {
	
	public void setImplicitWait(long timeOut) {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}
	
	public WebDriverWait getWait(long timeOut) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeOut));
		return wait;
	}
	
	public void WaitForElementVisible(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void WaitForElementInvisible(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void WaitForElementToBeClickable(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void WaitForElementToBeSelected(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void WaitforAlert(long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public Wait<WebDriver> FluentWait(long timeOut,long poolingEvery) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(DriverManager.getDriver())
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(poolingEvery))
				.ignoring(NoSuchElementException.class);
		 return fluentWait;
	}
}
