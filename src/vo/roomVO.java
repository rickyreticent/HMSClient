package vo;

public class roomVO {

	private boolean valid;
	private int number;
	private Room_Type type;
	private double price;
	
	public roomVO() {
		
	}
	
	public roomVO(boolean valid, int number,Room_Type type,int price){
		this.valid =valid;
		this.number=number;
		this.type=type;
		this.price =price;
	}
	
	public boolean getValid(){
		return valid;
	}
	
	public int getNumber(){
		return number;
	}
	
	public Room_Type getRoomType(){
		return type;
	}
	
	public double getPrice(){
		return price;
	}
}
