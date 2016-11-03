package bl.implementation;

import java.util.ArrayList;

import ui.blservice.searchblservice;
import vo.*;

public class searchbl implements searchblservice {
	
	private String address;
	private String district;
	private ArrayList<hotelVO> hotelList;
	
	public searchbl() {
		address = null;
		district = null;
		hotelList = null;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public ArrayList<hotelVO> getHotelList() {
		ArrayList<hotelVO> resultList = new ArrayList<hotelVO>();
		
		if(address==null && district==null) {
			return null;
		} else if(address==null) {
			for(int i=0; i<hotelList.size(); i++) {
				if(district.equals(hotelList.get(i).getDistrict())) {
					resultList.add(hotelList.get(i));
				}
			}
			return resultList;
		} else {
			for(int i=0; i<hotelList.size(); i++) {
				if(address.equals(hotelList.get(i).getAddress())) {
					resultList.add(hotelList.get(i));
				}
			}
			return resultList;
		}
	}
	
	public ArrayList<roomVO> getRoomList(String hotelID) {
		for(int i=0; i<hotelList.size(); i++) {
			if(hotelList.get(i).getHotelID().equals(hotelID)) {
				return hotelList.get(i).getRoomList();
			}
		}
		return null;
	}

	public void setHotelList(ArrayList<hotelVO> hotelList) {
		this.hotelList = hotelList;
	}
}
