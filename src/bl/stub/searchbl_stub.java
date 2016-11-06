package bl.stub;

import java.util.ArrayList;

import ui.blservice.searchblservice;
import vo.hotelVO;
import vo.roomVO;

public class searchbl_stub implements searchblservice {

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("设置地址ַ");
	}

	@Override
	public void setDistrict(String district) {
		// TODO Auto-generated method stub
		System.out.println("设置商圈");
	}

	@Override
	public ArrayList<hotelVO> getHotelList() {
		System.out.println("获取酒店列表");
		return new ArrayList<hotelVO>();
	}

	@Override
	public ArrayList<roomVO> getRoomList(String hotelID) {
		System.out.println("获取客房列表");
		return new ArrayList<roomVO>();
	}

	@Override
	public String getAddress() {
		System.out.println("获取地址");
		return null;
	}

	@Override
	public String getDistrict() {
		System.out.println("获取商圈");
		return null;
	}

}
