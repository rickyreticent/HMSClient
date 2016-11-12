package bl.stub;

import java.util.ArrayList;

import vo.HotelVO;
import vo.MemberVO;
import vo.UserRole;
import ui.blservice.UserBLService;

public class UserBLStub implements UserBLService {

	private String ID="541322049";
	private String phone="541322049";
	private String password="DREAMING";
	private String name="zhangxinyue";
	private String birth="16263";
	private UserRole role;
	private double credit=5;
	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();

	public UserBLStub() {
		list.add(new MemberVO(ID,password, name, birth, phone, credit));
	}
	
	@Override
	public MemberVO getMember(String userID) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getMemberID().equals(userID)){
				System.out.println("----查找用户———");
				return list.get(i);
			}
		}
		System.out.println("----未找到（查找用户）———");
		return null;
	}

	@Override
	public boolean updateMember(MemberVO member) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getTel().equals(member.getMemberID())){
				list.remove(i);
				list.add(member);
			}
		}
		System.out.println("----更新———");
		return true; 
	}

	@Override
	public boolean addMember(MemberVO member) {
		// TODO Auto-generated method stub
//		ID=user.getID();
//		password=user.getPassword();
//		name=user.getName();
//		role=user.getUserRole();
		list.add(new MemberVO(ID,password, name, birth, phone, credit));
		System.out.println("----新添———");
		return true;
	}

	@Override
	public boolean deleteMember(MemberVO member) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getTel().equals(member.getMemberID())){
				list.remove(i);
			}
		}
		System.out.println("----删除———");
		return true;
	}

	@Override
	public ArrayList<MemberVO> getMemberList(String limit) {
		// TODO Auto-generated method stub
		System.out.println("----查看列表———");
		return list;
	}
	@Override
	public HotelVO getHotel(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean updateHotel(HotelVO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addHotel(HotelVO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean deleteHotel(HotelVO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ArrayList<HotelVO> getHotelList(String limit) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserRole getRole() {
		return role;
	}
	
	public void setRole(UserRole role) {
		this.role = role;
	}

}
