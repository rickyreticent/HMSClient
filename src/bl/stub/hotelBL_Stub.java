package bl.stub;

import java.util.ArrayList;

import ui.blservice.hotelblservice;
import vo.hotelVO;
import vo.memberVO;
import vo.orderVO;
import vo.roomVO;

public class hotelBL_Stub implements hotelblservice{

	String memberID;
	String name;
	String level;
	String address;
	String district;
	int credit;
	int phone;
	String checkInTime;
	String checkOutTime;
	String roomType;
	int roomNumber;
	String promotion;
	double discount;
	double price;
	
	public hotelBL_Stub(String memberID,String name,String level,String address,
			String district,int credit,int phone,String checkInTime,String checkOutTime,
			String roomType,int roomNumber,String promotion,double discount,double price){
		this.memberID=memberID;
		this.name=name;
		this.level=level;
		this.address=address;
		this.district=district;
		this.credit=credit;
		this.phone=phone;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
		this.roomType=roomType;
		this.roomNumber=roomNumber;
		this.promotion=promotion;
		this.district=district;
		this.price=price;
	}
	

	@Override
	public ArrayList<orderVO> getOrderList(String hotelID, String time) {
		// TODO Auto-generated method stub
		ArrayList<orderVO> orderList=new ArrayList<orderVO>();
		orderList.add(new orderVO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price));
		return orderList;
	}

	@Override
	public orderVO getOrder(String orderID) {
		// TODO Auto-generated method stub
		return new orderVO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price);
	}

	@Override
	public hotelVO getHotelInformat(String hotelID) {
		// TODO Auto-generated method stub
		return new hotelVO(hotelID, name, address, level, district);
	}

	@Override
	public boolean updataOrder(String orderID, orderVO OR) {
		// TODO Auto-generated method stub
		System.out.println("订单更新成功");
		return true;
	}

	@Override
	public boolean updataHotelInformat(String hotelID, hotelVO HO) {
		// TODO Auto-generated method stub
		System.out.println("酒店信息更新成功");
		return true;
	}

	@Override
	public boolean check(String orderID, String memberID, String roomID, roomVO RO, int mark) {
		// TODO Auto-generated method stub
		if(mark==1){
			System.out.println("入住成功");
			return true;
		}
		else if(mark==0){
			System.out.println("退房成功");
			return true;
		}
		else{
			System.out.println("操作失败");
			return false;
		}
	}
	
}