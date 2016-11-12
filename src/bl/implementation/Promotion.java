package bl.implementation;

import ui.controller.PromotionController;
import vo.PromotionVO;

public class Promotion implements PromotionController {
	
	public PromotionVO getPromotion(String promotionID){
		return null;
	}
	
    public boolean addPromotion(PromotionVO promotion) {
		return true;
	}
    
    public boolean delPromotion(PromotionVO promotion) {
		return true;
	}
    
    public boolean changePromotion(PromotionVO promotion) {
		return true;
	}
    
    public PromotionVO[] getPromotionList() {
		return null;
    }
    
}
