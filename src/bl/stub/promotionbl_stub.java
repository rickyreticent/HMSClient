package bl.stub;

import ui.blservice.promotionblservice;
import vo.promotionVO;


public class promotionbl_stub implements promotionblservice{
	public promotionVO getPromotion(String promotionID){
		System.out.println("�ɹ��õ�����");
		return new promotionVO("1997-3-4", 1, false, "2016-2-11", false, promotionID);
	}
    public boolean addPromotion(promotionVO promotion) {
		System.out.println("��ӳɹ�");
		return true;
	}
    public boolean delPromotion(promotionVO promotion) {
		System.out.println("ɾ���ɹ�");
		return true;
	}
    public boolean changePromotion(promotionVO promotion) {
		System.out.println("�޸ĳɹ�");
		return true;
	}
    public promotionVO[] getPromotionList() {
		System.out.println("�ɹ��õ��б�");
		return null;
    }
}
