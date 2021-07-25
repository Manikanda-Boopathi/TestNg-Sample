package org.pom;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitAdactinBookingPage extends LibGlobal{
	public JunitAdactinBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement frstName;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement addresss;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="cc_cvv")
	private WebElement ccvNum;
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	public WebElement getFrstName() {
		return frstName;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddresss() {
		return addresss;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcmonth() {
		return ccmonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCcvNum() {
		return ccvNum;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	

}
