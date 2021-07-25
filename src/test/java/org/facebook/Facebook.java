package org.facebook;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends LibGlobal{
	LibGlobal global;
	@Test
	private void driver() {
		 global = new LibGlobal();
			global.getDriver("chrome");
			global.launchURL("https://en-gb.facebook.com/");

	}
	@Parameters({"username"})
	@Test
	private void testCase(String s1) {
	
	WebElement username = global.findById("id", "email");
	global.typeText(username,s1);


	}
	@Parameters({"password"})
@Test
private void test2(String s2) {
	WebElement password = global.findById("id","pass");
	global.typeText(password, s2);

}
}
