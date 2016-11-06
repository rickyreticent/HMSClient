package ui.blservice;

import java.util.ArrayList;

import vo.hotelVO;
import vo.roomVO;

public interface searchblservice {

	public void setAddress(String address);
	public String getAddress();
	public void setDistrict(String district);
	public String getDistrict();
	public ArrayList<hotelVO> getHotelList();
	public ArrayList<roomVO> getRoomList(String hotelID);
}
