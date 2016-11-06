package bl.driver;

import bl.implementation.reserve;
import bl.stub.reservebl_stub;
import ui.blservice.reserveblservice;
import vo.*;

public class reservebl_driver {

	reserveblservice reservebl = new reservebl_stub();
	
	public void drive(reserve reserve) {
		reserve.setDate(new dateVO(2016, 12, 5));
		reserve.setDays(1);
		reserve.setPromotion(new promotionVO(new dateVO(1997, 06, 01), 5, false, new dateVO(2016, 10, 02), true, "南京市新街口", 0.8));
		reserve.getPrice();
	}
	
	public static void main(String[] args) {
		reservebl_driver driver = new reservebl_driver();
		driver.drive(new reserve(500));
	}
}
