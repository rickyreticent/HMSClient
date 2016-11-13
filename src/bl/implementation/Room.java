package bl.implementation;

import bl.dataservice.RoomData;
import po.roomPO;
import ui.controller.RoomController;
import vo.RoomVO;

public class Room implements RoomController {
	
	private RoomVO room;
	private RoomData roomData;
	
	/**
	 * 根据房间号查找房间
	 * @return RoomVO
	 * @author 张新悦
	 * @version 2016-11-13 16:17
	 */
	@Override
	public RoomVO findRoom(String num){
		if(room.getNumber().equals(num)) return room;
		roomPO temp = roomData.getRoom(num);
		room = new RoomVO(temp.getValid(), temp.getNumber(), temp.getRoomType(), temp.getPrice());
		return room;
	}

	/**
	 * 更新房间信息
	 * @author 张新悦
	 * @version 2016-11-13 17:23
	 */
	@Override
	public boolean updateRoom(RoomVO room) {
		// TODO Auto-generated method stub
		this.room=room;
		//roomPO temp = new roomPO(room.isValid(), room.getNumber(), room.getType(), room.getPrice());
		new roomPO(room.isValid(), room.getNumber(), room.getType(), room.getPrice());
		//roomData.updateRoom(temp);
		return true;
	}

	/**
	 * 增加房间
	 * @author 张新悦
	 * @version 2016-11-13 17:33
	 */
	@Override
	public boolean addRoom(RoomVO room) {
		// TODO Auto-generated method stub
		this.room=room;
		//roomPO temp = new roomPO(room.isValid(), room.getNumber(), room.getType(), room.getPrice());
		new roomPO(room.isValid(), room.getNumber(), room.getType(), room.getPrice());
		//roomData.addRoom(temp);
		return true;
	}
	
}
