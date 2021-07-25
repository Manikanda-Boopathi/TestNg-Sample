package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2 {
	@Test
	private void tc1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BOOPATHI\\eclipse-NewEclipseWorkspace\\1-TestNGsample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> molist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List li = new ArrayList();

		for (WebElement moblist : molist) {
			li.add(moblist.getText());
		}
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(li);
		for (Object newlist : set) {
			System.out.println(newlist); 
		}
//		int array[] = new int[set.size()];
//		Arrays.sort(array);
//		for (int d : array) {
//			System.out.println(d);
//		}
	
	}
}
/*
 * for (WebElement moblist : molist) { String text = moblist.getText(); }
 * 
 * String [] mob = new String[] }
 */