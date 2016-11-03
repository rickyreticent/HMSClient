package bl.stub;

import java.util.ArrayList;

import ui.blservice.searchblservice;
import vo.hotelVO;
import vo.roomVO;

public class searchbl_stub implements searchblservice {

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("���õ�ַ");
	}

	@Override
	public void setDistrict(String district) {
		// TODO Auto-generated method stub
		System.out.println("������Ȧ");
	}

	@Override
	public ArrayList<hotelVO> getHotelList() {
		System.out.println("��þƵ��б�");
		return new ArrayList<hotelVO>();
	}

	@Override
	public ArrayList<roomVO> getRoomList(String hotelID) {
		System.out.println("��÷����б�");
		return new ArrayList<roomVO>();
	}

	@Override
	public void setHotelList(ArrayList<hotelVO> hotelList) {
		// TODO Auto-generated method stub
		
	}

}
