package bl.junit.test;

import static org.junit.Assert.*;

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
	MockOrder order1;
	MockOrder order2;
	@Before
	public void setUp(){
		hotel=new hotel("123", null, null, null, null);
		order1=new MockOrder("1100",null, 1, 2, 110	, "50% off", 251, false, false);
		order2=new MockOrder("1101",null, 3, 4, 120	, "40% off", 666, false, false);
		
	}
	
	@Test
	public void testGetOrderList(){
		hotel.ordermanager.addOrder(order1);
		hotel.ordermanager.addOrder(order2);
		List<orderVO> List = hotel.getOrderList(hotel.getID(), null);
		
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
	@Test
	public void testGetHotelInformat(){
		MockHotel temHotel=new MockHotel("123", null, null, null, null, null);
		assertEquals((MockHotel)hotel.getHotelInformat(hotel.getID()),temHotel);
	}
}
