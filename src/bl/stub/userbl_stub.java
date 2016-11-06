package bl.stub;

import java.util.ArrayList;

import vo.UserRole;
import ui.blservice.userblservice;
import vo.userVO;

public class userbl_stub implements userblservice{

	private String ID="541322049";
	private String password="DREAMING";
	private String name="zhangxinyue";
	private UserRole role;
	private ArrayList<userVO> list = new ArrayList<userVO>();

	public userbl_stub () {
		list.add(new userVO(ID, password, name, role));
	}
	@Override
	public userVO getUser(String userID) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(userID)){
				System.out.println("----查找用户———");
				return list.get(i);
			}
		}
		System.out.println("----未找到（查找用户）———");
		return null;
	}

	@Override
	public boolean updateUser(userVO user) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(user.getID())){
				list.remove(i);
				list.add(user);
			}
		}
		System.out.println("----更新———");
		return true; 
	}

	@Override
	public boolean addUser(userVO user) {
		// TODO Auto-generated method stub
		ID=user.getID();
		password=user.getPassword();
		name=user.getName();
		role=user.getUserRole();
		list.add(new userVO(ID, password, name, role));
		System.out.println("----新添———");
		return true;
	}

	@Override
	public boolean deleteUser(userVO user) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(user.getID())){
				list.remove(i);
			}
		}
		System.out.println("----删除———");
		return true;
	}

	@Override
	public ArrayList<userVO> getList(String limit) {
		// TODO Auto-generated method stub
		System.out.println("----查看列表———");
		return list;
	}

}
