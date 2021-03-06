package po;

public class OrderPO {
	String checkInTime;
	String checkOutTime;
	String roomType;
	int roomNumber;
	String promotion;
	double price;
	boolean isCancel;
	boolean isAbnormal;
	
	public OrderPO(String ci, String co, String rt, int rn, String pro, double pri,boolean ic,boolean ia) {
		checkInTime=ci;
		checkOutTime=co;
		roomType=rt;
		roomNumber=rn;
		promotion=pro;
		price=pri;
		isCancel=ic;
		isAbnormal=ia;
	}
	
	public String getCheckInTime(){
		return checkInTime;
	}
	public String getCheckOutTime(){
		return checkOutTime;
	}
	public String getRoomType(){
		return roomType;
	}
	public int getRoomNumber(){
		return roomNumber;
	}
	public String getPromotion(){
		return promotion;
	}
	public double getPrice(){
		return price;
	}
	
	public void setCheckInTime(String checkInTime){
		this.checkInTime=checkInTime;
	}
	public void setCheckOutTime(String checkOutTime){
		this.checkOutTime=checkOutTime;
	}
	public void setRoomType(String roomType){
		this.roomType=roomType;
	}
	public void setRoomNumber(int roomNumber){
		this.roomNumber=roomNumber;
	}
	public void setPromotion(String promotion){
		this.promotion=promotion;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
