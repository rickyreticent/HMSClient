package bl.stub;

import ui.blservice.reserveblservice;
import vo.dateVO;
import vo.promotionVO;
import vo.roomVO;

public class reservebl_stub implements reserveblservice {

	@Override
	public void setDate(dateVO date) {
		// TODO Auto-generated method stub
		System.out.println("������ס����");
	}

	@Override
	public void setDays(int days) {
		// TODO Auto-generated method stub
		System.out.println("������ס����");
	}

	@Override
	public void setPromotion(promotionVO promotion) {
		// TODO Auto-generated method stub
		System.out.println("����ʹ�õ��Żݲ���");
	}

	@Override
	public double getPrice(roomVO room, int days, promotionVO promotion) {
		// TODO Auto-generated method stub
		System.out.println("���㶩���ܼ�");
		return 100;
	}

}
