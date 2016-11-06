package bl.implementation;

import ui.blservice.reserveblservice;
import vo.*;

public class reserve implements reserveblservice {
	
	@SuppressWarnings("unused")
	private dateVO date;
	@SuppressWarnings("unused")
	private int days;
	@SuppressWarnings("unused")
	private promotionVO promotion;
	private double price;
	
	public reserve() {
		date = null;
		days = 0;
		promotion = null;
		price = 0;
	}
	
	public void setDate(dateVO date) {
		this.date = date;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public void setPromotion(promotionVO promotion) {
		this.promotion = promotion;
	}
	
	public double getPrice(roomVO room, int days, promotionVO promotion) {
		return price;
	}
}
