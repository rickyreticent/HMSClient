package ui.blservice;

import java.util.ArrayList;

import vo.memberVO;

public interface memberblservice {

	public memberVO getMInformation (String memberID);
	public boolean saveMInformation (String memberID,memberVO M);
	public ArrayList<String> getCreditList (String memberID);
}
