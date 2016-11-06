package bl.driver;

import bl.stub.hotelBL_Stub;
import ui.blservice.hotelblservice;
import vo.hotelVO;
import vo.orderVO;
import vo.roomVO;

public class hotelBL_driver {
	static String hotelID="0111";
	static String memberID="0011";
	static String orderID="0001";
	static String time="2016-1-1";
	
	static String name="zgq";
	static String level="max";
	static String address="some place";
	static String district="wangda";
	static int credit=5000;
	static int phone=110;
	static String checkInTime="2016-10-01";
	static String checkOutTime="2016-10-01";
	static int roomType=1;
	static int roomNumber=110;
	static String promotion="best";
	static double discount=100;
	static double price=10;
	
	static String roomID="0000";
	static roomVO RO=new roomVO(true, 111, null,(int) price);
	
	public void drive(hotelblservice H	){
		System.out.println(H.getHotelInformat(hotelID));
		System.out.println(H.check(orderID, memberID, roomID, RO, 0));
		System.out.println(H.getOrder(orderID));
		System.out.println(H.getOrderList(hotelID, time));
		//System.out.println(H.getMInformation(memberID));
		System.out.println(H.updataHotelInformat(hotelID, new hotelVO(hotelID, name, address, level, district)));
		System.out.println(H.updataOrder(orderID, new orderVO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price, "123")));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hotelblservice H=new hotelBL_Stub(memberID, name, level, address, district, credit, phone, checkInTime, checkOutTime, roomType, roomNumber, promotion, discount, price);
		hotelBL_driver drive=new hotelBL_driver();
		drive.drive(H);
	}

}
