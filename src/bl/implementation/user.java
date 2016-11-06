package bl.implementation;

import java.util.ArrayList;

import bl.dataservice.hotelData;
import bl.dataservice.memberData;
import bl.dataservice.userData;
import po.hotelPO;
import po.memberPO;
import ui.blservice.userblservice;
import vo.hotelVO;
import vo.memberVO;

public class user implements userblservice{

	private hotelVO hotel;
	private memberVO member;
	private ArrayList<hotelVO> hotels;
	private ArrayList<memberVO> members;
	private hotelData hot;
	private memberData mem;
	private userData user;
	
	@Override
	public hotelVO getHotel(String hotelID) {
		// TODO Auto-generated method stub
		if(hotel.getHotelID().equals(hotelID))return hotel;
		for (hotelVO temp : hotels) {
			if(temp.getHotelID().equals(hotelID)){
				hotel=temp;
				return temp;
			}
		}
		hotelPO temp=hot.getHotelInformat(hotelID);
		hotel.setAddress(temp.getAddress());
		hotel.setDistrict(temp.getDistrict());
		hotel.setHotelID(temp.getHotelID());
		hotel.setLevel(temp.getLevel());
		hotel.setName(temp.getName());
		//hotel.setRoomList(temp.getRoomList());		
		return hotel;
	}

	@Override
	public boolean updateHotel(hotelVO hotel) {
		// TODO Auto-generated method stub
		this.hotel=hotel;
		hotelPO temp = new hotelPO(hotel.getHotelID(), hotel.getName(), hotel.getAddress(), hotel.getLevel(), hotel.getDistrict());
		hot.updataHotelInformat(hotel.getHotelID(), temp);
		return true;
	}

	@Override
	public boolean addHotel(hotelVO hotel) {
		// TODO Auto-generated method stub
		this.hotel=hotel;
		hotelPO temp = new hotelPO(hotel.getHotelID(), hotel.getName(), hotel.getAddress(), hotel.getLevel(), hotel.getDistrict());
		user.addHotel(temp);
		return true;
	}

	@Override
	public boolean deleteHotel(hotelVO hotel) {
		// TODO Auto-generated method stub
		this.hotel=hotel;
		hotelPO temp = new hotelPO(hotel.getHotelID(), hotel.getName(), hotel.getAddress(), hotel.getLevel(), hotel.getDistrict());
		user.deleteHotel(temp);
		return true;
	}

	@Override
	public ArrayList<hotelVO> getHotelList(String limit) {
		// TODO Auto-generated method stub
		ArrayList<hotelPO> temp=user.getHotelList(limit);
		for (hotelPO h : temp) {
			hotels.add(			new hotelVO(h.getHotelID(), h.getName(), h.getAddress(), h.getLevel(), h.getDistrict()));
		}
		return hotels;
	}

	@Override
	public memberVO getMember(String memberID) {
		// TODO Auto-generated method stub
		if(member.getMemberID().equals(memberID))return member;
		for (memberVO temp : members) {
			if(temp.getMemberID().equals(memberID)){
				member=temp;
				return temp;
			}
		}
		memberPO temp=mem.getMInformation(memberID);
		member.setCredit(temp.getCredit());
		member.setBirthday(temp.getBirthday());
		member.setMemberID(temp.getMemberID());
		member.setName(temp.getName());
		member.setPassword(temp.getPassword());
		member.setTel(temp.getPhone());
		//hotel.setRoomList(temp.getRoomList());		
		return member;
	}

	@Override
	public boolean updateMember(memberVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addMember(memberVO member) {
		// TODO Auto-generated method stub
		this.member=member;
		memberPO temp = new memberPO(member.getMemberID(), member.getName(), member.getPassword(), member.getBirthday(), member.getCredit(), member.getTel());
		mem.saveMInformation(temp.getMemberID(), temp);
		return true;
	}

	@Override
	public boolean deleteMember(memberVO member) {
		// TODO Auto-generated method stub
		this.member=member;
		memberPO temp = new memberPO(member.getMemberID(), member.getName(), member.getPassword(), member.getBirthday(), member.getCredit(), member.getTel());
		user.deleteMember(temp);
		return true;
	}

	@Override
	public ArrayList<memberVO> getMemberList(String limit) {
		// TODO Auto-generated method stub
		ArrayList<memberPO> temp=user.getMemberList(limit);
		for (memberPO m : temp) {
			members.add(new memberVO(m.getMemberID(), m.getPassword(), m.getName(), m.getBirthday(), m.getPhone(), m.getCredit()));
		}
		return members;
	}
}
