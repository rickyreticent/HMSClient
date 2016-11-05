package bl.stub;

import java.util.ArrayList;

import ui.blservice.memberblservice;
import vo.memberVO;

public class memberBL_Stub implements memberblservice {

	String memberID;
	String name;
	String level;
	int credit;
	int phone;

	public memberBL_Stub(String memberID, String name, String level, int credit, int phone) {
		this.memberID=memberID;
		this.name=name;
		this.level=level;
		this.credit=credit;
		this.phone=phone;
	}
	@Override
	public memberVO getMInformation(String memberID) {
		// TODO Auto-generated method stub
		return new memberVO(memberID, name, level, credit, phone);
	}

	@Override
	public boolean saveMInformation(String memberID, memberVO M) {
		// TODO Auto-generated method stub
		System.out.println("用户信息保存成功");
		return true;
	}

	@Override
	public ArrayList<String> getCreditList(String memberID) {
		// TODO Auto-generated method stub
		ArrayList<String> creditList=new ArrayList<String>();
		creditList.add("2016-10-01			+100");
		return creditList;
	}

	
}
