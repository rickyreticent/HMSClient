package bl.driver;

import bl.stub.memberBL_Stub;
import ui.blservice.memberblservice;
import vo.memberVO;

public class memberBL_driver {
	
	static String memberID="0001";
	static String name="sadasd";
	static String level="max";
	static int credit=5000;
	static int phone=110;
	
	public void drive(memberVO M){
		memberblservice memberBL = new memberBL_Stub(memberID, name,  level, credit, phone);
		System.out.println(memberBL.saveMInformation(memberID, M));
		System.out.println(memberBL.getMInformation(memberID));
		System.out.println(memberBL.getCreditList(memberID));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		memberBL_driver drive =new memberBL_driver();
		drive.drive(new memberVO(memberID, name, level, credit, phone));
	}

}

