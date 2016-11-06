package bl.mock;

import vo.promotionVO;

/**
 * Promotion的Mock类
 * @author CROFF
 * @version 2016-11-05 11:45
 */
public class MockPromotion extends promotionVO {
	
	String birthday;
	int roomNumber;
	boolean isCoordinate;
	String date;
	boolean isVIP;
	String district;
	
	/**
	 * 构造MockPromotion的方法
	 * @param birthday
	 * @param roomNumber
	 * @param isCoordinate
	 * @param date
	 * @param isVIP
	 * @param district
	 */
	public MockPromotion(String birthday, int roomNumber, boolean isCoordinate, String date, boolean isVIP, String district) {
		super(birthday, roomNumber, isCoordinate, date, isVIP, district);
	}
	
	/**
	 * 设置生日
	 * @param birthday 生日
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * 获取生日
	 * @return 生日
	 */
	public String getBirday(){
		return birthday;
	}
	
	/**
	 * 设置客房号码
	 * @param roomNumber 客房号码
	 */
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	/**
	 * 获取客房号码
	 * @return 客房号码
	 */
	public int getRoomNumber(){
		return roomNumber;
	}
	
	/**
	 * 设置是否有合作企业优惠
	 * @param coordinate 是否有合作企业优惠
	 */
	public void setCoodinate(boolean coordinate){
		this.isCoordinate = coordinate;
	}
	
	/**
	 * 获取是否有合作企业优惠
	 * @return 是否有合作企业优惠
	 */
	public boolean getCoordinate(){
		return isCoordinate;
	}
	
	/**
	 * 设置入住日期
	 * @param date 入住日期
	 */
	public void setDate(String date){
		this.date = date;
	}
	
	/**
	 * 获取入住日期
	 * @return 入住日期
	 */
	public String getDate(){
		return date;
	}
	
	/**
	 * 设置是否有VIP优惠
	 * @param VIP 是否有VIP优惠
	 */
	public void setVIP(boolean VIP){
		this.isVIP = VIP;
	}
	
	/**
	 * 获取是否有VIP优惠
	 * @return 是否有VIP优惠
	 */
	public boolean getVIP(){
		return isVIP;
	}
	
	/**
	 * 设置目标酒店的商圈
	 * @param district 目标酒店的商圈
	 */
	public void setDistrict(String district){
		this.district = district;
	}
	
	/**
	 * 获取目标酒店的商圈
	 * @return 目标酒店的商圈
	 */
	public String getDistrict(){
		return district;
	}
	
}
