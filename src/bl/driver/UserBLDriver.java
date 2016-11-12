package bl.driver;

import bl.stub.UserBLStub;
import ui.blservice.UserBLService;
import vo.MemberVO;

public class UserBLDriver {
	
	UserBLService userbl = new UserBLStub();;
	
	public void drive(MemberVO uservo){
		System.out.println(userbl.addMember(uservo));
		System.out.println(userbl.updateMember(uservo));
		System.out.println(userbl.deleteMember(uservo));
		System.out.println(userbl.getMember("541322049"));
		System.out.println(userbl.getMemberList("limit"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserBLDriver driver =new UserBLDriver();
		driver.drive(new MemberVO("12545663","sdas asd ", "110", "110", "123456", 5000));
	}

}
