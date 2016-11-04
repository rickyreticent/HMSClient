package bl.stub;

import ui.blservice.reserveblservice;
import vo.dateVO;
import vo.promotionVO;
import vo.roomVO;

public class reservebl_stub implements reserveblservice {

	@Override
	public void setDate(dateVO date) {
		// TODO Auto-generated method stub
		System.out.println("设置入住日期");
	}

	@Override
	public void setDays(int days) {
		// TODO Auto-generated method stub
		System.out.println("设置入住天数");
	}

	@Override
	public void setPromotion(promotionVO promotion) {
		// TODO Auto-generated method stub
		System.out.println("设置促销策略");
	}

	@Override
	public double getPrice(roomVO room, int days, promotionVO promotion) {
		// TODO Auto-generated method stub
		System.out.println("获取订单价值");
		return 100;
	}

}
