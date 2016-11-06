package bl.implementation;

import ui.blservice.reserveblservice;
import vo.*;

public class reserve implements reserveblservice {
	
	private dateVO date;
	private int days;
	private promotionVO promotion;
	private double singlePrice;
	private double price;
	
	public reserve(int singlePrice) {
		date = null;
		days = 0;
		promotion = null;
		price = 0;
		this.singlePrice = singlePrice;
	}
	
	public void setDate(dateVO date) {
		this.date = date;
	}
	
	public dateVO getDate() {
		return date;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setPromotion(promotionVO promotion) {
		this.promotion = promotion;
	}
	
	public promotionVO getPromotion() {
		return promotion;
	}
	
	public double getPrice() {
		price = singlePrice*days*promotion.getDiscount();
		return price;
	}
}
