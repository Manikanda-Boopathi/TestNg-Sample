package org.crossbrowser;

import org.libglobal.LibGlobal;
import org.testng.annotations.Test;

public class Test1 extends LibGlobal {
	LibGlobal global ;
	@Test
	private void tc0() {
		 global = new LibGlobal();
		global.getDriver("chrome");
		global.launchURL("https://en-gb.facebook.com/");
//		System.out.println("test1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc1() {
		global.getDriver("firefox");
		global.launchURL("https://en-gb.facebook.com/");
//		System.out.println("test2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		global.getDriver("chrome");
		global.launchURL("https://en-gb.facebook.com/");
//		System.out.println("test3");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		global.getDriver("chrome");
		global.launchURL("https://en-gb.facebook.com/");
//		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
	}

}
