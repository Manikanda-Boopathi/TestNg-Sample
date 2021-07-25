 package org.pom;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitAdactinSearchPage extends LibGlobal {
	public JunitAdactinSearchPage() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(id="location")
		private WebElement hotellocation;
		@FindBy(id="hotels")
		private WebElement hotel;
		@FindBy(id="room_type")
		private WebElement roomType;
		@FindBy(id="room_nos")
		private WebElement roomNo;
		@FindBy(id="datepick_in")
		private WebElement indate;
		@FindBy(id="datepick_out")
		private WebElement outDate;
		@FindBy(id="adult_room")
		private WebElement noOfAdults;
		@FindBy(id="child_room")
		private WebElement noOfchildren;
		@FindBy(id="Submit")
		private WebElement submit;
		
		public WebElement getHotellocation() {
			return hotellocation;
		}
		public WebElement getHotel() {
			return hotel;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getRoomNo() {
			return roomNo;
		}
		public WebElement getIndate() {
			return indate;
		}
		public WebElement getOutDate() {
			return outDate;
		}
		public WebElement getNoOfAdults() {
			return noOfAdults;
		}
		public WebElement getNoOfchildren() {
			return noOfchildren;
		}
		public WebElement getSubmit() {
			return submit;
		}
		
		

}
