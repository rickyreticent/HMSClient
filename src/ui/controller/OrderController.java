package ui.controller;
import vo.OrderVO;

public interface OrderController {
	public OrderVO getOrder();
	public boolean addOrder(OrderVO order);
	public boolean cancelOrder(OrderVO order) ;
	public boolean abnormalOrder(OrderVO order);
	public boolean cancelAbnormalOrder(OrderVO order);
	public OrderVO[] getOrderList();
}
