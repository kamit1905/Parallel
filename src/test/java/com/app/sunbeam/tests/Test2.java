package com.app.sunbeam.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
	
	@Test(enabled = true ,priority = 1)
	public void getup() {
		Assert.assertEquals("Pune", "Pune");
	}
	
	@Test(enabled = true ,priority = 2)
	public void getup1Test() {
		Assert.assertEquals("Mumbai", "Mumbai");
		Assert.assertFalse(false);
	}

}
