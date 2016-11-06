package bl.junit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bl.mock.*;
import vo.OrderVO;
import bl.implementation.*;;
/**
 * 
 * @author	 庄刚轻
 * @version	2016/11/6
 */
public class HotelTest {
	
	private Hotel hotel;
	MockOrder order1;
	MockOrder order2;
	@Before
	public void setUp(){
		hotel=new Hotel("123", null, null, null, null);
		order1=new MockOrder("1100",2, null, 1, 2, 110	, "50% off", 251 );
		order2=new MockOrder("1101",2, null, 3, 4, 120	, "40% off", 666);
		
	}
	
	@Test
	public void testGetOrderList(){
		hotel.ordermanager.addOrder(order1);
		hotel.ordermanager.addOrder(order2);
		List<OrderVO> List = hotel.getOrderList(hotel.getID(), null);
		
		assertEquals(List.get(0),order1);
		assertEquals(List.get(1),order2);
	}
	@Test
	public void testGetOrder(){
		hotel.ordermanager.addOrder(order1);
		hotel.ordermanager.addOrder(order2);
		assertEquals((MockOrder)hotel.getOrder("1100"),order1);
		assertEquals((MockOrder)hotel.getOrder("1101"),order2);
	}
//	@Test
//	public void testGetHotelInformat(){
//		MockHotel temHotel=new MockHotel("123", null, null, null, null, null);
//		assertEquals((MockHotel)hotel.getHotelInformat(hotel.getID()),temHotel);
//	}
	@Test
	public void testUpdataOrder(){
		hotel.ordermanager.addOrder(order1);
		MockOrder order3=new MockOrder("1100",2, null, 3, 4, 120	, "40% off", 666);
		hotel.updataOrder(order1.getOrderID(), order3);
		assertEquals(hotel.getOrder(order1.getOrderID()),order3);
	}
	@Test
	public void testDelay(){
		MockOrder order3=new MockOrder("1110",3, null, 3, 4, 120	, "40% off", 666);
		hotel.ordermanager.addOrder(order3);
		hotel.delay(order3.getOrderID());
		order3.setState(2);
		assertEquals(hotel.getOrder(order3.getOrderID()),order3);
	}
}
