package ui.controller;

import java.util.ArrayList;

import vo.HotelVO;
import vo.RoomVO;

public interface SearchController {

	public void setAddress(String address);
	public String getAddress();
	public void setDistrict(String district);
	public String getDistrict();
	public ArrayList<HotelVO> getHotelList();
	public ArrayList<RoomVO> getRoomList(String hotelID);
}
