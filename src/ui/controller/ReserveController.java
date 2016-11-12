package ui.controller;

import vo.DateVO;
import vo.PromotionVO;

public interface ReserveController {

	public void setDate(DateVO date);
	public void setDays(int days);
	public void setPromotion(PromotionVO promotion);
	public double getPrice();
}
