package bl.stub;

import ui.blservice.orderblservice;
import vo.orderVO;

public class orderbl_stub implements orderblservice{
	public orderVO getOrder(){
		return new orderVO("1997-2-2", "1997-2-5", 1, 2, "��", 0, 450);
	}
    public boolean addOrder(orderVO order) {
		return true;
	}
    public boolean cancelOrder(orderVO order) {
		return true;
	}
    public boolean abnormalOrder(orderVO order) {
		return true;
	}
    public boolean cancelAbnormalOrder(orderVO order) {
		return true;
	}
    public orderVO[] getOrderList() {
		return null;
    }
}
