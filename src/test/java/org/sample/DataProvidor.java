package org.sample;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidor extends LibGlobal {
	@DataProvider(name="My data")
	public Object[][] getData() {
		return new Object[][] {
			{"RealmeXt"},{"MI tv"},{"dumbels"},{"realme data cable"},
			{"head phone"}
	};
	

}
	@Test(dataProvider = "My data")
	private void tc1(String s) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	LibGlobal global = new LibGlobal();
	global.findById("id", "twotabsearchtextbox").sendKeys(s);
	global.findById("id", "nav-search-submit-button").click();
	
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s);
//	driver.findElement(By.id("nav-search-submit-button")).click();

	}
}