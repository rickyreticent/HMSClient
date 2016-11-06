package bl.implementation;

import java.util.ArrayList;

import ui.blservice.userblservice;
import vo.userVO;

public class user implements userblservice{

	public userVO getUser(String userID){
		return null;
	}
	
	public boolean updateUser(userVO user){
		return true;
	}
	
	public boolean addUser(userVO user){
		return true;
	}
	
	public boolean deleteUser(userVO user){
		return true;
	}
	
	public ArrayList<userVO> getList(String limit){
		return null;
	}
}
