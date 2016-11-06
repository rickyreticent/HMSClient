package bl.mock;

import vo.orderVO;

/**
 * �ṩ�����Ļ�����Ϣ������������,�ṩ���Ķ�����״̬������״̬���쳣״̬������״̬��
 * @author �����
 * @version 2016-11-04 10:52
 * @param type
 *    ��������
 * @param roomNUM 
 *    �����
 * @param price
 *    ���䵥��
 * @param isCancel
 *    ���䳷��״̬       
 * @param isAbnormal
 *    �����쳣״̬      
 *
 */
public class MockOrder extends orderVO{
	private String checkInTime;
	private int days;
	private int roomType;
	private int roomNumber;
	private String promotion;
	private double price;
	private boolean isCancel;
	private boolean isAbnormal;
	
	//庄庄加的,构造方法里面也加了,是第一个
	private String orderID;
	public String getOrderID() {
		return orderID;
	}
	//庄庄加到这，没有这些，assert测试不会通过
	
	public MockOrder(String orID,String ci, int da, int rt, int rn, String pro,double pri,boolean ic,boolean ia) {
		/**
		 *  ����MockOrder�ķ�����ȷ����������͡�����ź͵���
		 *  @param ci 
		 *    ��סʱ��
		 *  @param da
		 *    ��ס����
		 *  @param rt
		 *    ��������
		 *  @param rn
		 *    ��������      
		 *  @param pro
		 *    Ӫ������ 
		 *  @param pri
		 *    �����ܼ۸�
		 * @param isCancel
		 *    ���䳷��״̬       
		 * @param isAbnormal
		 *    �����쳣״̬      
		 */
		orderID=orID;
		checkInTime=ci;
		days=da;
		roomType=rt;
		roomNumber=rn;
		promotion=pro;
		price=pri;
		isCancel=ic;
		isAbnormal=ia;
	}
	public String getCheckInTime(){
		/**
		 * �鿴��סʱ��
		 * @return ���ַ���Ϊ�������סʱ��
		 * @author �����
		 * @version 2016-11-04 11:29
		 */
		return checkInTime;
	}
	public int getDays(){
		/**
		 * �鿴��ס����
		 * @return ������Ϊ�������ס����
		 * @author �����
		 * @version 2016-11-04 11:30
		 */
		return days;
	}
	public int getRoomType(){
		/**
		 * �鿴ס������
		 * @return ������Ϊ�������סʱ��
		 * @author �����
		 * @version 2016-11-04 11:30
		 */
		return roomType;
	}
	public int getRoomNumber(){
		/**
		 * �鿴ס������
		 * @return ������Ϊ�����ס������
		 * @author �����
		 * @version 2016-11-04 11:33
		 */
		return roomNumber;
	}
	public String getPromotion(){
		/**
		 * �鿴Ӫ������
		 * @return ���ַ���Ϊ�����Ӫ������
		 * @author �����
		 * @version 2016-11-04 11:35
		 */
		return promotion;
	}
	public double getPrice(){
		/**
		 * �鿴�۸�
		 * @return �Ը�����Ϊ����ļ۸�
		 * @author �����
		 * @version 2016-11-04 11:37
		 */
		return price;
	}
	public boolean Cancel(){
		/**
		 * ����������Ϊ����״̬
		 * @return �Բ���ֵΪ����Ľ���������Ϊ����״̬
		 * @author �����
		 * @version 2016-11-04 11:46
		 */
		if(isCancel) 
			return false;
		isCancel=true;
		return true;
	}
	public boolean Abnormal(){
		/**
		 * ����������Ϊ�쳣״̬
		 * @return �Բ���ֵΪ����Ľ���������Ϊ�쳣״̬
		 * @author �����
		 * @version 2016-11-04 11:46
		 */
		if(isAbnormal) 
			return false;
		isAbnormal=true;
		return true;
	}
	public boolean CancelAbnormal(){
		/**
		 * �����߳ɹ����쳣��������Ϊ����״̬
		 * @return �Բ���ֵΪ����Ľ��쳣��������Ϊ����״̬
		 * @author �����
		 * @version 2016-11-04 11:50
		 */
		if(isCancel) 
			return false;
		isCancel=false;
		return true;
	}
}
