package com.app.sunbeam.JavaScriptHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.app.sunbeam.Driver.DriverManager;

public class JavaScriptHelper {
	
	public Object ExecuteScript(String value) {
		JavascriptExecutor js = ((JavascriptExecutor)DriverManager.getDriver());
		return js.executeScript(value);
	}
	
	public Object ExecuteScript(String script,Object args) {
		JavascriptExecutor js = ((JavascriptExecutor)DriverManager.getDriver());
		return js.executeScript(script,args);
	}
	
	/*
	 * Scroll to top using javascript executor
	 */
	public void ScrollToTop() {
		ExecuteScript("Window.scrollTo(0,0)");
	}
	
	/*
	 * click using javascript executor
	 */
	public void ClickUsingJavaScriptExecutor(WebElement element) {
		ExecuteScript("arguments[0].click();", element);
	}
	
	/*
	 * sendkeys using javascript executor
	 */
	public void SendKeysUsingJavaScriptExecutor(WebElement element,String val) {
		ExecuteScript("arguments[0].value='"+val+"';",element);
	}
	
	/*
	 * It will scroll till webelement
	 */
	public void ScrollToElement(WebElement element) {
		ExecuteScript("arguments[0].scrollIntoView(true);", element);
	}
	
	/*
	 * It will scroll to element & it will click
	 */
	public void ScrollToElementAndClick(WebElement element) {
		try {
			ScrollToElement(element);
			Thread.sleep(2000);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * It will scroll to bottom
	 */
	public void ScrollToBottom() {
		ExecuteScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	/*
	 * It will clear text of webelement
	 */
	public void ClearTextUsingJavaScriptExecutor(WebElement element) {
		ExecuteScript("arguments[0].value='';", element);
	}
	
	/*
	 * It will open new tab in same browser
	 */
	public void OpenNewTabInBrowser() {
		ExecuteScript("Window.open()");
	}

}
