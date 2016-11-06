package ui.blservice;

import java.util.ArrayList;

import vo.MemberVO;

public interface MemberBLService {

	public MemberVO getMInformation (String memberID);
	public boolean saveMInformation (String memberID,MemberVO M);
	public ArrayList<String> getCreditList (String memberID);
}
