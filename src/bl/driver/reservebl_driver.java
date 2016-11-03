package bl.driver;

import bl.implementation.reservebl;
import bl.stub.reservebl_stub;
import ui.blservice.reserveblservice;
import vo.*;

public class reservebl_driver {

	reserveblservice reservebl = new reservebl_stub();
	
	public void drive(reservebl reserve) {
		reserve.setDate(new dateVO(2016, 12, 5));
		reserve.setDays(1);
		reserve.setPromotion(new promotionVO(null, 0, false, null, false, null));
		reserve.getPrice(new roomVO(false, 0, null, 0), 0, new promotionVO(null, 0, false, null, false, null));
	}
	
	public static void main(String[] args) {
		reservebl_driver driver = new reservebl_driver();
		driver.drive(new reservebl());
	}
}
