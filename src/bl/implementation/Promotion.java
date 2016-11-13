package bl.implementation;

import java.util.ArrayList;

import ui.controller.PromotionController;
import vo.HotelVO;
import vo.PromotionVO;

public class Promotion implements PromotionController {
	private String ID;
	private PromotionVO promotion;
	private ArrayList<PromotionVO> promotionList = new ArrayList<PromotionVO>();
	
	public PromotionVO getPromotion(String promotionID){
		for(int i=0;i<promotionList.size();i++){
			if(promotionList.get(i).getID().equals(promotionID)){
				return promotionList.get(i);
			}
		}
		return null;
	}
	
    public boolean addPromotion(PromotionVO promotion) {
    	promotionList.add(promotion);
		return true;
	}
    
    public boolean delPromotion(PromotionVO promotion) {
    	promotionList.remove(promotion);
		return true;
	}
    
    public boolean changePromotion(PromotionVO promotion) {
		return true;
	}
    
    public ArrayList<PromotionVO> getPromotionList() {
		return promotionList;
    }
    
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
}
