package bl.stub;

import ui.controller.RoomController;
import vo.RoomVO;

public class RoomBLStub implements RoomController {

	@Override
	public void addRoom(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----新添房间———");
	}

	@Override
	public RoomVO findRoom(String num) {
		// TODO Auto-generated method stub
		System.out.println("----查找房间———");
		return new RoomVO(true, "512",0, 280);
	}

	@Override
	public void updateRoom(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----更新房间----");
	}

}
