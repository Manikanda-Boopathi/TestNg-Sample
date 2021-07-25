package org.grouping;


import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "@smoke")
	private void tc1() {
		
	System.out.println("tc1");
	
	}
	@Test(groups = "@sanity")
	private void tc2() {
		System.out.println("tc2");

	}
	@Test(groups = "@reg")
	private void tc3( ) {
		System.out.println("tc3");

	}
	@Test(groups = "@smoke")
	private void tc4() {
		System.out.println("tc4");

	}
	@Test(groups = "@sanity")
	private void tc5() {
		System.out.println("tc5");

	}
	@Test(groups = "@reg",dependsOnMethods = "tc1")
	private void tc6() {
		System.out.println("tc6");

	}

}
