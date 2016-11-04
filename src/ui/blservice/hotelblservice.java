package ui.blservice;

import java.util.ArrayList;

import vo.hotelVO;
import vo.memberVO;
import vo.orderVO;
import vo.roomVO;

/**
 * 
 * 
 * @author zz
 *
 */

public interface hotelblservice {	

	public memberVO getMInformation(String memberID);
	public ArrayList<orderVO> getOrderList (String hotelID,String time);
	public orderVO getOrder(String orderID);
	public hotelVO getHotelInformat (String hotelID);
	public boolean updataOrder (String orderID,orderVO OR);
	public boolean updataHotelInformat (String hotelID,hotelVO HO);
	public boolean check (String orderID,String memberID,String roomID,roomVO RO,int mark);
}
