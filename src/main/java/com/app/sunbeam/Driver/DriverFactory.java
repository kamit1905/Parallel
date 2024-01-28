package com.app.sunbeam.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;
	public static WebDriver getDriver(String browseName) {
		
		if(browseName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browseName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			
		}
		return driver;
	}

}
