package ui.controller;

import vo.RoomVO;

public interface RoomController {

	public RoomVO getRoom(String number);
	public boolean addRoom(RoomVO room);
	public boolean deleteRoom(RoomVO room);
}
