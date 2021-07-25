package org.sample;

import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = 3)
	private void tc0() {
		System.out.println("test1");
	
	}

	@Test(priority = 5)
	private void tc1() {
		System.out.println("test2");
	
	}

	@Test(priority = 2)
	private void tc2() {
		System.out.println("test3");

	}

	@Test(priority = 1)
	private void tc3() {
		System.out.println("test4");

	}

}
