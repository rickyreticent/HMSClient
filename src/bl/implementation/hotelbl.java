package bl.implementation;

import java.util.ArrayList;

import ui.blservice.hotelblservice;
import vo.hotelVO;
import vo.memberVO;
import vo.orderVO;
import vo.roomVO;

public class hotelbl implements hotelblservice{

	public memberVO getMInformation(String memberID){
		return null;
	}
	public ArrayList<orderVO> getOrderList (String hotelID,String time){
		return null;
	}
	public orderVO getOrder(String orderID){
		return null;
	}
	public hotelVO getHotelInformat (String hotelID){
		return null;
	}
	public boolean updataOrder (String orderID,orderVO OR){
		return false;
	}
	public boolean updataHotelInformat (String hotelID,hotelVO HO){
		return false;
	}
	public boolean check (String orderID,String memberID,String roomID,roomVO RO,int mark){
		return false;
	}
}