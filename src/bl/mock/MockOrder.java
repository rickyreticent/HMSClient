package bl.mock;

import vo.orderVO;

/**
 * 提供订单的基本信息（包括订单）,提供更改订单的状态（撤销状态、异常状态、正常状态）
 * @author 徐亚婧
 * @version 2016-11-04 10:52
 * @param type
 *    房间类型
 * @param roomNUM 
 *    房间号
 * @param price
 *    房间单价
 * @param isCancel
 *    房间撤销状态       
 * @param isAbnormal
 *    房间异常状态      
 *
 */
public class MockOrder {
	private String checkInTime;
	private int days;
	private int roomType;
	private int roomNumber;
	private String promotion;
	private double price;
	private boolean isCancel;
	private boolean isAbnormal;
	
	public MockOrder(String ci, int da, int rt, int rn, String pro,double pri,boolean ic,boolean ia) {
		/**
		 *  构造MockOrder的方法，确定房间的类型、房间号和单价
		 *  @param ci 
		 *    入住时间
		 *  @param da
		 *    入住天数
		 *  @param rt
		 *    房间类型
		 *  @param rn
		 *    房间数量      
		 *  @param pro
		 *    营销策略 
		 *  @param pri
		 *    订单总价格
		 * @param isCancel
		 *    房间撤销状态       
		 * @param isAbnormal
		 *    房间异常状态      
		 */
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
		 * 查看入住时间
		 * @return 以字符串为代表的入住时间
		 * @author 徐亚婧
		 * @version 2016-11-04 11:29
		 */
		return checkInTime;
	}
	public int getDays(){
		/**
		 * 查看入住天数
		 * @return 以整数为代表的入住天数
		 * @author 徐亚婧
		 * @version 2016-11-04 11:30
		 */
		return days;
	}
	public int getRoomType(){
		/**
		 * 查看住房类型
		 * @return 以整数为代表的入住时间
		 * @author 徐亚婧
		 * @version 2016-11-04 11:30
		 */
		return roomType;
	}
	public int getRoomNumber(){
		/**
		 * 查看住房数量
		 * @return 以整数为代表的住房数量
		 * @author 徐亚婧
		 * @version 2016-11-04 11:33
		 */
		return roomNumber;
	}
	public String getPromotion(){
		/**
		 * 查看营销策略
		 * @return 以字符串为代表的营销策略
		 * @author 徐亚婧
		 * @version 2016-11-04 11:35
		 */
		return promotion;
	}
	public double getPrice(){
		/**
		 * 查看价格
		 * @return 以浮点数为代表的价格
		 * @author 徐亚婧
		 * @version 2016-11-04 11:37
		 */
		return price;
	}
	public boolean Cancel(){
		/**
		 * 将订单设置为撤销状态
		 * @return 以布尔值为代表的将订单设置为撤销状态
		 * @author 徐亚婧
		 * @version 2016-11-04 11:46
		 */
		if(isCancel) 
			return false;
		isCancel=true;
		return true;
	}
	public boolean Abnormal(){
		/**
		 * 将订单设置为异常状态
		 * @return 以布尔值为代表的将订单设置为异常状态
		 * @author 徐亚婧
		 * @version 2016-11-04 11:46
		 */
		if(isAbnormal) 
			return false;
		isAbnormal=true;
		return true;
	}
	public boolean CancelAbnormal(){
		/**
		 * 将申诉成功的异常订单设置为撤销状态
		 * @return 以布尔值为代表的将异常订单设置为撤销状态
		 * @author 徐亚婧
		 * @version 2016-11-04 11:50
		 */
		if(isCancel) 
			return false;
		isCancel=false;
		return true;
	}
}
