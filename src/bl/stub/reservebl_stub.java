package bl.stub;

import ui.blservice.reserveblservice;
import vo.dateVO;
import vo.promotionVO;

public class reservebl_stub implements reserveblservice {

	@Override
	public void setDate(dateVO date) {
		// TODO Auto-generated method stub
		System.out.println("设置入住日期成功");
	}

	@Override
	public void setDays(int days) {
		// TODO Auto-generated method stub
		System.out.println("设置入住天数成功");
	}

	@Override
	public void setPromotion(promotionVO promotion) {
		// TODO Auto-generated method stub
		System.out.println("设置促销策略成功");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		System.out.println("获取订单价值成功");
		return 100;
	}

}
