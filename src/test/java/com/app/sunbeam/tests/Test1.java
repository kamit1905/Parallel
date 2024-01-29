package com.app.sunbeam.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.sunbeam.Pages.LoginPage;

public class Test1 extends BaseTest {
	
	@Test(enabled = true ,priority = 1)
	public void sample() {
		Assert.assertEquals("amit", "amit");
	}
	
	@Test(enabled = true ,priority = 2)
	public void sample1() {
		Assert.assertEquals("amol", "amol");
	}
	
	@Test(enabled = true ,priority = 3)
	public void sample2() {
		Assert.assertEquals("kishor", "kishor");
	}
	
	@Test(enabled=true,priority = 4)
	public void LoginTest() {
		LoginPage login = new LoginPage();
		login.EnterUserName("amit789@gmail.com");
		Assert.assertFalse(false);
		login.ClickOnNextButton();
	}

}
