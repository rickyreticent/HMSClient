package ui.controller;

import java.util.ArrayList;

import vo.PromotionVO;

public interface PromotionController {
	public PromotionVO getPromotion(String promotionID);
	public boolean addPromotion(PromotionVO promotion);
	public boolean delPromotion(PromotionVO promotion) ;
	public boolean changePromotion(PromotionVO promotion);
	public ArrayList<PromotionVO> getPromotionList();
}
