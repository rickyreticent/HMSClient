package bl.stub;

import ui.controller.RoomController;
import vo.RoomType;
import vo.RoomVO;

public class RoomBLStub implements RoomController {

	@Override
	public RoomVO getRoom(String number) {
		// TODO Auto-generated method stub
		System.out.println("----查找房间———");
		return new RoomVO(true, 512, RoomType.Normal, 280);
	}

	@Override
	public boolean addRoom(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----新添房间———");
		return true;
	}

	@Override
	public boolean deleteRoom(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----删除房间———");
		return true;
	}

}
