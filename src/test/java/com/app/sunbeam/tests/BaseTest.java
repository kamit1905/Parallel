package com.app.sunbeam.tests;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

import com.app.sunbeam.Driver.*;
import com.app.sunbeam.Reports.ExtentManagerLogger;
import com.app.sunbeam.Reports.ExtentReport;
import com.app.sunbeam.Utils.ScreenShotUtils;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest {
	public static ExtentTest test;
	
	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReport();
	}
	
	@BeforeClass
	public void setUp() {
		Driver.initDriver();
	}
	
	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushReports();
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		ExtentReport.createTest(method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			ExtentManagerLogger.fail(result.getName(),result.getThrowable());
		}
	}
	
//	@AfterSuite
//	public void qui() {
//		DriverManager.getDriver().quit();
//	}
	

}
