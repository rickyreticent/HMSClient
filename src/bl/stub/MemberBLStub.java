package bl.stub;

import java.util.ArrayList;

import ui.controller.MemberController;
import vo.MemberVO;
import vo.OrderVO;

public class MemberBLStub implements MemberController {

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

	@Override
	public String getCredit(String memberID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCredit(String memberID, String newCredit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkCredit(String memberID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderVO getOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> gerOrderList(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelOrder(String orderID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<OrderVO> getUnOrder(ArrayList<OrderVO> orderList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> getAlOrder(ArrayList<OrderVO> orderList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> getAandCOrder(ArrayList<OrderVO> orderList) {
		// TODO Auto-generated method stub
		return null;
	}

}
