package ui.blservice;

import vo.PromotionVO;

public interface PromotionBLService {
	public PromotionVO getPromotion(String promotionID);
	public boolean addPromotion(PromotionVO promotion);
	public boolean delPromotion(PromotionVO promotion) ;
	public boolean changePromotion(PromotionVO promotion);
	public PromotionVO[] getPromotionList();
}
