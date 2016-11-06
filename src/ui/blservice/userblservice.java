package ui.blservice;

import java.util.ArrayList;

import vo.hotelVO;
import vo.memberVO;

public interface userblservice {
	public hotelVO getHotel(String hotelID);
	public boolean updateHotel(hotelVO hotel);
	public boolean addHotel(hotelVO hotel);
	public boolean deleteHotel(hotelVO hotel);
	public ArrayList<hotelVO> getHotelList(String limit);
	public memberVO getMember(String memberID);
	public boolean updateMember(memberVO member);
	public boolean addMember(memberVO member);
	public boolean deleteMember(memberVO member);
	public ArrayList<memberVO> getMemberList(String limit);
}
