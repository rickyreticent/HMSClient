package ui.blservice;
import vo.orderVO;

public interface orderblservice {
	public orderVO getOrder();
	public boolean addOrder(orderVO order);
	public boolean cancelOrder(orderVO order) ;
	public boolean abnormalOrder(orderVO order);
	public boolean cancelAbnormalOrder(orderVO order);
	public orderVO[] getOrderList();
}
