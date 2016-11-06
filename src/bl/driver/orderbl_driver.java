package bl.driver;

import bl.stub.orderbl_stub;
import ui.blservice.orderblservice;
import vo.orderVO;

public class orderbl_driver {
orderblservice orderbl = new orderbl_stub();;
	
	public void drive(orderVO ordervo){
		System.out.println(orderbl.addOrder(ordervo));
		System.out.println(orderbl.abnormalOrder(ordervo));
		System.out.println(orderbl.cancelOrder(ordervo));
		System.out.println(orderbl.cancelAbnormalOrder(ordervo));
		System.out.println(orderbl.getOrder());
		System.out.println(orderbl.getOrderList());
	}
	
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			orderbl_driver driver =new orderbl_driver();
		driver.drive(new orderVO("1997-2-2", "1997-2-5", 1, 2, "��", 0, 450, "123"));
	}
}
