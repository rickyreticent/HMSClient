package bl.dataservice;

import java.util.ArrayList;

import po.hotelPO;
import po.memberPO;

public interface userData {
	public boolean addMember(memberPO member);
	public boolean deleteMember(memberPO member);
	public ArrayList<memberPO> getMemberList(String limit);	
	public boolean addHotel(hotelPO hotel);
	public boolean deleteHotel(hotelPO hotel);
	public ArrayList<hotelPO> getHotelList(String limit);
}
