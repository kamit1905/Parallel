package com.app.sunbeam.Reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
	
	private static ThreadLocal<ExtentTest> threadLoad = new ThreadLocal<>();
	
	public static void setExtentTest(ExtentTest test) {
		threadLoad.set(test);
	}
	
	public static ExtentTest getExtentTest() {
		return threadLoad.get();
	}
	
}
