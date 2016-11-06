package bl.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bl.mock.*;
import vo.orderVO;
import bl.implementation.*;;
/**
 * 
 * @author	 庄刚轻
 * @version	2016/11/6
 */
public class HotelTest {
	
	private hotel hotel;
	private order order;
	MockOrder order1;
	MockOrder order2;
	@Before
	public void setUp(){
		
		order1=new MockOrder(null, 1, 2, 110	, "50% off", 251, false, false);
		order2=new MockOrder(null, 3, 4, 120	, "40% off", 666, false, false);
		
	}
	
	@Test
	public void testGetOrderList(){
		hotel=new hotel();
		order=new order();
		order.addOrder(order1);
		order.addOrder(order2);
		List<orderVO> List = order.getOrderList();
		
		assertEquals(List.get(0),order1);
		assertEquals(List.get(1),order2);
	}
	
	public void testGetOrder(){
		hotel=new hotel();
		order=new order();
		order.addOrder(order1);
		//assertEquals(,order1);
		//sd
	}
}
