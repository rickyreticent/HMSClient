package ui.blservice;

import vo.RoomVO;

public interface RoomBLService {

	public RoomVO getRoom(String number);
	public boolean addRoom(RoomVO room);
	public boolean deleteRoom(RoomVO room);
}
