package bl.driver;

import bl.stub.roombl_stub;
import ui.blservice.roomblservice;
import vo.Room_Type;
import vo.roomVO;

public class roombl_driver {

	roomblservice service = new roombl_stub();
	
	public roombl_driver (roomVO room) {
		System.out.println(service.addRoom(room));
		System.out.println(service.deleteRoom(room));
		System.out.println(service.getRoom("512"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		roomVO room = new roomVO(true ,521 , Room_Type.Normal, 250);
		roombl_driver driver = new roombl_driver(room);
	}

}
