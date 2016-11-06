package ui.blservice;

import java.util.List;

import vo.hotelVO;
import vo.orderVO;
import vo.roomVO;

/**
 * 
 * 
 * @author zgq
 *
 */

public interface hotelblservice {	

	public List<orderVO> getOrderList (String hotelID,String time);
	public orderVO getOrder(String orderID);
	public hotelVO getHotelInformat (String hotelID);
	public boolean updataOrder (String orderID,orderVO OR);
	public boolean updataHotelInformat (String hotelID,hotelVO HO);
	public boolean check (String orderID,String memberID,String roomID,roomVO RO,int mark);
}
