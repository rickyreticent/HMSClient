package ui.controller;

import java.util.ArrayList;

import vo.MemberVO;
import vo.OrderVO;

public interface MemberController {

	public MemberVO getMInformation (String memberID);
	public boolean saveMInformation (String memberID,MemberVO M);
	public ArrayList<String> getCreditList (String memberID);
	public String getCredit(String memberID);
	public boolean updateCredit(String memberID,String newCredit);
	public boolean checkCredit(String memberID);
	public OrderVO getOrder(String orderID);
	public ArrayList<OrderVO> gerOrderList(String userID);
	public void cancelOrder(String orderID);
	public ArrayList<OrderVO> getUnOrder(ArrayList<OrderVO> orderList);
	public ArrayList<OrderVO> getAlOrder (ArrayList<OrderVO> orderList);
	public ArrayList<OrderVO> getAandCOrder(ArrayList<OrderVO> orderList);
}
