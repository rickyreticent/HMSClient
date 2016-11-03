package ui.blservice;

import vo.dateVO;
import vo.promotionVO;
import vo.roomVO;

public interface reserveblservice {

	public void setDate(dateVO date);
	public void setDays(int days);
	public void setPromotion(promotionVO promotion);
	public double getPrice(roomVO room, int days, promotionVO promotion);
}
