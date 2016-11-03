package ui.presentation;

import vo.orderVO;

public class orderui {
	private class order_main{
		protected orderVO getOrder(String orderID){
			return null;
		}
	    protected boolean addOrder(orderVO order) {
			return true;
		}
	    protected boolean cancelOrder(orderVO order) {
			return true;
		}
	    protected boolean abnormalOrder(orderVO order) {
			return true;
		}
	    protected boolean cancelAbnormalOrder(orderVO order) {
			return true;
		}
	    protected orderVO[] getOrderList() {
			return null;
	    }
	}
}
