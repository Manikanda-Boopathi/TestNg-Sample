 package org.sample;

import org.testng.annotations.Test;

public class Test3 {
	@Test(priority = -1)
	private void tc9() {
	System.out.println("test09");

	}
	@Test
	private void tc10() {
		System.out.println("test10");

	}
	@Test(invocationCount = 3,priority = 3)
	private void tc11() {
		System.out.println("test11");

	}
	@Test(priority = -10)
	private void tc12() {
		System.out.println("test12");

	}

}
