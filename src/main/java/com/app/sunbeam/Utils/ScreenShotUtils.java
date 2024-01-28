package com.app.sunbeam.Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.sunbeam.Driver.DriverManager;

public class ScreenShotUtils {
	
	public static String getScreenshot() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
