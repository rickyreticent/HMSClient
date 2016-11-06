package vo;

public class RoomVO {

	private boolean valid;
	private int number;
	private RoomType type;
	private double price;
	
	public RoomVO() {
		
	}
	
	public RoomVO(boolean valid, int number,RoomType type,int price){
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
	
	public RoomType getRoomType(){
		return type;
	}
	
	public double getPrice(){
		return price;
	}
}
