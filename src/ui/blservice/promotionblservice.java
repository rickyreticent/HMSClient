package ui.blservice;

import vo.promotionVO;

public interface promotionblservice {
	public promotionVO getPromotion(String promotionID);
	public boolean addPromotion(promotionVO promotion);
	public boolean delPromotion(promotionVO promotion) ;
	public boolean changePromotion(promotionVO promotion);
	public promotionVO[] getPromotionList();
}
