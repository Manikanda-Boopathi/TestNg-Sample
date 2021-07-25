package org.crossbrowser;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	private void tc9() {
		System.out.println("test9");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc10() {
		System.out.println("test10");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc11() {
		System.out.println("test11");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc12() {
		System.out.println("test12");
		System.out.println(Thread.currentThread().getId());
	}

}
