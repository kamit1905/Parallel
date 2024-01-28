package com.app.sunbeam.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;


public class ExtentReport {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentTest test;
	
	public static void initReport() {
		extent = new ExtentReports();
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\test-output\\EDRMReport.html").viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD,ViewName.TEST}).apply();
		extent.attachReporter(htmlReporter);
		System.out.println(System.getProperty("user.dir")+"\\EDRMReport.html");
		
		htmlReporter.config().setDocumentTitle("EDM Automation Report");
		htmlReporter.config().setReportName("Regression run");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	public static void flushReports() {
		extent.flush();
	}
	
	public static void createTest(String testCaseName) {
		test = extent.createTest(testCaseName);
		ExtentManager.setExtentTest(test);
	}

}
