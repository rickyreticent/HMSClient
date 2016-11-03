package ui.blservice;

import java.util.ArrayList;

import vo.hotelVO;
import vo.roomVO;

public interface searchblservice {

	public void setAddress(String address);
	public void setDistrict(String district);
	public ArrayList<hotelVO> getHotelList();
	public ArrayList<roomVO> getRoomList(String hotelID);
	public void setHotelList(ArrayList<hotelVO> hotelList);
}
