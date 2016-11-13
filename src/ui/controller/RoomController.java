package ui.controller;

import vo.RoomVO;

/**
 * 
 * @author 张新悦
 * @version 2016-11-04 
 *
 */
public interface RoomController {

	public boolean addRoom(RoomVO room);
	public RoomVO findRoom(String num);
	public boolean updateRoom(RoomVO room);
}
