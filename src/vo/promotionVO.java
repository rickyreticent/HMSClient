package vo;

public class promotionVO {
	
	dateVO birthday;
	int roomNumber;
	boolean coordinate;
	dateVO date;
	boolean VIP;
	String district;
	double discount;
	
	public promotionVO(dateVO b, int rn, boolean c, dateVO da, boolean v, String di, double dis) {
		birthday = b;
		roomNumber = rn;
		coordinate = c;
		date = da;
		VIP = v;
		district = di;
		discount = dis;
	}
	
	public dateVO getBirthday() {
		return birthday;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public boolean getCoordinate() {
		return coordinate;
	}
	
	public dateVO getDate() {
		return date;
	}
	
	public boolean getVIP() {
		return VIP;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setBirthday(dateVO birthday) {
		this.birthday = birthday;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setCoodinate(boolean coordinate) {
		this.coordinate = coordinate;
	}
	
	public void setDate(dateVO date) {
		this.date = date;
	}
	
	public void setVIP(boolean VIP) {
		this.VIP = VIP;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
}
