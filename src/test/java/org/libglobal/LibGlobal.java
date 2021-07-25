package org.libglobal;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;

	// 1.Browser Initialisation
	public void getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\BOOPATHI\\eclipse-workspace\\BaseClassCreation\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\BOOPATHI\\eclipse-workspace\\BaseClassCreation\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\BOOPATHI\\eclipse-workspace\\BaseClassCreation\\driver\\edgedriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("invalid browser name");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// 2.launch URL
	// We dont need to pass driver as argument bcz we declare driver as instance
	// variable
	// If we declare driver as Instance variable we can access all over the class
	public void launchURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 3.passing Data with sendkeys
	// webelement will change based on project so we dont pass as Instance
	// variable,everytime we pass
	// instance variable as arguments.
	public void typeText(WebElement element, String data) {
		try {
			if (element.isDisplayed() && element.isEnabled())
				element.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 4.Buttonclick
	public void buttonClick(WebElement element) {
		try {
			if (element.isDisplayed())
				element.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 5.Element find
	public WebElement findById(String findBy, String id) {
		WebElement findElement = null;
		try {
			if (findBy.equalsIgnoreCase("Id")) {
				findElement = driver.findElement(By.id(id));
			} else if (findBy.equalsIgnoreCase("xpath")) {
				findElement = driver.findElement(By.xpath(id));
			} else if (findBy.equalsIgnoreCase("classname")) {
				findElement = driver.findElement(By.className(id));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return findElement;
	}

	// 6.More than one element find
	public List<WebElement> findElements(String id) {
		List<WebElement> findElements = null;
		try {
			findElements = driver.findElements(By.id(id));
		} catch (Exception e) {
		System.out.println(e);
		}
		return findElements;

	}

	// 7.GetText from webpage
	public String getValueByText(WebElement element) {
		String text = null;
		try {
//			if (element.isDisplayed() && element.isSelected())
				text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println(e);
		}
		return text;

	}

	// 8.Get Attribute
	public String getvalueByAttribute(WebElement element) {
		String attribute = null;
		try {
			if (element.isDisplayed() && element.isEnabled()) {
				attribute = element.getAttribute("value");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return attribute;

	}

	// 9.Actions - Mouseover
	public void mouseOver(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 10.ACTIONS - drag and drop
	public void dragAndDrop(WebElement source, WebElement destination) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, destination).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 11.ACTIONS -RightClick
	public void rightClick(WebElement target) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(target).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 12.ACTIONS - Double Click
	public void doubleClick(WebElement target) {
		try {
			Actions ac = new Actions(driver);
			ac.doubleClick(target).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 13-a.ROBOT - keyboard action Press and release for DOWN Arrow
	public void keyPressAndRelease(int noOfTimes) {
		try {
			Robot ro = new Robot();
			for (int i = 0; i <= noOfTimes; i++) {
				ro.keyPress(KeyEvent.VK_DOWN);
				ro.keyRelease(KeyEvent.VK_DOWN);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 13-b.ROBOT - keyboard action Press and release for DOWN Arrow
	public void keyEnter() {
		try {
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 14.ALERT - accept
	public void accept(WebElement element) {
		Alert alert = null;
		try {
			if (element.isDisplayed())
				alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 15.ALERT - Dismiss
	public void dismiss(WebElement element) {
		Alert alert = null;
		try {
			if (element.isDisplayed())
				alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 16.ALERT - sendkeys
	public void alertTypeText(WebElement element, String data) {
		Alert alert = null;
		try {
			if (element.isDisplayed() && element.isEnabled())
				alert = driver.switchTo().alert();
			alert.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 17.ALERT - GET TEXT FROM ALERT
	public String alertGetText(WebElement element) {
		Alert alert = null;
		String text = null;
		try {
			if (element.isDisplayed() && element.isEnabled())
				alert = driver.switchTo().alert();
			text = alert.getText();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println(e);
		}
		return text;
	}

	// 18.TAKE SCREENSHOT
	public void screenshot(String pathname, File srcFile, File destFile) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			ts.getScreenshotAs(OutputType.FILE);
			File file = new File(pathname);
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 19-a. Switching Frame by index
	public void switchFrameByIndex(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 19-b)SwithFrameById
	public void switchFrameById(String id) {
		try {
			driver.switchTo().frame(id);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 19-c)SwithFrameByName
	public void switchFrameByName(String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 19-d)SwithFrameByWebelement
	public void switchFrameByElement(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 19-e)SwithFrameToParentframe
	public void switchFrameToParentFrame() {
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 19-f)SwithFrameDefaultContent
	public void switchFrameToDefaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 20.JAVA SCRIPT EXECUTOR - set value
	public void jsSetAttribute(WebElement element, String data) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 21.JAVA SCRIPT EXECUTOR - click
	public void jsClick(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 22.JAVA SCRIPT EXECUTOR - get attribute value
	public String jsGetAttribute(WebElement element) {
		String value = null;
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object javaScript = js.executeScript("return arguments[0].getAttribute('value')", element);
			value = (String) javaScript;
			System.out.println(value);
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;

	}

	// 23.JAVA SCRIPT EXECUTOR - scrollUp
	public void jsScrollUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(False)", element);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 24.JAVA SCRIPT EXECUTOR - scrollDown
	public void jsScrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(True)", element);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 25.DropDown select by index
	public void dropDownSelectByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 26.dropDown select by value
	public void dropDownSelectByValue(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.deselectByValue(value);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 27.dropDown select by visible text
	public void dropDownSelectByVisibleText(WebElement element, String visibletext) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(visibletext);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 28.DropDown get options
	public String dropDownGetOptions(WebElement element) {
		String text = null;
		try {
			Select select = new Select(element);
			List<WebElement> optionss = select.getOptions();
			for (WebElement options : optionss) {
				text = options.getText();
				System.out.println(text);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return text;

	}

	// 29.Get all Selected Options
	public String dropDownAllSelectedOptions(WebElement element) {
		String AllOptions = null;
		try {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				AllOptions = webElement.getText();
				System.out.println(AllOptions);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return AllOptions;

	}

	// 30-a.DropDownDeselectAll
	public void dropDownDeselectAll(WebElement element) {
		try {
			Select select = new Select(element);
			select.deselectAll();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 30-b.DropDownDeselectByIndex
	public void dropDownDeselectByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 30-c.DropDownDeselectByValue
	public void dropDownDeselectByValue(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.deselectByValue(value);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 30-d.DropDownDeselectByVisibleText
	public void dropDownDeselectByVisibleText(WebElement element, String VisibleText) {
		try {
			Select select = new Select(element);
			select.deselectByVisibleText(VisibleText);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
 
	// 31.Get current window Id
	public String getCurrentWindowId() {
		String windowHandle = null;
		try {
			windowHandle = driver.getWindowHandle();
			System.out.println("Current Window ID id" + windowHandle);
		} catch (Exception e) {
			System.out.println(e);
		}
		return windowHandle;

	}

	// 32.Get All Window Id
	public Set<String> getAllWindowId() {
		Set<String> windowHandles = null;
		try {
			windowHandles = driver.getWindowHandles();
			System.out.println("All Window Id:" + windowHandles);

		} catch (Exception e) {
			System.out.println(e);
		}
		return windowHandles;

	}

	// 33.swithching Windows Methods
	public void windowSwitchById(int windowIndex) {
		try {
			Set<String> all = driver.getWindowHandles();
			List<String> l = new ArrayList();
			l.addAll(all);
			driver.switchTo().window(l.get(windowIndex));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// 34.Getting/read data from excel
	public String getDataFromExcel(String pathName, String sheetName, int rowNo, int cellNo) {
		String value = null;
		try {
			File file = new File(pathName);
			FileInputStream stream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
				value = date.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}

	// 35.Set/Write data in Excel with new sheet
	public void writeDataToExcelNewSheet(String pathname, String sheetName, int rowNo, int cellNo, String value) {
		try {
			File file = new File(pathname);
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook();
			Sheet sheet = book.createSheet(sheetName);
			Row row = sheet.createRow(rowNo);
			Cell cell = row.createCell(cellNo);
			cell.setCellValue(value);
			FileOutputStream outputStream = new FileOutputStream(file);
			book.write(outputStream);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//		//36.Set/Write data in Excel
//		public void writeDataToExcel(String pathname,String sheetName, int rowNo, int cellNo,String value) {
//			
//			try {
//				File file = new File(pathname);
//				FileInputStream stream = new FileInputStream(file);
//				Workbook book = new XSSFWorkbook();
//				Sheet sheet = book.getSheet(sheetName);
//				Row row = sheet.createRow(rowNo);
//				Cell cell = row.createCell(cellNo);
//				cell.setCellValue(value);
//				FileOutputStream outputStream = new FileOutputStream(file);
//				book.write(outputStream);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		
//
//	}
}
// driver.close();
// driver.equals(obj);
// driver.findElement(arg0);
// driver.findElements(arg0);
// driver.getCurrentUrl();
// driver.getPageSource();
// driver.getTitle();
// driver.getWindowHandle();
// driver.getWindowHandles();
// driver.hashCode();
// driver.manage();
// driver.navigate();
// driver.quit();
// driver.switchTo();
// driver.wait();
// element.clear();
// element.getAttribute(arg0)
// element.equals(obj)
// element.findElement(arg0)
// element.findElements(arg0)
// element.getClass()
// element.getSize()
// element.getCssValue(arg0)
// element.getLocation()
// element.getTagName()
// element.getText()
// element.hashCode()
// element.isDisplayed()
// element.isEnabled()
// element.isSelected()
// element.submit();
//
// element.wait();


