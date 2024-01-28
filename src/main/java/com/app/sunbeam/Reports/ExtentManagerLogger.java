package com.app.sunbeam.Reports;

import com.app.sunbeam.Utils.ScreenShotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentManagerLogger {
	
	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);
	}
	
	public static void fail(String testCaseName,Throwable exception) {
		ExtentManager.getExtentTest().fail(testCaseName);
		ExtentManager.getExtentTest().fail(exception, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenshot()).build());	
	}
	
	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}

	//fail(testCaseName,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenshot()).build());
}
