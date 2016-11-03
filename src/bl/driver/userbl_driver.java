package bl.driver;

import bl.stub.userbl_stub;
import po.UserRole;
import ui.blservice.userblservice;
import vo.userVO;

public class userbl_driver {
	
	userblservice userbl = new userbl_stub();;
	
	public void drive(userVO uservo){
		System.out.println(userbl.addUser(uservo));
		System.out.println(userbl.updateUser(uservo));
		System.out.println(userbl.deleteUser(uservo));
		System.out.println(userbl.getUser("541322049"));
		System.out.println(userbl.getList("limit"));
	}
	
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		userbl_driver driver =new userbl_driver();
		driver.drive(new userVO("541322049", "123", "zhangxinyue", UserRole.Saler));
	}

}
