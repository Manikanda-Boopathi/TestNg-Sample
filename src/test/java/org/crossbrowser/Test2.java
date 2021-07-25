package org.crossbrowser;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	private void tc05() {
		System.out.println("test5");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc6() {
		System.out.println("test6");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc7() {
		System.out.println("test7");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc8() {
		System.out.println("test8");
		System.out.println(Thread.currentThread().getId());
	}

}
