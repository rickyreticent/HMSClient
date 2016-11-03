package bl.stub;

import ui.blservice.roomblservice;
import vo.Room_Type;
import vo.roomVO;

public class roombl_stub implements roomblservice {

	@Override
	public roomVO getRoom(String number) {
		// TODO Auto-generated method stub
		System.out.println("----查找房间———");
		return new roomVO(true, 512, Room_Type.Normal, 280);
	}

	@Override
	public boolean addRoom(roomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----新添房间———");
		return true;
	}

	@Override
	public boolean deleteRoom(roomVO room) {
		// TODO Auto-generated method stub
		System.out.println("----删除房间———");
		return true;
	}

}
