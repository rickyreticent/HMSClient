package bl.implementation;

import java.util.List;

import ui.blservice.hotelblservice;
import vo.hotelVO;
import vo.orderVO;
import vo.roomVO;

public class hotel implements hotelblservice{

	public order ordermanager=new order();
	private String ID;
	private hotelVO VO;
	private String name;
	private String address;
	private String level;
	private String district;
	
	public hotel(String hotelID, String name, String address, String level, String district){
		setID(hotelID);
		VO=new hotelVO(hotelID, name, address, level, district);
		this.setName(name);
		this.setAddress(address);
		this.setLevel(level);
		this.setDistrict(district);
	}
	
	public List<orderVO> getOrderList (String hotelID,String time){
		if(ID.equals(hotelID)){
			return ordermanager.getOrderList();
		}
		else{
			return null;
		}
	}
	public orderVO getOrder(String orderID){
		return ordermanager.getOrder(orderID);
	}
	public hotelVO getHotelInformat (String hotelID){
		return VO;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}