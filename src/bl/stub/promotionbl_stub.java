package bl.stub;

import ui.blservice.promotionblservice;
import vo.dateVO;
import vo.promotionVO;


public class promotionbl_stub implements promotionblservice{
	public promotionVO getPromotion(String promotionID){
		
		return new promotionVO(new dateVO(1997, 3, 4), 1, false, new dateVO(2016, 2, 11), false, promotionID, 0.8);
	}
    public boolean addPromotion(promotionVO promotion) {
		System.out.println("增加成功");
		return true;
	}
    public boolean delPromotion(promotionVO promotion) {
		System.out.println("删除成功");
		return true;
	}
    public boolean changePromotion(promotionVO promotion) {
		System.out.println("更新成功");
		return true;
	}
    public promotionVO[] getPromotionList() {
		
		return null;
    }
}
