package ui.blservice;

import vo.roomVO;

public interface roomblservice {

	public roomVO getRoom(String number);
	public boolean addRoom(roomVO room);
	public boolean deleteRoom(roomVO room);
}
