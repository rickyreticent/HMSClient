package bl.driver;

import bl.stub.RoomBLStub;
import ui.controller.RoomController;
import vo.RoomType;
import vo.RoomVO;

public class RoomBLDriver {

	RoomController service = new RoomBLStub();
	
	public RoomBLDriver (RoomVO room) {
		System.out.println(service.addRoom(room));
		System.out.println(service.deleteRoom(room));
		System.out.println(service.getRoom("512"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoomVO room = new RoomVO(true ,521 , RoomType.Normal, 250);
		new RoomBLDriver(room);
	}

}
