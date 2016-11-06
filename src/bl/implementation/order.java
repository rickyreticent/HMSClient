package bl.implementation;

import java.util.ArrayList;
import java.util.List;

import vo.orderVO;

public class order {
	
	private ArrayList<orderVO> orderList;
	public order(){
		orderList=new ArrayList<orderVO>();
	}
	
	public orderVO getOrder(){
		return null;
	}
    public boolean addOrder(orderVO order) {
    	orderList.add(order);
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
    public List<orderVO> getOrderList() {
		return orderList;
    }
}
