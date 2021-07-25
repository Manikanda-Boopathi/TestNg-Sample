package org.asserttypes;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	private void tc1() {
	String s = "welcome";
	SoftAssert assert1 = new SoftAssert();
	assert1.assertEquals(s, "Welcome", "not matched");
	//Convert SoftAssert to HardAssert
	assert1.assertAll();
		System.out.println("tc1");
	}
	@Test
	private void tc2() {
	System.out.println("tc2");

	}
}
