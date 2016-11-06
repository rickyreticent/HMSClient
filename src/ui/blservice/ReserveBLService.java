package ui.blservice;

import vo.DateVO;
import vo.PromotionVO;

public interface ReserveBLService {

	public void setDate(DateVO date);
	public void setDays(int days);
	public void setPromotion(PromotionVO promotion);
	public double getPrice();
}
