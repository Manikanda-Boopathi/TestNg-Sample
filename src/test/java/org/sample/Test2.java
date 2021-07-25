package org.sample;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 3)
	private void tc5() {
	System.out.println("test5");

	}
	@Test(invocationCount = 5)
	private void tc6() {
		System.out.println("test6");

	}
	@Test(enabled = false,priority = 4)
	private void tc7() {
		System.out.println("test7");

	}
	@Test(priority = 1)
	private void tc8() {
		System.out.println("test8");

	}

}
