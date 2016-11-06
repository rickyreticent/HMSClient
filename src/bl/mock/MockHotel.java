package bl.mock;

import java.util.ArrayList;

import bl.implementation.hotel;
import vo.hotelVO;
import vo.roomVO;

/**
 * 
 * @author 庄刚轻
 * @version 2016/11/5
 *
 */

public class MockHotel extends hotelVO{
	
	public String hotelID;
	public String name;
	public String address;
	public String level;
	public String district;
	public ArrayList<roomVO> roomList;
	
	/**
	 * @param hotelID 		酒店ID
	 * @param name 			酒店名字
	 * @param address 		酒店地址
	 * @param level 		酒店星级
	 * @param district 		酒店所属商圈
	 */
	
	
	public MockHotel(String hotelID,String name,String address,String level,String district,ArrayList<roomVO> roomList){
		this.hotelID=hotelID;
		this.name=name;
		this.address=address;
		this.level=level;
		this.district=district;
		this.roomList=roomList;
	}
	
	/**
	 * 
	 * @return 	酒店ID
	 */
	public String getHotelID(){
		return hotelID;
	}
	
	/**
	 * 
	 * @return 	酒店名字
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @return 	酒店地址
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * 
	 * @return 	酒店星级
	 */
	public String getLevel(){
		return level;
	}
	
	/**
	 * 
	 * @return 	酒店所属商圈
	 */
	public String getDistrict(){
		return district;
	}
	
	/**
	 * 
	 * @return 	酒店所有房间列表
	 */
	public ArrayList<roomVO> getRoomList(){
		return roomList;
	}
}
