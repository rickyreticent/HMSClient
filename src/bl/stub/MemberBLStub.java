package bl.stub;

import java.util.ArrayList;

import ui.blservice.MemberBLService;
import vo.MemberVO;

public class MemberBLStub implements MemberBLService {

	String memberID;
	String name;
	String level;
	String pass;
	double credit;
	String phone;
	String birth;

	public MemberBLStub(String level,String memberID,String pass,String name,String birth,String phone,double credit) {
		this.memberID = memberID;
		this.name = name;
		this.level = level;
		this.credit = credit;
		this.phone = phone;
		this.pass = pass;
		this.birth = birth;
	}
	
	@Override
	public MemberVO getMInformation(String memberID) {
		// TODO Auto-generated method stub
		return new MemberVO(memberID,pass, name, birth, phone, credit);
	}

	@Override
	public boolean saveMInformation(String memberID, MemberVO M) {
		// TODO Auto-generated method stub
		System.out.println("用户信息保存成功");
		return true;
	}

	@Override
	public ArrayList<String> getCreditList(String memberID) {
		// TODO Auto-generated method stub
		ArrayList<String> creditList = new ArrayList<String>();
		creditList.add("2016-10-01			+100");
		return creditList;
	}

}
