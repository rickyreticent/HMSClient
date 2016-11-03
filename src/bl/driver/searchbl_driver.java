package bl.driver;

import bl.implementation.searchbl;
import bl.stub.searchbl_stub;
import ui.blservice.searchblservice;

public class searchbl_driver {

	searchblservice searchbl = new searchbl_stub();
	
	public void drive(searchbl search) {
		search.setAddress("XianLinBigRoad");
		search.setDistrict("NanjingQixia");
		search.getHotelList();
		search.getRoomList("88888888");
	}
	
	public static void main(String[] args) {
		searchbl_driver driver = new searchbl_driver();
		driver.drive(new searchbl());
	}
}
