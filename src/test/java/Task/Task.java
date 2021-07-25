package Task;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task extends LibGlobal {
	WebElement m1price;
	WebElement m2price;
	WebElement m3price;
	WebElement m4price;
	WebElement m5price;
	WebElement m1name;
	WebElement m2name ;
	WebElement m3name ;
	WebElement m4name ;
	WebElement m5name ;
	@Test
	private void tc1() {
	
		LibGlobal global = new LibGlobal();
		Task task = new Task();
		global.getDriver("chrome");
		global.launchURL("https://www.amazon.in/");
		WebElement searchbox = global.findById("id", "twotabsearchtextbox");
		global.typeText(searchbox, "oneplus");
		global.findById("id", "nav-search-submit-button").click();
	m1name = global.findById("xpath",
				"//span[text()='OnePlus Nord CE 5G (Blue Void, 8GB RAM, 128GB Storage)']");
		global.getValueByText(m1name);
	 m1price = global.findById("xpath", "//span[text()='24,999']");
		global.getValueByText(m1price);
		 m2name = global.findById("xpath",
				"//span[text()='OnePlus Nord CE 5G (Charcoal Ink, 12GB RAM, 256GB Storage)']");
		global.getValueByText(m2name);
		 m2price = global.findById("xpath", "//span[text()='27,999']");
		global.getValueByText(m2price);
	 m3name = global.findById("xpath",
				"//span[text()='OnePlus 9R 5G (Lake Blue, 8GB RAM, 128GB Storage)']");
		global.getValueByText(m3name);
	 m3price = global.findById("xpath", "//span[text()='39,999']");
		global.getValueByText(m3price);
	 m4name = global.findById("xpath",
				"//span[text()='(Renewed) OnePlus Nord CE 5G (Blue Void, 8GB RAM, 128GB Storage)']");
		global.getValueByText(m4name);
	 m4price = global.findById("xpath", "//span[text()='24,990']");
		global.getValueByText(m4price);
		 m5name = global.findById("xpath",
				"//span[text()='OnePlus 9R 5G (Lake Blue, 12GB RAM, 256GB Storage)']");
		global.getValueByText(m5name);
		 m5price = global.findById("xpath", "//span[text()='43,999']");
		global.getValueByText(m5price);
		Map<WebElement, WebElement> map = new TreeMap<WebElement,WebElement>();
		map.put(m1price, m1name);
		map.put(m2price, m2name);
		map.put(m3price, m3name);
		map.put(m4price, m4name);
		map.put(m5price, m5name);
		Set<Entry<WebElement,WebElement>> entrySet = map.entrySet();
		for (Entry<WebElement, WebElement> sortedlist : entrySet) {
			System.out.println(sortedlist);
		}
	}

	

}
