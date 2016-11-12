package bl.implementation;

import java.util.ArrayList;

import ui.controller.MemberController;
import vo.MemberVO;
import vo.OrderVO;

public class Member implements MemberController {

	public MemberVO getMInformation (String memberID) {
		return null;
	}
	public boolean saveMInformation (String memberID, MemberVO M) {
		return false;
	}
	public ArrayList<String> getCreditList (String memberID) {
		return null;
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