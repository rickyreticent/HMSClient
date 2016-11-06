package bl.driver;

import bl.stub.promotionbl_stub;
import ui.blservice.promotionblservice;
import vo.dateVO;
import vo.promotionVO;

public class promotionbl_driver {
	promotionblservice promotion = new promotionbl_stub();;
	public void drive(promotionVO uservo){
		System.out.println(promotion.addPromotion(uservo));
		System.out.println(promotion.changePromotion(uservo));
		System.out.println(promotion.delPromotion(uservo));
		System.out.println(promotion.getPromotion("12345678"));
		System.out.println(promotion.getPromotionList());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		promotionbl_driver driver =new promotionbl_driver();
		driver.drive(new promotionVO(new dateVO(1997, 03, 04), 1, false, new dateVO(2015, 03, 21), false,"12345678", 0.8));
	}
}
