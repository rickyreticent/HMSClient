package ui.blservice;

import vo.dateVO;
import vo.promotionVO;

public interface reserveblservice {

	public void setDate(dateVO date);
	public void setDays(int days);
	public void setPromotion(promotionVO promotion);
	public double getPrice();
}
