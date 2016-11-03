package ui.blservice;

import java.util.ArrayList;

import vo.userVO;

public interface userblservice {

	public userVO getUser(String userID);
	public boolean updateUser(userVO user);
	public boolean addUser(userVO user);
	public boolean deleteUser(userVO user);
	public ArrayList<userVO> getList(String limit);
}
