package org.asserttypes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void tc1() {
	String s = "java";
			Assert.assertEquals(s, "Java", "error");
	System.out.println(s);

	}
	@Test
	private void tc2() {
	System.out.println("hi");

	}
//	@Test
//	private void tc3() {
//	
//
//	}
	

}
